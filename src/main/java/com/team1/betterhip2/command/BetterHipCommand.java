package com.team1.betterhip2.command;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.ui.Model;

public interface BetterHipCommand {
	public void execute(SqlSession sqlSession,HttpServletRequest request,Model model);
}
