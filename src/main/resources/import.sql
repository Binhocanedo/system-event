INSERT INTO TB_CATEGORIA(DESCRICAO) VALUES ('Curso')
INSERT INTO TB_CATEGORIA(DESCRICAO) VALUES ('Oficina')

INSERT INTO TB_ATIVIDADE(CATEGORIA_ID, NOME, DESCRICAO, PRECO) VALUES(1, 'Curso de HTML', 'Aprenda HTML de forma prática', 80.00)
INSERT INTO TB_ATIVIDADE(CATEGORIA_ID, NOME, DESCRICAO, PRECO) VALUES(2, 'Oficina de GitHub', 'Controle de versões de seus projetos', 50.00)


INSERT INTO TB_BLOCO(INICIO, FIM) VALUES(TIMESTAMP WITH TIME ZONE '2017-09-25T08:00:00', TIMESTAMP WITH TIME ZONE '2017-09-25T11:00:00')
INSERT INTO TB_BLOCO(INICIO, FIM) VALUES(TIMESTAMP WITH TIME ZONE '2017-09-25T14:00:00', TIMESTAMP WITH TIME ZONE '2017-09-25T18:00:00')
INSERT INTO TB_BLOCO(INICIO, FIM) VALUES(TIMESTAMP WITH TIME ZONE '2017-09-26T08:00:00', TIMESTAMP WITH TIME ZONE '2017-09-26T11:00:00')

INSERT INTO TB_PARTICIPANTE(NOME, EMAIL) VALUES('Jose Silva', 'jose@gmail.com')
INSERT INTO TB_PARTICIPANTE(NOME, EMAIL) VALUES('Tiago Faria', 'tiago@gmail.com')
INSERT INTO TB_PARTICIPANTE(NOME, EMAIL) VALUES('Maria do Rosário', 'maria@gmail.com')
INSERT INTO TB_PARTICIPANTE(NOME, EMAIL) VALUES('Teresa Silva', 'teresa@gmail.com')
INSERT INTO TB_PARTICIPANTE(NOME, EMAIL) VALUES('Fabio ', 'fabio@gmail.com')

INSERT INTO TB_ATIVIDADE_PARTICIPANTE(ATIVIDADE_ID, PARTICIPANTE_ID) VALUES(1, 1);
INSERT INTO TB_ATIVIDADE_PARTICIPANTE(ATIVIDADE_ID, PARTICIPANTE_ID) VALUES(1, 2);
INSERT INTO TB_ATIVIDADE_PARTICIPANTE(ATIVIDADE_ID, PARTICIPANTE_ID) VALUES(1, 3);
INSERT INTO TB_ATIVIDADE_PARTICIPANTE(ATIVIDADE_ID, PARTICIPANTE_ID) VALUES(2, 3);
INSERT INTO TB_ATIVIDADE_PARTICIPANTE(ATIVIDADE_ID, PARTICIPANTE_ID) VALUES(1, 4);
INSERT INTO TB_ATIVIDADE_PARTICIPANTE(ATIVIDADE_ID, PARTICIPANTE_ID) VALUES(1, 5);