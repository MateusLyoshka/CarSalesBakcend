CREATE TABLE fipe (
    id uuid primary key default gen_random_uuid(),
    tipo_veiculo text,
    codigo_fipe text,
    nome_modelo text,
    nome_combustivel text,
    ano_modelo integer,
    zero_km boolean,
    valor_centavos bigint,
    nome_marca text,
    sigla_combustivel char(1),
    valor_formatado text,
    mes_referencia text,
    ano_referencia text
)