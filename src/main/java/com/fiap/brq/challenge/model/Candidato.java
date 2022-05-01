package com.fiap.brq.challenge.model;

import com.fiap.brq.challenge.model.enums.GeneroEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@AllArgsConstructor
@NoArgsConstructor
public class Candidato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String cpf;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String celular;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private GeneroEnum genero;

    @Column(nullable = false)
    private LocalDate dt_nasc;

    @ManyToMany
    @JoinTable(name = "candidato_skill", joinColumns = @JoinColumn(name = "candidato_id"), inverseJoinColumns = @JoinColumn(name = "skill_id"))
    private List<Skill> skills = new ArrayList<>();

    @OneToMany(mappedBy = "candidato")
    private List<Certificacao> certificacoes = new ArrayList<>();
}
