package com.rays.junit;

import static org.junit.Assert.assertNotNull;

import java.sql.SQLException;

import org.junit.Test;

import junit.framework.TestCase;

 
public class TestAssertNotNull extends TestCase {

	@Test
	public void testFindByPk() throws ClassNotFoundException, SQLException {

		UserBean bean = UserModel.findByPk(6);
		assertNotNull("User is null", bean);
	}
}
