CREATE TABLE IF NOT EXISTS movimento_manual (
    dat_mes SMALLINT NOT NULL,
    dat_ano SMALLINT NOT NULL,
    num_lancamento BIGINT NOT NULL,
    cod_produto CHAR(4) NOT NULL,
    cod_cosif CHAR(11) NOT NULL,
    des_descricao VARCHAR(50) NOT NULL,

    PRIMARY KEY (dat_mes, dat_ano, num_lancamento, cod_produto, cod_cosif)
);
