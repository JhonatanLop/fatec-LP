create or replace view vw_lugar
    as select 
        lugar.lg_id,
        lugar.nome,
        lugar.latitude,
        lugar.longitude,
        lugar.planejamentoT,
        lugar.cep,
        lugar.cafe,
        lugar.num_banheiros,
        lugar.num_quartos,
        lugar.num_hospedes,
        lugar.wifi_free,
        lugar.pet_permission;

create or replace view vw_passageiro
    as select
        passageiro.ps_id,
        passageiro.nome,
        passageiro.cpf,
        passageiro.telefone,
        passageiro.email,
        passageiro.senha,
        passageiro.nascimento,
        passageiro.cep,
        passageiro.logradouto,
        passageiro.numero,
        passageiro.complemento,
        passageiro.bairro,
        passageiro.municipio,
        passageiro.uf;

create or replace view vw_veiculos
    as select
        veiculos.ve_id,
        veiculos.nome,
        veiculos.marca,
        veiculos.modelo,
        veiculos.ano,
        veiculos.identificacao,
        veiculos.num_chassi,
        veiculos.tipo,
        veiculos.carroceria,
        veiculos.num_passageiros,
        veiculos.espaco_carga,
        veiculos.motorizacao,
        veiculos.transmissao,
        veiculos.consumo;

create or replace view vw_viagem
    as select
        viagem.vg_id,
        lugar.nome as lugar_ida,
        lugar.nome as lugar_volta,
        veiculos.nome as veiculos_ida,
        veiculos.nome as veiculos_volta,
        viagem.data_ida,
        viagem.data_volta
    
    from viagem

    join lugar on lugar.lg_id = viagem.lugar_ida
    join lugar on lugar.lg_id = viagem.lugar_volta
    join veiculos on veiculos.ve_id = viagem.veiculos_ida
    join veiculos on veiculos.ve_id = viagem.veiculos_volta;