package ControllerDb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Support {

	private String password = "gianluca";
	private String user = "root";
	private String host = "localhost";
	private String port ="3306";
	private String dbName = "myTodoApp";
	private Connection con;
   
	public Support() {
		super();
	}

	public Support(String password, String user, String host, String port, String dbNam) {
		this.password = password;
		this.user = user;
		this.host = host;
		this.port = port;
		this.dbName = dbNam;

	}

	public Connection OpenConnection() throws ClassNotFoundException, SQLException {
		String connectionString = String.format("jdbc:mysql://%s:%s/%s", host, port, dbName);
		System.out.println("connection string: " + connectionString);
		Class.forName("com.mysql.cj.jdbc.Driver");
		this.con = DriverManager.getConnection(connectionString, user, password);
		return con;
	}

	public void OpenTransaction() throws SQLException {
		// Vedi https://www.baeldung.com/java-transactions
		con.setAutoCommit(false);
	}

	public void CommitTransaction() throws SQLException {
		con.commit();
	}

	public void rollBackTransaction() throws SQLException {
		con.rollback();
	}

	public void closeConnection() throws SQLException {
		if (!con.isClosed())
			con.close();
	}

}// fine classe
