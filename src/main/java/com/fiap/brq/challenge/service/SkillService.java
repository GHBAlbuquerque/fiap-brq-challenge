package com.fiap.brq.challenge.service;

import com.fiap.brq.challenge.model.Skill;
import com.fiap.brq.challenge.repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SkillService {

    @Autowired
    private SkillRepository skillRepository;

    public Skill buscarPorId(Long id) {
        var skill = skillRepository.findById(id);

        if (skill.isEmpty()) {
            throw new RuntimeException("Skill não cadastrada no banco de dados.");
        }

        return skill.get();
    }

    public List<Skill> encontrarSkills(List<Skill> skills) {
        var skillsEncontradas = new ArrayList<Skill>();
        for (var skill : skills) {
            var skillEncontrada = buscarPorId(skill.getId());
            skillsEncontradas.add(skillEncontrada);
        }

        return skillsEncontradas;
    }
}
