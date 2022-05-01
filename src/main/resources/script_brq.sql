
insert into CANDIDATO(id, celular, cpf, dt_nasc, email, nome, genero) values (1, '976548763', '09875487659', {ts '2012-09-17 18:47:52.69'}, 'email1@email.com', 'Ana', 'Silva', 'FEMININO');
insert into CANDIDATO(id, celular, cpf, dt_nasc, email, nome, genero) values (2, '987664387', '09823456659', {ts '2014-10-17 18:47:52.69'}, 'email2@email.com', 'Joao', 'Silva', 'MASCULINO');
insert into CANDIDATO(id, celular, cpf, dt_nasc, email, nome, genero) values (3, '945678763', '09871234558', {ts '2020-03-11 18:47:52.69'}, 'email3@email.com', 'Paula', 'Santos', 'OUTRO');

insert into SKILL(id, nome, descricao, nivel) values (1, 'Java', 'Linguagem Java', 'AVANÇADO')
insert into SKILL(id, nome, descricao, nivel) values (2, 'Java', 'Linguagem Java', 'INTERMEDIARIO')
insert into SKILL(id, nome, descricao, nivel) values (3, 'Java', 'Linguagem Java', 'INICIANTE')
insert into SKILL(id, nome, descricao, nivel) values (4, 'Python', 'Linguagem Python', 'AVANÇADO')
insert into SKILL(id, nome, descricao, nivel) values (5, 'Scrum', 'Metodologia Ágil Scrum', 'ESPECIALISTA')
insert into SKILL(id, nome, descricao, nivel) values (6, '.NET', 'Linguagem .NET', 'INICIANTE')
insert into SKILL(id, nome, descricao, nivel) values (7, 'SpringFramework', 'Framework Spring para linguagem Java', 'ESPECIALISTA')
insert into SKILL(id, nome, descricao, nivel) values (8, 'Angular', 'Framework Front-End Angular', 'INTERMEDIARIO')
insert into SKILL(id, nome, descricao, nivel) values (9, 'AWS', 'Serviços na nuvem AWS', 'INTERMEDIARIO')
insert into SKILL(id, nome, descricao, nivel) values (10, 'React', 'Framework Front-End React', 'INICIANTE')


insert into CERTIFICACAO(id, nome, descricao, emissor, dataEmissao, candidato_id) values (1, 'Certified Cloud Practitioner', 'Certificação da AWS - Foundational', 'AWS Certifications', {ts '2020-04-11 18:47:52.69'}, 1);
