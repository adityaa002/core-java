package com.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class TestINOUTProcedure {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/interviews", "root", "root");

		CallableStatement cs = conn.prepareCall("{ CALL empInOut1(?)}");

		cs.setInt(1, 4);
		cs.registerOutParameter(1, Types.INTEGER);
		cs.execute();
		System.out.println(cs.getInt(1));
		
		
		
		

	}
}
