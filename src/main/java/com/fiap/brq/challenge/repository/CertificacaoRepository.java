package com.fiap.brq.challenge.repository;

import com.fiap.brq.challenge.model.Certificacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CertificacaoRepository extends JpaRepository<Certificacao, Long> {

}
