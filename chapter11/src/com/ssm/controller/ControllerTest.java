package com.ssm.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/con")
public class ControllerTest/* implements Controller */ {
//	@Override
//	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
//		ModelAndView m=new ModelAndView();
//		m.addObject("msg","第一个Spring MVC程序");
//		m.setViewName("/WEB-INF/jsp/welcome.jsp");
//		return m;
//	}

    @RequestMapping("/anno")
    public String handRequest(HttpServletRequest request, HttpServletResponse response, Model model) {
        model.addAttribute("msg", "蒋政权牛逼");
        return "welcome";
    }

}
