package com.fiap.brq.challenge.controller;

import com.fiap.brq.challenge.model.Candidato;
import com.fiap.brq.challenge.repository.CandidatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/candidatos")
public class CandidatoController {

    @Autowired
    private CandidatoRepository contratoRepository;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Candidato> listar() {
        return contratoRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity<Void> cadastrar(@RequestBody Candidato candidato) {
        contratoRepository.save(candidato);
        return ResponseEntity.noContent().build();
    }
}
