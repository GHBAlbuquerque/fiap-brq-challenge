package com.fiap.brq.challenge.controller;

import com.fiap.brq.challenge.model.Candidato;
import com.fiap.brq.challenge.repository.CandidatoRepository;
import com.fiap.brq.challenge.repository.CertificacaoRepository;
import com.fiap.brq.challenge.repository.SkillRepository;
import com.fiap.brq.challenge.service.CandidatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/candidatos")
public class CandidatoController {

    @Autowired
    private CandidatoRepository candidatoRepository;

    @Autowired
    private SkillRepository skillRepository;

    @Autowired
    private CertificacaoRepository certificacaoRepository;

    @Autowired
    private CandidatoService candidatoService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Candidato> listar() {
        return candidatoRepository.findAll();
    }

    @GetMapping("/cpf/{cpf}")
    public ResponseEntity<Candidato> buscarPorCpf(@PathVariable String cpf) {
        var optional = candidatoRepository.findByCpf(cpf);

        return optional.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/nome/{nome}")
    public ResponseEntity<Candidato> buscarPorNome(@PathVariable String nome) {
        var optional = candidatoRepository.findByNome(nome);

        return optional.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/celular/{celular}")
    public ResponseEntity<Candidato> buscarPorCelular(@PathVariable String celular) {
        var optional = candidatoRepository.findByCelular(celular);

        return optional.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/skills/{nomeSkill}")
    public ResponseEntity<?> buscaPorSkill(@PathVariable String nomeSkill) {
        var optionalSkill = skillRepository.findByNome(nomeSkill);

        if(optionalSkill.isEmpty()) {
            return ResponseEntity.badRequest().body("Skill não existe no banco de dados.");
        }

        var list = candidatoRepository.findBySkills(optionalSkill.get());

        if(list.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(list);
    }

    @GetMapping("/certificacoes/{nomeCertificacao}")
    public ResponseEntity<?> buscaPorCertificacao(@PathVariable String nomeCertificacao) {
        var optionalCertificacao = certificacaoRepository.findByNome(nomeCertificacao);

        if(optionalCertificacao.isEmpty()) {
            return ResponseEntity.badRequest().body("Certificação não existe no banco de dados.");
        }

        var candidatos = optionalCertificacao.stream()
                .map(optional -> optional
                        .get()
                        .getCandidato())
                .collect(Collectors.toList());

        if(candidatos.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(candidatos);
    }

    @PostMapping
    public ResponseEntity<?> cadastrar(@RequestBody Candidato candidato) {
        try {
            var candidatoSalvo = candidatoService.cadastrar(candidato);
            return ResponseEntity.created(null).body(candidatoSalvo);
        } catch (Exception ex) {
            return ResponseEntity.badRequest().body(ex.getMessage());
        }
    }
}
