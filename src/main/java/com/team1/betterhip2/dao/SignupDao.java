package com.team1.betterhip2.dao;

public interface SignupDao {
	
	public int signupCheckId(String user_id);
	public int signup(String user_id, int user_pw, String user_name,
			String user_email, String user_phone, String user_postcode,
			String user_address, String user_address_detail, boolean user_marketing
			);
}
