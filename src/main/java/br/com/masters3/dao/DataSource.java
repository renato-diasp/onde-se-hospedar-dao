package br.com.masters3.dao;
import java.sql.DriverManager;
import java.sql.Connection;

public class DataSource {
	
	private Connection connection;
	
	private String url;
	private String host;
	private String username;
	private String password;
	private String database;
	private int port;
	
	public DataSource() {
		try {
			Class.forName("org.postgresql.Driver");
//			host = "ec2-54-82-205-3.compute-1.amazonaws.com";
//			port = 5432;
//			username = "dnzarfezschlaz";
//			password = "8949d99c3b4aae79aba79218aa146b07cecc16b004f4c034bc4443cf06acabd3";
//			database = "d78b8m4mjojpcn";
			
			host = "localhost";
			port = 5432;
			username = "postgres";
			password = "changeme";
			database = "postgres";

			
			url = "jdbc:postgresql://localhost:5432/postgres";
//			url = "jdbc:postgresql://" + host + ":" + port + "/" + database;
			connection = DriverManager.getConnection(url,username,password);
			
			if (connection != null) {
				System.out.println("Conectado com Sucesso");
			} else {
				System.out.println("Falhou na conexao"); 
			}
		}
		catch(Exception ex) {
			System.out.println("Falha na conexão com o BD: " + ex.getMessage());
		}
	}
	
	public Connection getConnection() {
		return this.connection;
	}
}
