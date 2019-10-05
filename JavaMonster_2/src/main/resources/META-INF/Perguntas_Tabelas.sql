CREATE TABLE PERFIL (
 CODIGO NUMBER NOT NULL,
 DESCRICAO VARCHAR2(50),
 CONSTRAINT PERFIL_PK PRIMARY KEY (CODIGO) ENABLE
)

CREATE TABLE CURSO(
 CODIGO NUMBER NOT NULL,
 DESCRICAO VARCHAR2(50),
 CONSTRAINT CURSO_PK PRIMARY KEY (CODIGO) ENABLE
)

CREATE TABLE USUARIO(
 CPF VARCHAR2(11) NOT NULL,
 CODIGO_PERFIL NUMBER NOT NULL,
 CODIGO_CURSO NUMBER NOT NULL,
 NOME VARCHAR2(250) NOT NULL,
 SEXO VARCHAR2(1),
 DATA_NASCIMENTO DATE DEFAULT (sysdate), 
 EMAIL VARCHAR2(100),
 ATIVO VARCHAR(1),
 CONSTRAINT USUARIO_PK PRIMARY KEY (CPF) ENABLE,
 CONSTRAINT PERFIL_FK FOREIGN KEY (CODIGO_PERFIL) REFERENCES PERFIL(CODIGO) ENABLE,
 CONSTRAINT CURSO_FK FOREIGN KEY (CODIGO_CURSO) REFERENCES CURSO(CODIGO) ENABLE
)

CREATE TABLE PERGUNTA(
 ID_PERGUNTA NUMBER NOT NULL,
 TITULO VARCHAR2(1000),
 DESCRICAO VARCHAR2(1000),
 DATA_CRIACAO DATE DEFAULT (sysdate),
 ATIVO VARCHAR(1),
 CPF_USUARIO VARCHAR2(11) NOT NULL,
 CONSTRAINT PERGUNTA_PK PRIMARY KEY (ID_PERGUNTA) ENABLE,
 CONSTRAINT USUARIO_FK FOREIGN KEY (CPF_USUARIO) REFERENCES USUARIO(CPF) ENABLE
)
CREATE SEQUENCE S_ID_PERGUNTA INCREMENT BY 1 START WITH 1 MINVALUE 1;

CREATE TABLE VOTACAO(
 ID_VOTACAO NUMBER NOT NULL,
 ID_PERGUNTA NUMBER NOT NULL,
 DATA_INICIO DATE DEFAULT (sysdate),
 DATA_FIM DATE DEFAULT (sysdate),
 CONSTRAINT VOTACAO_PK PRIMARY KEY (ID_VOTACAO) ENABLE,
 CONSTRAINT PERGUNTA_FK FOREIGN KEY (ID_PERGUNTA) REFERENCES PERGUNTA(ID_PERGUNTA) ENABLE
)

CREATE SEQUENCE S_ID_VOTACAO  INCREMENT BY 1 START WITH 1 MINVALUE 1;


CREATE TABLE RESPOSTA(
 ID_RESPOSTA NUMBER NOT NULL,
 ID_PERGUNTA NUMBER NOT NULL,
 CPF_USUARIO VARCHAR2(11) NOT NULL,
 DESCRICAO VARCHAR2(2500),
 DATA_CRIACAO DATE DEFAULT (sysdate),
 CONSTRAINT RESPOSTA_PK PRIMARY KEY (ID_RESPOSTA) ENABLE,
 CONSTRAINT RESPOSTA_PERGUNTA_FK FOREIGN KEY (ID_PERGUNTA) REFERENCES PERGUNTA(ID_PERGUNTA) ENABLE,
 CONSTRAINT RESPOSTA_USUARIO_FK FOREIGN KEY (CPF_USUARIO) REFERENCES USUARIO(CPF) ENABLE
)

CREATE SEQUENCE S_ID_RESPOSTA  INCREMENT BY 1 START WITH 1 MINVALUE 1;

CREATE TABLE VOTACAO_USUARIO(
 ID_VOTACAO NUMBER NOT NULL,
 CPF_USUARIO VARCHAR2(11) NOT NULL,
 DATA_CRIACAO DATE DEFAULT (sysdate),
 CONSTRAINT VOTACAO_FK FOREIGN KEY (ID_VOTACAO) REFERENCES VOTACAO(ID_VOTACAO) ENABLE,
 CONSTRAINT VOTACAO_USUARIO_USUARIO_FK FOREIGN KEY (CPF_USUARIO) REFERENCES USUARIO(CPF) ENABLE
)