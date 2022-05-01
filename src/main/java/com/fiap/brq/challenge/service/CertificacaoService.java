package com.fiap.brq.challenge.service;

import com.fiap.brq.challenge.model.Certificacao;
import com.fiap.brq.challenge.repository.CertificacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CertificacaoService {

    @Autowired
    private CertificacaoRepository certificacaoRepository;

    public Certificacao salvar(Certificacao certificacao){
        return certificacaoRepository.save(certificacao);
    }
}
