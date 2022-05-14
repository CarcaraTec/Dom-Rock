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

-- Table: public.bronze

-- DROP TABLE public.bronze;

CREATE TABLE public.bronze
(
    origem character varying COLLATE pg_catalog."default" NOT NULL,
    formato character varying COLLATE pg_catalog."default" NOT NULL,
    sistema character varying COLLATE pg_catalog."default" NOT NULL,
    volume_json character varying COLLATE pg_catalog."default",
    freq_json character varying COLLATE pg_catalog."default",
    volume_csv character varying COLLATE pg_catalog."default",
    freq_csv character varying COLLATE pg_catalog."default",
    volume_planilhas character varying COLLATE pg_catalog."default",
    freq_planilhas character varying COLLATE pg_catalog."default",
    volume_tabelas character varying COLLATE pg_catalog."default",
    freq_tabelas character varying COLLATE pg_catalog."default",
    volume_pdf character varying COLLATE pg_catalog."default",
    freq_pdf character varying COLLATE pg_catalog."default",
    volume_audio character varying COLLATE pg_catalog."default",
    freq_audio character varying COLLATE pg_catalog."default",
    volume_texto character varying COLLATE pg_catalog."default",
    freq_texto character varying COLLATE pg_catalog."default"
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.bronze
    OWNER to postgres;