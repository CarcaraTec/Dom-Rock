-- Table: public.usuario

-- DROP TABLE public.usuario;

CREATE TABLE public.usuario
(
    usuario character varying COLLATE pg_catalog."default" NOT NULL,
    senha character varying COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT usuario_pkey PRIMARY KEY (usuario)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.usuario
    OWNER to postgres;

-- Table: public.cadastro

-- DROP TABLE public.cadastro;

CREATE TABLE public.cadastro
(
    cnpj character varying COLLATE pg_catalog."default" NOT NULL,
    responsavel character varying COLLATE pg_catalog."default" NOT NULL,
    cpf character varying COLLATE pg_catalog."default" NOT NULL,
    telefone character varying COLLATE pg_catalog."default" NOT NULL,
    email character varying COLLATE pg_catalog."default" NOT NULL,
    nome_da_empresa character varying COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT cadastro_pkey PRIMARY KEY (nome_da_empresa)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.cadastro
    OWNER to postgres;