insert into CANDIDATO(ID, CELULAR, CPF, DT_NASC, EMAIL, NOME, GENERO) values (1, '976548763', '09875487659', {ts '1998-09-17 18:47:52.69'}, 'email1@email.com', 'Ana Silva', 'FEMININO');
insert into CANDIDATO(ID, CELULAR, CPF, DT_NASC, EMAIL, NOME, GENERO) values (2, '987664387', '09823456659', {ts '2003-10-17 18:47:52.69'}, 'email2@email.com', 'Joao Silva', 'MASCULINO');
insert into CANDIDATO(ID, CELULAR, CPF, DT_NASC, EMAIL, NOME, GENERO) values (3, '945678763', '09871234558', {ts '2005-03-11 18:47:52.69'}, 'email3@email.com', 'Paula Santos', 'OUTRO');
insert into CANDIDATO(ID, CELULAR, CPF, DT_NASC, EMAIL, NOME, GENERO) values (4, '923478763', '80270133054', {ts '2001-11-12 18:47:52.69'}, 'email4@email.com', 'Julio Nakamura', 'MASCULINO');


insert into SKILL(ID, NOME, DESCRICAO, NIVEL) values (1, 'Java - Avançado', 'Linguagem Java', 'AVANCADO')
insert into SKILL(ID, NOME, DESCRICAO, NIVEL) values (2, 'Java - Intermediário', 'Linguagem Java', 'INTERMEDIARIO')
insert into SKILL(ID, NOME, DESCRICAO, NIVEL) values (3, 'Java - Iniciante', 'Linguagem Java', 'INICIANTE')
insert into SKILL(ID, NOME, DESCRICAO, NIVEL) values (4, 'Python', 'Linguagem Python', 'AVANCADO')
insert into SKILL(ID, NOME, DESCRICAO, NIVEL) values (5, 'Scrum', 'Metodologia Ágil Scrum', 'ESPECIALISTA')
insert into SKILL(ID, NOME, DESCRICAO, NIVEL) values (6, '.NET', 'Linguagem .NET', 'INICIANTE')
insert into SKILL(ID, NOME, DESCRICAO, NIVEL) values (7, 'SpringFramework', 'Framework Spring para linguagem Java', 'ESPECIALISTA')
insert into SKILL(ID, NOME, DESCRICAO, NIVEL) values (8, 'Angular', 'Framework Front-End Angular', 'INTERMEDIARIO')
insert into SKILL(ID, NOME, DESCRICAO, NIVEL) values (9, 'AWS', 'Serviços na nuvem AWS', 'INTERMEDIARIO')
insert into SKILL(ID, NOME, DESCRICAO, NIVEL) values (10, 'React', 'Framework Front-End React', 'INICIANTE')


insert into CERTIFICACAO(ID, NOME, DESCRICAO, EMISSOR, DATA_EMISSAO, CANDIDATO_ID) values (1, 'Certified Cloud Practitioner', 'Certificação da AWS - Foundational', 'AWS Certifications', {ts '2020-04-11 18:47:52.69'}, 1);
insert into CERTIFICACAO(ID, NOME, DESCRICAO, EMISSOR, DATA_EMISSAO, CANDIDATO_ID) values (2, 'Certified Associate Developer', 'Certificação da AWS - Associate', 'AWS Certifications', {ts '2022-04-11 18:47:52.69'}, 2);
insert into CERTIFICACAO(ID, NOME, DESCRICAO, EMISSOR, DATA_EMISSAO, CANDIDATO_ID) values (3, 'Certified Scrum Master', 'Certificação de Scrum Master', 'Scrum Company TM', {ts '2020-05-14 18:47:52.69'}, 3);
insert into CERTIFICACAO(ID, NOME, DESCRICAO, EMISSOR, DATA_EMISSAO, CANDIDATO_ID) values (4, 'Time Use Fundamentals - Manager', 'Controle do tempo e Produtividade', 'AWS Certifications', {ts '2020-04-11 18:47:52.69'}, 3);
insert into CERTIFICACAO(ID, NOME, DESCRICAO, EMISSOR, DATA_EMISSAO, CANDIDATO_ID) values (5, 'Oracle Certified Profissional', 'Certificação da Oracle', 'Oracle Company', {ts '2019-10-28 18:47:52.69'}, 1);

insert into CANDIDATO_SKILL(CANDIDATO_ID, SKILL_ID) values (1, 1), (2, 2), (3, 5), (1, 7), (2, 4), (2, 6), (4, 4), (4,10);