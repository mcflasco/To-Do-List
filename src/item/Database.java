package item;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {

	static Statement st;
	static ResultSet rs;
	static Connection conn;

// Database Connection==================================================================================================================================
	public static Connection startDatabase() {
		String jdbcURL = "jdbc:mysql://localhost:3306/todolist";
		String user = "root";
		String password = "root";

		try {

			System.out.println("Connecting" + jdbcURL);

			conn = DriverManager.getConnection(jdbcURL, user, password);
			st = conn.createStatement();
			System.out.println("Connection Successful");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

//List data from database ==============================================================================================================================
	
	public void listData() {
		try {
			rs = st.executeQuery("SELECT * FROM item");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			while (rs.next()) {
				try {
					int id = rs.getInt("id");
					String test = rs.getString("item");
					System.out.println("Item ID: " + id + " " + test);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
//Add data to database ================================================================================================================================
	
	public static void addData(String userItem) {
		try {
			st.executeUpdate("INSERT INTO item(item) " + "VALUES ('" + userItem + "')");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
