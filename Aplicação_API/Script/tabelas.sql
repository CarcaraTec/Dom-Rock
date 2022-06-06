-- Table: public.cliente

-- DROP TABLE public.cliente;

CREATE TABLE public.cliente
(
    id_cliente serial NOT NULL,
    cnpj_cliente character varying COLLATE pg_catalog."default" NOT NULL,
    nome_empresa character varying COLLATE pg_catalog."default" NOT NULL,
    objetivo_negocio character varying COLLATE pg_catalog."default" NOT NULL,
    data_hora_cadastro timestamp not null default CURRENT_TIMESTAMP(1),
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
    solucao character varying COLLATE pg_catalog."default" NOT NULL,
    nome_produto character varying COLLATE pg_catalog."default" NOT NULL,
    id_produto serial NOT NULL,
    CONSTRAINT produto_pkey PRIMARY KEY (id_produto),
    CONSTRAINT produto_nome_produto_key UNIQUE (nome_produto)

)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.produto
    OWNER to postgres;


INSERT INTO public.produto (solucao, nome_produto, id_produto) VALUES ('Nxt.Demand', 'Vox', 1);
INSERT INTO public.produto (solucao, nome_produto, id_produto) VALUES ('Nxt.Demand', 'Marketing&Planning', 2);
INSERT INTO public.produto (solucao, nome_produto, id_produto) VALUES ('Nxt.Demand', 'Sales&Distribution', 3);
INSERT INTO public.produto (solucao, nome_produto, id_produto) VALUES ('Nxt.Demand', 'Pricing', 4);
INSERT INTO public.produto (solucao, nome_produto, id_produto) VALUES ('Nxt.Operations', 'Optimization', 5);
INSERT INTO public.produto (solucao, nome_produto, id_produto) VALUES ('Nxt.Operations', 'Matching&Risk', 6);




-- Table: public.funcionalidade

-- DROP TABLE public.funcionalidade;

CREATE TABLE public.funcionalidade
(
    id_funcionalidade serial NOT NULL,
    nome_funcionalidade character varying COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT funcionalidade_pkey PRIMARY KEY (id_funcionalidade),
    CONSTRAINT funcionalidade_nome_funcionalidade_key UNIQUE (nome_funcionalidade)

)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.funcionalidade
    OWNER to postgres;
	

INSERT INTO public.funcionalidade (id_funcionalidade, nome_funcionalidade) VALUES (1,'Gerador de DataLake');
INSERT INTO public.funcionalidade (id_funcionalidade, nome_funcionalidade) VALUES (2,'Busca por LNP');
INSERT INTO public.funcionalidade (id_funcionalidade, nome_funcionalidade) VALUES (3,'Ingestão Automatizada');
INSERT INTO public.funcionalidade (id_funcionalidade, nome_funcionalidade) VALUES (4,'Painéis, gráficos e relatórios');


-- Table: public.core

-- DROP TABLE public.core;

CREATE TABLE public.core
(
    id_core serial NOT NULL,
    nome_core character varying COLLATE pg_catalog."default" NOT NULL,
    
    CONSTRAINT core_pkey PRIMARY KEY (id_core),
    CONSTRAINT core_nome_core_unique UNIQUE (nome_core)

)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.core
    OWNER to postgres;
	

INSERT INTO public.core (id_core, nome_core) VALUES (1,'Web App');
INSERT INTO public.core (id_core, nome_core) VALUES (2,'API Gateway');
INSERT INTO public.core (id_core, nome_core) VALUES (3,'Filas');
INSERT INTO public.core (id_core, nome_core) VALUES (4,'Step Function');
INSERT INTO public.core (id_core, nome_core) VALUES (5,'Lambda');
INSERT INTO public.core (id_core, nome_core) VALUES (6,'Fargate');
INSERT INTO public.core (id_core, nome_core) VALUES (7,'Containers');
INSERT INTO public.core (id_core, nome_core) VALUES (8,'S3');
INSERT INTO public.core (id_core, nome_core) VALUES (9,'MongoDB');
INSERT INTO public.core (id_core, nome_core) VALUES (10,'Parquet');
INSERT INTO public.core (id_core, nome_core) VALUES (11,'QuickSight');
INSERT INTO public.core (id_core, nome_core) VALUES (12,'CloudWatch');

-- Table: public.origem_dado

-- DROP TABLE public.origem_dado;

CREATE TABLE public.origem_dado
(
    id_origem serial NOT NULL,
    nome_origem character varying COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT origem_dado_pkey PRIMARY KEY (id_origem),
    CONSTRAINT origem_dado_nome_origem_unique UNIQUE (nome_origem)

)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.origem_dado
    OWNER to postgres;
	
INSERT INTO public.origem_dado (id_origem, nome_origem) VALUES (1,'API');
INSERT INTO public.origem_dado (id_origem, nome_origem) VALUES (2,'SFTP');
INSERT INTO public.origem_dado (id_origem, nome_origem) VALUES (3,'Upload');

