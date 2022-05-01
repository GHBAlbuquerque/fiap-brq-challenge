package com.fiap.brq.challenge.repository;

import com.fiap.brq.challenge.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Long> {

    Optional<Skill> findByNome(String nome);

}
