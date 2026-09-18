package com.rays.junit;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.sql.SQLException;

import org.junit.Test;

import junit.framework.TestCase;

public class TestAsseertNull extends TestCase {

	@Test
	public void testFindByPk() throws ClassNotFoundException, SQLException {
		UserBean bean = UserModel.findByPk(33);

		assertNull("UserBean is not null", bean);
		// assertTrue(bean == null);
		assertTrue("is not true", bean == null);

	}
}