-- Table: public.formato

-- DROP TABLE public.formato;

CREATE TABLE public.formato
(
    id_formato serial NOT NULL,
    nome_formato character varying COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT formato_pkey PRIMARY KEY (id_formato),
    CONSTRAINT formato_nome_formato_unique UNIQUE (nome_formato)

)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.formato
    OWNER to postgres;

INSERT INTO public.formato (id_formato, nome_formato) VALUES (1,'JSON');
INSERT INTO public.formato (id_formato, nome_formato) VALUES (2,'CSV');
INSERT INTO public.formato (id_formato, nome_formato) VALUES (3,'Planilhas');
INSERT INTO public.formato (id_formato, nome_formato) VALUES (4,'Tabelas');
INSERT INTO public.formato (id_formato, nome_formato) VALUES (5,'PDF');
INSERT INTO public.formato (id_formato, nome_formato) VALUES (6,'Áudio');
INSERT INTO public.formato (id_formato, nome_formato) VALUES (7,'Texto');

-- Table: public.sistema

-- DROP TABLE public.sistema;

CREATE TABLE public.sistema
(
    id_sistema serial NOT NULL,
    nome_sistema character varying COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT sistema_pkey PRIMARY KEY (id_sistema),
    CONSTRAINT sistema_nome_sistema_unique UNIQUE (nome_sistema)

)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.sistema
    OWNER to postgres;
	
INSERT INTO public.sistema (id_sistema, nome_sistema) VALUES (1,'ERP');
INSERT INTO public.sistema (id_sistema, nome_sistema) VALUES (2,'Vendas');
INSERT INTO public.sistema (id_sistema, nome_sistema) VALUES (3,'Outros');

-- Table: public.cadastro_escopo

-- DROP TABLE public.cadastro_escopo;

CREATE TABLE public.cadastro_escopo
(
    id serial NOT NULL,
    cnpj character varying(20) COLLATE pg_catalog."default" NOT NULL,
    entregavel_min character varying(100) COLLATE pg_catalog."default" NOT NULL,
    entregaveis_possi character varying(100) COLLATE pg_catalog."default" NOT NULL,
    produto character varying(50) COLLATE pg_catalog."default" NOT NULL,
    estrutura character varying(50) COLLATE pg_catalog."default" NOT NULL,
    volume character varying(20) COLLATE pg_catalog."default" NOT NULL,
    funcionalidade character varying(100) COLLATE pg_catalog."default" NOT NULL,
    core character varying(20) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT cadastro_escopo_pkey PRIMARY KEY (id),
    CONSTRAINT cadastro_escopo_cnpj_fkey FOREIGN KEY (cnpj)
        REFERENCES public.cliente (cnpj_cliente) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT cadastro_escopo_core_fkey FOREIGN KEY (core)
        REFERENCES public.core (nome_core) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT cadastro_escopo_funcionalidade_fkey FOREIGN KEY (funcionalidade)
        REFERENCES public.funcionalidade (nome_funcionalidade) MATCH SIMPLE
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
    id_bronze serial NOT NULL,
    cnpj character varying COLLATE pg_catalog."default" NOT NULL,
    origem character varying COLLATE pg_catalog."default" NOT NULL,
    formato character varying COLLATE pg_catalog."default" NOT NULL,
    volume character varying COLLATE pg_catalog."default" NOT NULL,
    frequencia character varying COLLATE pg_catalog."default" NOT NULL,
    sistema character varying COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT bronze_pkey PRIMARY KEY (id_bronze),
    
    CONSTRAINT bronze_cnpj_fkey FOREIGN KEY (cnpj)
        REFERENCES public.cliente (cnpj_cliente) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT bronze_formato_fkey FOREIGN KEY (formato)
        REFERENCES public.formato (nome_formato) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT bronze_origem_fkey FOREIGN KEY (origem)
        REFERENCES public.origem_dado (nome_origem) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
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
    nivelacesso character varying(20) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT usuario_pkey PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.usuario
    OWNER to postgres;

INSERT INTO public.usuario (id, usuario, senha, nivelacesso) VALUES (1, 'admin', '123', 'administrador');

-- Table: public.silver

-- DROP TABLE public.silver;

CREATE TABLE public.silver
(
    id_silver serial NOT NULL,
    nomesilver character varying COLLATE pg_catalog."default",
    status character varying COLLATE pg_catalog."default",
    problema character varying COLLATE pg_catalog."default",
    cnpjsilver character varying COLLATE pg_catalog."default",
    CONSTRAINT silver_pkey PRIMARY KEY (id_silver)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.silver
    OWNER to postgres;

-- Table: public.gold

-- DROP TABLE public.gold;

CREATE TABLE public.gold
(
	id serial NOT NULL,
    tiposilver character varying COLLATE pg_catalog."default",
    nomegold character varying COLLATE pg_catalog."default",
    cnpj character varying COLLATE pg_catalog."default",
    CONSTRAINT gold_pkey PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.gold
    OWNER to postgres;