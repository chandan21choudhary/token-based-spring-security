package com.java.apigaeway.model;

public class JwtReponse {
	
	private String token;

	/**
	 * @return the token
	 */
	public String getToken() {
		return token;
	}

	/**
	 * @param token the token to set
	 */
	public void setToken(String token) {
		this.token = token;
	}

	public JwtReponse(String token) {
		super();
		this.token = token;
	}
	
	

}
