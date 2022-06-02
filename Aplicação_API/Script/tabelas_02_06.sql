-- Table: public.cliente

-- DROP TABLE public.cliente;

CREATE TABLE public.cliente
(
    cnpj_cliente character varying COLLATE pg_catalog."default" NOT NULL,
    nome_empresa character varying COLLATE pg_catalog."default" NOT NULL,
    objetivo_negocio character varying COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT cliente_pkey PRIMARY KEY (cnpj_cliente)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.cliente
    OWNER to postgres;

-- Table: public.produto

-- DROP TABLE public.produto;

CREATE TABLE public.produto
(
    nome_solucao character varying COLLATE pg_catalog."default" NOT NULL,
    nome_produto character varying COLLATE pg_catalog."default" NOT NULL,
    id serial NOT NULL,
    CONSTRAINT produto_pkey PRIMARY KEY (id),
    CONSTRAINT produto_nome_produto_key UNIQUE (nome_produto)

)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.produto
    OWNER to postgres;

INSERT INTO public.produto (nome_solucao, nome_produto, id) VALUES ('Nxt.Demand', 'Vox', 1);
INSERT INTO public.produto (nome_solucao, nome_produto, id) VALUES ('Nxt.Demand', 'Marketing&Planning', 2);
INSERT INTO public.produto (nome_solucao, nome_produto, id) VALUES ('Nxt.Demand', 'Sales&Distribution', 3);
INSERT INTO public.produto (nome_solucao, nome_produto, id) VALUES ('Nxt.Demand', 'Pricing', 4);
INSERT INTO public.produto (nome_solucao, nome_produto, id) VALUES ('Nxt.Operations', 'Optimization', 5);
INSERT INTO public.produto (nome_solucao, nome_produto, id) VALUES ('Nxt.Operations', 'Matching&Risk', 6);

-- Table: public.cadastro_escopo

-- DROP TABLE public.cadastro_escopo;

CREATE TABLE public.cadastro_escopo
(
    id serial NOT NULL,
    cnpj character varying(20) COLLATE pg_catalog."default" NOT NULL,
    entregavel_min character varying(50) COLLATE pg_catalog."default" NOT NULL,
    entregaveis_possi character varying(50) COLLATE pg_catalog."default" NOT NULL,
    produto character varying(20) COLLATE pg_catalog."default" NOT NULL,
    estrutura character varying(50) COLLATE pg_catalog."default" NOT NULL,
    volume character varying(5) COLLATE pg_catalog."default" NOT NULL,
    funcionalidade character varying(20) COLLATE pg_catalog."default" NOT NULL,
    core character varying(20) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT cadastro_escopo_pkey PRIMARY KEY (id),
    CONSTRAINT cadastro_escopo_cnpj_fkey FOREIGN KEY (cnpj)
        REFERENCES public.cliente (cnpj_cliente) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT cadastro_escopo_produto_fkey FOREIGN KEY (produto)
        REFERENCES public.produto (nome_produto) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.cadastro_escopo
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

-- Table: public.usuario

-- DROP TABLE public.usuario;

CREATE TABLE public.usuario
(
	id serial NOT NULL,
    usuario character varying(20) COLLATE pg_catalog."default" NOT NULL,
    senha character varying(20) COLLATE pg_catalog."default" NOT NULL,

    CONSTRAINT usuario_pkey PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.usuario
    OWNER to postgres;

INSERT INTO public.usuario (id, usuario, senha) VALUES (1, 'admin', '123');