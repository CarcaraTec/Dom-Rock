-- Table: public.escopo

-- DROP TABLE public.escopo;

CREATE TABLE public.escopo
(
	id serial NOT NULL,
	cnpj character varying COLLATE pg_catalog."default" NOT NULL,
    nome_empresa character varying COLLATE pg_catalog."default" NOT NULL,
    objetivo_neg character varying COLLATE pg_catalog."default" NOT NULL,
    entregavel_min character varying COLLATE pg_catalog."default" NOT NULL,
    entregaveis_possi character varying COLLATE pg_catalog."default" NOT NULL,
    solucao character varying COLLATE pg_catalog."default" NOT NULL,
    produto character varying COLLATE pg_catalog."default" NOT NULL,
    estrutura character varying COLLATE pg_catalog."default",
    volume character varying COLLATE pg_catalog."default",
    funcionalidade character varying COLLATE pg_catalog."default" NOT NULL,
    core character varying COLLATE pg_catalog."default" NOT NULL,

    CONSTRAINT escopo_pkey PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.escopo
    OWNER to postgres;

-- Table: public.bronze

-- DROP TABLE public.bronze;

CREATE TABLE public.bronze
(
	id serial NOT NULL,
	cnpj character varying COLLATE pg_catalog."default" NOT NULL,
    origem character varying COLLATE pg_catalog."default" NOT NULL,
    formato character varying COLLATE pg_catalog."default" NOT NULL,
    volume character varying COLLATE pg_catalog."default" NOT NULL,
    frequencia character varying COLLATE pg_catalog."default" NOT NULL,
    sistema character varying COLLATE pg_catalog."default" NOT NULL,
	
	CONSTRAINT bronze_pkey PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.bronze
    OWNER to postgres;