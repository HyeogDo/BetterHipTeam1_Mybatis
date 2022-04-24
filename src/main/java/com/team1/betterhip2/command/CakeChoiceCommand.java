package com.team1.betterhip2.command;

import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.ui.Model;

import com.team1.betterhip2.dao.CakeInfoDao;
import com.team1.betterhip2.dto.CakeInfoDto;

public class CakeChoiceCommand implements BetterHipCommand {

	@Override
	public void execute(SqlSession sqlSession, HttpServletRequest request, Model model) {
		// TODO Auto-generated method stub
		Map<String, Object> map = model.asMap();
		request = (HttpServletRequest) map.get("request");
		
		CakeInfoDao dao = sqlSession.getMapper(CakeInfoDao.class);
//		HttpSession session = request.getSession();
//		String user_id = session.getAttribute("USER_ID").toString();			
		int cake_id = Integer.parseInt(request.getParameter("cake_id").toString());		
		
		ArrayList<CakeInfoDto> dtos = dao.list("test11", cake_id);
		request.setAttribute("LIST", dtos);
	}

}
