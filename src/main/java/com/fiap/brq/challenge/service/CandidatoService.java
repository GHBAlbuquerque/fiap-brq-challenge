package com.fiap.brq.challenge.service;

import com.fiap.brq.challenge.model.Candidato;
import com.fiap.brq.challenge.repository.CandidatoRepository;
import com.fiap.brq.challenge.utils.ValidadorCpf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CandidatoService {

    @Autowired
    private CandidatoRepository repository;

    @Autowired
    private SkillService skillService;

    @Autowired
    private CertificacaoService certificacaoService;

    @Transactional
    public Candidato cadastrar(Candidato candidato) {
        validar(candidato);

        var skillsEncontradas = skillService.encontrarSkills(candidato.getSkills());
        candidato.setSkills(skillsEncontradas);

        var candidatoSalvo = repository.save(candidato);

        candidatoSalvo.getCertificacoes().stream().forEach(certificacao -> certificacao.setCandidato(candidatoSalvo));

        for (var certificacao : candidato.getCertificacoes()) {
            certificacaoService.salvar(certificacao);
        }

        return repository.findById(candidatoSalvo.getId()).get();
    }

    private void validar(Candidato candidato) {

        if (!ValidadorCpf.validarCpf(candidato.getCpf())) {
            throw new RuntimeException("Cpf não é válido");
        }

        if (repository.findByCpf(candidato.getCpf()).isPresent()) {
            throw new RuntimeException("Já existe candidato cadastrado para este cpf");
        }

        if (repository.findByCelular(candidato.getCelular()).isPresent()) {
            throw new RuntimeException("Já existe candidato cadastrado para este número de celular");
        }
    }


}
