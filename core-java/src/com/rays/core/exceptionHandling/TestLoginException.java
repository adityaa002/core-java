package com.rays.core.exceptionHandling;

public class TestLoginException {
	public static void main(String[] args) {
		String login = "kunal";
		String pwd = "kunal";

		if (login.equals("kl") && login.equals("kunal")) {
			System.out.println("Login Successfully...!!");
		} else {
			LoginException e = new LoginException("Invalid Credentials....!!!   Please enter valid credentials");
			try {
				throw e;
			} catch (LoginException e1) {
				System.out.println(e.getMessage());
				e1.printStackTrace();
			}
		}

	}
}
