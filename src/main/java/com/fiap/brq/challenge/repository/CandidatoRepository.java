package com.fiap.brq.challenge.repository;

import com.fiap.brq.challenge.model.Candidato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidatoRepository extends JpaRepository<Candidato, Long> {

}
