package org.openjfx.travel.Connection;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.openjfx.travel.classes.Lugar;
import org.openjfx.travel.classes.Passageiros;
import org.openjfx.travel.classes.Passagem;
import org.openjfx.travel.classes.Veiculo;
import org.openjfx.travel.classes.Viagem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class QueryLibs {

    private static Connection initConnection() {
        SQLConnection sqlConnection = new SQLConnection();
        Connection conexao = sqlConnection.connect();
        return conexao;
    }

    public static void simpleSelect() throws SQLException {
        Connection conexao = initConnection();
        // método que executa um select simples
        // recebe como parâmetro uma conexão com o banco de dados
        // e pode lançar uma exceção SQLException

        // string que carrega o comando em sql
        String sql = "SELECT * FROM tabela";

        // execução da query
        try (PreparedStatement statement = conexao.prepareStatement(sql)) {
            // prepara a declaração SQL para ser executada usando a conexão fornecida
            // e executa a consulta
            ResultSet result = statement.executeQuery();

            // processa o resultado aqui...
            while (result.next()) {
                // itera sobre cada linha retornada pela consulta
                // e extrai os valores das colunas necessárias
                String coluna1 = result.getString("nome_da_coluna_1");
                int coluna2 = result.getInt("nome_da_coluna_2");
                double coluna3 = result.getDouble("nome_da_coluna_3");

                // imprime os valores das colunas no terminal
                System.out.println(coluna1 + " - " + coluna2 + " - " + coluna3);
            }
        }

        conexao.close();
    }

    public static void insertTable() throws SQLException {
        Connection conexao = initConnection();
        // código sql a ser executado, passando "?" como parâmetro de valors
        String sql = "INSERT INTO tabela_teste (nome, nome2) values (?, ?)";
        try (PreparedStatement statement = conexao.prepareStatement(sql)) {
            // substituindo os parâmetros "?" para valores desejados
            statement.setString(1, "jhow");
            statement.setString(2, "nicole");
            // executa o update
            statement.executeUpdate();
            // exibe erros ao executar a query
        } catch (Exception ex) {
            System.out.println("Erro ao executar a query: " + ex.getMessage());
        }
        conexao.close();
    }

    public static void executeSqlFile(String arquivoSql) throws SQLException, IOException {
        Connection conexao = initConnection();

        try (BufferedReader br = new BufferedReader(new FileReader(arquivoSql))) {
            String linha;
            StringBuilder sb = new StringBuilder();
            while ((linha = br.readLine()) != null) {
                // adiciona a linha ao StringBuilder
                sb.append(linha);
                sb.append(System.lineSeparator()); // Adiciona quebra de linha ao final de cada linha lida
            }
            String sql = sb.toString(); // Converte o StringBuilder em uma String
            try (Statement statement = conexao.createStatement()) {
                // executa as instruções SQL contidas no arquivo
                statement.execute(sql);
            }
            conexao.commit();
        } catch (Exception ex) {
            System.out.println("Erro ao executar a query: " + ex.getMessage());
        }
        conexao.close();
    }

    // Query's para insert de dados
    public static void insertLugar(Lugar lugar) throws SQLException {

        // inicializa conexão com o banco de dados
        Connection conexao = initConnection();
        // cédigo sql a ser executado, passando "?" como parâmetro de valors
        String sql = "INSERT INTO lugar (nome, latitude, longitude, planejamentoT, cep, cafe, nBanheiro, nHospedes, nQuartos, wifi, pet) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement statement = conexao.prepareStatement(sql)) {
            // substituindo os parâmetros "?" para valores desejados
            statement.setString(1, lugar.getNome());
            statement.setDouble(2, lugar.getLatitude());
            statement.setDouble(3, lugar.getLongitude());
            statement.setString(4, lugar.getPlanejamentoT());
            statement.setInt(5, lugar.getCep());
            statement.setBoolean(6, lugar.getCafe());
            statement.setInt(7, lugar.getnBanheiro());
            statement.setInt(8, lugar.getnHospedes());
            statement.setInt(9, lugar.getnQuartos());
            statement.setBoolean(10, lugar.isWifiFree());
            statement.setBoolean(11, lugar.isPetPermission());
            // exibe erros ao executar a query
            statement.executeUpdate();
            conexao.commit();

            System.out.println("Insert executado com sucesso!");
        } catch (Exception ex) {
            System.out.println("initializeErro ao executar a query: " + ex.getMessage());
        } finally {
            conexao.close();
        }
    }

    public static void insertPassageiros(Passageiros passageiro) throws SQLException {
        // Inicializa conexão com o banco de dados
        Connection conexao = initConnection();

        // Código SQL a ser executado, passando "?" como parâmetros de valores
        String sql = "INSERT INTO passageiro (nome, cpf, telefone, email, senha, nascimento, cep, logradouro, numero, bairro, municipio, uf) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement statement = conexao.prepareStatement(sql)) {
            // Substituindo os parâmetros "?" por valores desejados
            statement.setString(1, passageiro.getNome());
            statement.setInt(2, passageiro.getCPF());
            statement.setInt(3, passageiro.getTelefone());
            statement.setString(4, passageiro.getEmail());
            statement.setString(5, passageiro.getPassword());
            statement.setDate(6, new java.sql.Date(passageiro.getNascimento().getTime()));
            statement.setInt(7, passageiro.getCep());
            statement.setString(8, passageiro.getLogradouro());
            statement.setString(9, passageiro.getNumero());
            statement.setString(10, passageiro.getBairro());
            statement.setString(11, passageiro.getMunicipio());
            statement.setString(12, passageiro.getUf());

            // Executa a query e exibe erros, se houver
            statement.executeUpdate();

            // Confirma as alterações no banco de dados
            conexao.commit();

            System.out.println("Insert executado com sucesso!");
        } catch (SQLException ex) {
            System.out.println("Erro ao executar a query: " + ex.getMessage());
            conexao.rollback(); // Desfaz as alterações no caso de um erro
        } finally {
            conexao.close();
        }
    }

    public static void insertVeiculo(Veiculo veiculo) throws SQLException {

        // inicializa conexão com o banco de dados
        Connection conexao = initConnection();
        String sql = "INSERT INTO veiculo (nome, marca, modelo, ano, identificacao, num_chassi, tipo, carroceria, num_passageiros, espaco_carga, motorizacao, transmissao, consumo) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement statement = conexao.prepareStatement(sql)) {
            statement.setString(1, veiculo.getNome());
            statement.setString(2, veiculo.getMarca());
            statement.setString(3, veiculo.getModelo());
            statement.setInt(4, veiculo.getAno());
            statement.setString(5, veiculo.getIdentf());
            statement.setInt(6, veiculo.getNumChassi());
            statement.setString(7, veiculo.getTipo());
            statement.setString(8, veiculo.getCarroceria());
            statement.setInt(9, veiculo.getCapacPassag());
            statement.setDouble(10, veiculo.getEspacoCarga());
            statement.setString(11, veiculo.getMotorizacao());
            statement.setString(12, veiculo.getTransmissao());
            statement.setDouble(13, veiculo.getConsumo());
            // exibe erros ao executar a query
            statement.executeUpdate();
            conexao.commit();

            System.out.println("Insert executado com sucesso!");
        } catch (Exception ex) {
            System.out.println("initializeErro ao executar a query: " + ex.getMessage());
        } finally {
            conexao.close();
        }
    }

    public static void insertViagem(Viagem viagem) throws SQLException {

        // inicializa conexão com o banco de dados
        Connection conexao = initConnection();

        String sql = "INSERT INTO viagem (ps_id, lugar_ida, lugar_volta, veiculo_ida, veiculo_volta, data_ida, data_volta) values (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement statement = conexao.prepareStatement(sql)) {
            statement.setInt(1, viagem.getPassageiros().getId());
            statement.setString(2, viagem.getLugarIda().getNome());
            statement.setString(3, viagem.getLugarVolta().getNome());
            statement.setString(4, viagem.getTranspIda().getNome());
            statement.setString(5, viagem.getTranpVolta().getNome());
            statement.setDate(6, (Date) viagem.getDataIda());
            statement.setDate(7, (Date) viagem.getDataVolta());
            // exibe erros ao executar a query
            statement.executeUpdate();
            conexao.commit();

            System.out.println("Insert executado com sucesso!");
        } catch (Exception ex) {
            System.out.println("initializeErro ao executar a query: " + ex.getMessage());
        } finally {
            conexao.close();
        }
    }

    // retorna lista com todos os passageiros
    public static List<Passageiros> selectAllPassageiros() throws SQLException {

        Connection conexao = initConnection();
        List<Passageiros> passageiros = new ArrayList<>();

        String sql = "select * from passageiro";
        try (PreparedStatement statement = conexao.prepareStatement(sql)) {
            ResultSet result = statement.executeQuery(sql);

            while (result.next()) {
                int psId = result.getInt("ps_id");
                String nome = result.getString("nome");
                int cpf = result.getInt("cpf");
                int telefone = result.getInt("telefone");
                String email = result.getString("email");
                String senha = result.getString("senha");
                Date nascimento = result.getDate("nascimento");
                int cep = result.getInt("cep");
                String logradouro = result.getString("logradouto");
                String numero = result.getString("numero");
                String bairro = result.getString("bairro");
                String municipio = result.getString("municipio");
                String uf = result.getString("uf");

                Passageiros passageiro = new Passageiros(psId, nome, cpf, telefone, nascimento, email, senha, cep,
                        logradouro, numero, bairro, municipio, uf);

                passageiros.add(passageiro);
            }
        }
        return passageiros;
    }
}
