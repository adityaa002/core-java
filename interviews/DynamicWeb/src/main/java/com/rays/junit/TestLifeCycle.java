package com.rays.junit;

import static org.junit.Assert.assertEquals;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestLifeCycle {

	private static Connection conn = null;
	private static PreparedStatement pstmt = null;

	@BeforeClass
	public static void beforeClass() throws ClassNotFoundException, SQLException {
		System.out.println(" In before class");
		System.out.println("Connection established..!");

		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/interviews", "root", "root");
		System.out.println("====================================");

	}

	@Before
	public void before() throws SQLException {
		System.out.println("In Before test method..!");
		String sql = "insert into emp(id,name,salary) values(?,?,?)";
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, 16);
		pstmt.setString(2, "malay");
		pstmt.setInt(3, 5400);

		int i = pstmt.executeUpdate();
		System.out.println("Record Inserted : " + i);
		System.out.println("====================================");
		pstmt.close();

	}

	@Test
	public void findMax() throws ClassNotFoundException, SQLException {
		System.out.println("Test Method");
		UserBean bean = UserModel.findByPk(16);
		System.out.println("====================================");
		assertEquals("Malay", bean.getName());

	}
@After
	public void after() throws SQLException {

		String sql = "delete from emp where id = ?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, 16);
		int i = pstmt.executeUpdate();
		pstmt.close();
		System.out.println("Record Deleted success." + i);
		System.out.println("====================================");

	}

	@AfterClass
	public static void afterClass() throws SQLException {
		System.out.println("After Class executed.");

		if (conn != null) {
			conn.close();
		}

	}
}