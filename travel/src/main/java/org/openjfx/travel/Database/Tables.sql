create table if not exists public.lugar(
    lg_id SERIAL PRIMARY KEY,
    nome varchar not null,
    latitude numeric not null,
    longitude numeric not null,
    planejamentoT boolean,
    cep int null,
    cafe boolean,
    num_banheiros int check (num_banheiros >= 1),
    num_hospedes INT CHECK (num_hospedes >= 1),
    num_quartos INT CHECK (num_quartos >= 1),
    wifi_free boolean,
    pet_permission boolean
);

create table if not exists public.passageiro(
    ps_id SERIAL PRIMARY KEY,
    nome varchar not null,
    cpf int null,
    telefone int null,
    email varchar unique,
    senha varchar not null,
    nascimento date null,
    cep int null,
    logradouto varchar null,
    numero varchar null,
    complemento varchar null,
    bairro varchar null,
    municipio varchar null,
    uf varchar null
);

create table if not exists public.veiculo(
    ve_id SERIAL PRIMARY KEY,
    nome varchar null,
    marca varchar null,
    modelo varchar null,
    ano date null,
    identificacao varchar null,
    num_chassi int not null unique,
    tipo varchar null,
    carroceria varchar null,
    num_passageiros int,
    espaco_carga numeric null,
    motorizacao varchar null,
    transmissao varchar null,
    consumo numeric null
);

create table if not exists public.viagem(
    vg_id SERIAL PRIMARY KEY,
    ps_id int not null,
    lugar_ida int not null,
    lugar_volta int not null,
    veiculo_ida int not null,
    veiculo_volta int not null,
    data_ida date not null,
    data_volta date
);

