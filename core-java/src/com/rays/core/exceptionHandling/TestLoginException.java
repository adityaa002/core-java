package com.rays.core.exceptionHandling;

public class TestLoginException {
	public static void main(String[] args) {
		String login = "admin";
		String pwd = "admin";

		System.out.println("before");

		if (login.equals("admin") && pwd.equals("adin")) {
			System.out.println("Login Successful...!!!");

		} else {
			LoginException e = new LoginException("Invalid Credential.. Please enter valid credentials");

			try {
				throw e;
			} catch (LoginException e2) {

				System.out.println(e2);

			}

		}
		System.out.println("After");
	}
}
