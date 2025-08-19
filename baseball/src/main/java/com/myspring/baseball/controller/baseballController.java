package com.myspring.baseball.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

public interface baseballController {
	public ModelAndView listMembers(HttpServletRequest request, HttpServletResponse response)
	throws Exception;
}
