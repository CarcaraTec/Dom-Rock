-- Table: public.escopo

-- DROP TABLE public.escopo;

CREATE TABLE public.escopo
(
    nome_empresa character varying COLLATE pg_catalog."default" NOT NULL,
    objetivo_neg character varying COLLATE pg_catalog."default" NOT NULL,
    entregavel_min character varying COLLATE pg_catalog."default" NOT NULL,
    entregaveis_possi character varying COLLATE pg_catalog."default" NOT NULL,
    solucao character varying COLLATE pg_catalog."default" NOT NULL,
    produto character varying COLLATE pg_catalog."default" NOT NULL,
    funcionalidade character varying COLLATE pg_catalog."default" NOT NULL,
    core character varying COLLATE pg_catalog."default" NOT NULL,
    estrutura_min_vox character varying COLLATE pg_catalog."default",
    volume_vox character varying COLLATE pg_catalog."default",
    cnpj character varying COLLATE pg_catalog."default" NOT NULL,
    estrutura_min_mkteplan character varying COLLATE pg_catalog."default",
    volume_mkteplan character varying COLLATE pg_catalog."default",
    estrutura_min_sales character varying COLLATE pg_catalog."default",
    volume_sales character varying COLLATE pg_catalog."default",
    estrutura_min_pricing character varying COLLATE pg_catalog."default",
    volume_pricing character varying COLLATE pg_catalog."default",
    estrutura_min_optimization character varying COLLATE pg_catalog."default",
    volume_optimization character varying COLLATE pg_catalog."default",
    estrutura_min_matching character varying COLLATE pg_catalog."default",
    volume_matching character varying COLLATE pg_catalog."default",
    CONSTRAINT escopo_pkey PRIMARY KEY (cnpj)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.escopo
    OWNER to postgres;