package org.openjfx.travel.Connection;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class SQLConnection {
    static Connection conexao;


    private static Map<String, String> readEnvFile() {
        Map<String, String> envCode = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("travel/.env"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] keyValue = line.split(":");
                if (keyValue.length == 2) {
                    String key = keyValue[0].trim();
                    String value = keyValue[1].trim();
                    envCode.put(key, value);
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo .env: " + e.getMessage());
        }

        return envCode;
    }


    // método de conexão com banco
    public static Connection connect(){
        // leitor de arquivo .env
        // lê arquivo e trás parâmetros de conexão com o banco
        Map<String, String> envCode = readEnvFile();
        
        // Dados para conexão com banco
        String host = envCode.get("host");
        String port = envCode.get("port");
        String userName = envCode.get("userName");
        String password = envCode.get("password");
        String database = envCode.get("database");
        // driver de conexão
        String driver = "jdbc:postgresql://" + host + ":" + port + "/" + database;

        try {
            //carrega a classe do driver do PostgreSQL na memória permitindo comunicação com o banco de dados
            Class.forName("org.postgresql.Driver");

            // objeto "conexao" para execução de comandos SQL
            conexao = DriverManager.getConnection(driver, userName, password);
            conexao.setAutoCommit(false);
            System.out.println("Banco conectado com sucesso!");
        // tratamento de erros
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver do banco de dados não localizado!");
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar com o banco de dados: " + ex.getMessage());
        } 
        return conexao;
    }
}