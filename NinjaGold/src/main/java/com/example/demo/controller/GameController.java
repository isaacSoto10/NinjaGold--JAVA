package com.example.demo.controller;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GameController {
	@RequestMapping(value="/getGold", method= RequestMethod.POST)
	public String getGold(@RequestParam(value="button")String button, HttpSession session) {
		if(button.equals("farm")) {
			
			int goldGenerate = ThreadLocalRandom.current().nextInt(10, 20);
			ArrayList<String> list = (ArrayList<String>) session.getAttribute("eventLog");
			list.add(0,"<p class greentext> you have earned"+ goldGenerate +"</p>");
			session.setAttribute("gold", (int)session.getAttribute("gold")+ goldGenerate);
			session.setAttribute("logList", list);
			
		}
		if(button.equals("cave")) {

			int goldGenerate = ThreadLocalRandom.current().nextInt(5, 10);
			ArrayList<String> list = (ArrayList<String>) session.getAttribute("eventLog");
			list.add(0,"<p class greentext> you have earned"+ goldGenerate +"</p>");
			session.setAttribute("gold", (int)session.getAttribute("gold")+ goldGenerate);
			session.setAttribute("logList", list);
		}
		
		if(button.equals("house")) {

			int goldGenerate = ThreadLocalRandom.current().nextInt(2, 5);
			ArrayList<String> list = (ArrayList<String>) session.getAttribute("eventLog");
			list.add(0,"<p class greentext> you have earned"+ goldGenerate +"</p>");
			session.setAttribute("gold", (int)session.getAttribute("gold")+ goldGenerate);
			session.setAttribute("logList", list);
		}
		if(button.equals("casino")) {
			int goldGenerate = ThreadLocalRandom.current().nextInt(-50, 50 + 1);
			ArrayList<String> list = (ArrayList<String>) session.getAttribute("eventLog");
			list.add(0,"<p class=greentext>Earned "+goldGenerate+" gold from the casino! lady luck has been kind to you!</p>");
			session.setAttribute("gold", (int)session.getAttribute("gold")+goldGenerate);
			session.setAttribute("logList", list);
				}
		
		
		
		return "redirect:/";
	}
	
	@RequestMapping("/reset")
	public String reset(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}

}
