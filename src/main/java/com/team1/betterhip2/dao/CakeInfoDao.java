package com.team1.betterhip2.dao;

import java.util.ArrayList;

import com.team1.betterhip2.dto.CakeInfoDto;

public interface CakeInfoDao {
	public ArrayList<CakeInfoDto> list(String user_id, int cake_id);
}
