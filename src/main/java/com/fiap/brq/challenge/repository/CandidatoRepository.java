package com.fiap.brq.challenge.repository;

import com.fiap.brq.challenge.model.Candidato;
import com.fiap.brq.challenge.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CandidatoRepository extends JpaRepository<Candidato, Long> {

    Optional<Candidato> findByNome(String nome);

    Optional<Candidato> findByCpf(String cpf);

    Optional<Candidato> findByCelular(String celular);

    List<Optional<Candidato>> findBySkills(Skill skill);
}
