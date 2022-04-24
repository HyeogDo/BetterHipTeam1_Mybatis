package com.team1.betterhip2.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.team1.betterhip2.command.BetterHipCommand;
import com.team1.betterhip2.command.CakeChoiceCommand;

@Controller
public class CakeListController {
	
	//Field
	BetterHipCommand cakeListViewCommand, cakeChoiceCommand;
	
	
	//sqlsession, command AutoWired
	@Autowired
	private SqlSession sqlSession;
	
	@Autowired
	public void setCommand(BetterHipCommand cakeListViewCommand) {
		this.cakeListViewCommand = cakeListViewCommand;
	}
	
	//Method
	
	//케이크 리스트 출력
	@RequestMapping("/cakeList")
	public String cakeList(HttpServletRequest request, Model model) {
		
		model.addAttribute("request", request);
		cakeListViewCommand.execute(sqlSession,request,model);
		return "order/cakeList";
	}
	
	@RequestMapping("/cakeChoice")
	public String cakeChoice(HttpServletRequest request, Model model) {
		
		model.addAttribute("request", request);
		cakeChoiceCommand.execute(sqlSession, request, model);
		
		return "order/cakeInfo";
	}
	
	
	
	
	
	
}
