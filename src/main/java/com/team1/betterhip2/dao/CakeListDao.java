package com.team1.betterhip2.dao;

import java.util.ArrayList;

import com.team1.betterhip2.dto.CakeListDto;

public interface CakeListDao {
	
	public ArrayList<CakeListDto> list( String search, String order, int start, int len  );
	public int getTotalRows(String search);
}
