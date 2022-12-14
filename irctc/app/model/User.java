package com.irctc.app.model;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class User {
	private String username;
	private String password;
	
	@Override
	public String toString() {
		return "User [username=" + username + ", ]";
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

}
