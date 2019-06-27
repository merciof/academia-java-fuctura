/* ENDEREÇO */
CREATE TABLE ENDERECO 
(
  RUA VARCHAR2(200) NOT NULL 
, NUMERO NUMBER NOT NULL 
, COMPLEMENTO VARCHAR2(4) NOT NULL 
, ID_ENDERECO NUMBER NOT NULL 
, CONSTRAINT ENDERECO_PK1 PRIMARY KEY 
  (
    ID_ENDERECO 
  )
  ENABLE 
);
/* PESSOA */
CREATE TABLE PESSOA 
(
  NOME VARCHAR2(200) NOT NULL 
, IDADE NUMBER NOT NULL 
, SEXO VARCHAR2(2) NOT NULL 
, CPF VARCHAR2(11) NOT NULL 
, ID_ENDERECO1 NUMBER NULL
, NUMERO_CONTA NUMBER NULL
, CONSTRAINT PESSOA_PK PRIMARY KEY 
  (
    CPF 
  )
  ENABLE 
);

/* CONTA */
CREATE TABLE CONTA 
(
  NUMERO NUMBER NOT NULL 
, SALDO NUMBER NOT NULL 
, LIMITE NUMBER NOT NULL 
, CONSTRAINT CONTA_PK PRIMARY KEY 
  (
    NUMERO 
  )
  ENABLE 
);

alter table rodrigo.PESSOA add constraint FK_ID_ENDERECO foreign key( ID_ENDERECO1 ) references ENDERECO(ID_ENDERECO);

alter table rodrigo.PESSOA add constraint FK_ID_CONTA foreign key( NUMERO_CONTA ) references CONTA(NUMERO);
--alter table rodrigo.PESSOA add constraint FK_NUMERO_CONTA foreign key( NUMERO_CONTA ) references CONTA(NUMERO);

CREATE SEQUENCE S_ID_ENDERECO INCREMENT BY 1 START WITH 1 MINVALUE 1;

SELECT S_ID_ENDERECO.NEXTVAL FROM DUAL;

CREATE  OR   REPLACE   TRIGGER T_ID_ENDERECO
BEFORE  INSERT  ON   ENDERECO
   FOR   EACH   ROW 
BEGIN
   IF INSERTING THEN 
	  IF   :NEW.ID_ENDERECO IS  NULL  THEN 
		 SELECT   S_ID_ENDERECO.NEXTVAL  INTO  :NEW.ID_ENDERECO  FROM  DUAL; 
	  END IF; 
   END IF; 
END;


INSERT INTO ENDERECO (RUA, NUMERO, COMPLEMENTO) VALUES ('Alguma rua0', '1234', 'AP1');
INSERT INTO ENDERECO (RUA, NUMERO, COMPLEMENTO) VALUES ('Alguma rua1', '1235', 'AP2');
INSERT INTO ENDERECO (RUA, NUMERO, COMPLEMENTO) VALUES ('Alguma rua2', '1236', 'AP3');
INSERT INTO ENDERECO (RUA, NUMERO, COMPLEMENTO) VALUES ('Alguma rua3', '1237', 'AP4');
INSERT INTO ENDERECO (RUA, NUMERO, COMPLEMENTO) VALUES ('Alguma rua4', '1238', 'AP5');
INSERT INTO ENDERECO (RUA, NUMERO, COMPLEMENTO) VALUES ('Alguma rua5', '1239', 'AP6');

SELECT * FROM ENDERECO;

INSERT INTO PESSOA (NOME, IDADE, SEXO, CPF, ID_ENDERECO1, NUMERO_CONTA) VALUES ('RODRIGO', 33, 'M', '12345', 4, 1);
INSERT INTO PESSOA (NOME, IDADE, SEXO, CPF, ID_ENDERECO1, NUMERO_CONTA) VALUES ('LUCAS', 29, 'M', '12346', 5, 2);
INSERT INTO PESSOA (NOME, IDADE, SEXO, CPF, ID_ENDERECO1, NUMERO_CONTA) VALUES ('WES', 32, 'M', '12347', 6, 3);
INSERT INTO PESSOA (NOME, IDADE, SEXO, CPF, ID_ENDERECO1, NUMERO_CONTA) VALUES ('AMANDA', 25, 'M', '12348', 7, 4);
INSERT INTO PESSOA (NOME, IDADE, SEXO, CPF, ID_ENDERECO1, NUMERO_CONTA) VALUES ('JOÃO', 35, 'M', '12349', 8, 5);

SELECT * FROM PESSOA;

INSERT INTO CONTA (NUMERO, SALDO, LIMITE) VALUES (1, 100, 300);
INSERT INTO CONTA (NUMERO, SALDO, LIMITE) VALUES (2, 200, 300);
INSERT INTO CONTA (NUMERO, SALDO, LIMITE) VALUES (3, 300, 300);
INSERT INTO CONTA (NUMERO, SALDO, LIMITE) VALUES (4, 400, 300);
INSERT INTO CONTA (NUMERO, SALDO, LIMITE) VALUES (5, 500, 300);

SELECT * FROM CONTA;

SELECT * FROM PESSOA P JOIN CONTA C ON P.NUMERO_CONTA = C.NUMERO;
SELECT * FROM PESSOA P, CONTA C WHERE P.NUMERO_CONTA = C.NUMERO;

COMMIT;