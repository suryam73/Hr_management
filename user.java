package org.hr_system;


	public interface User {
		 String getUsername();
		 String getPassword();
		 String login(String username, String password);
		}