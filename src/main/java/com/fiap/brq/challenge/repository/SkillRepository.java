package com.fiap.brq.challenge.repository;

import com.fiap.brq.challenge.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Long> {

}
