package com.myspring.baseball.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.myspring.baseball.service.baseballService;
import com.myspring.baseball.vo.baseballVO;


@Controller("baseballController")
public class baseballControllerImpl extends MultiActionController implements baseballController{
	private static final Logger logger = LoggerFactory.getLogger(baseballControllerImpl.class);
	
	@Autowired
	private baseballService memberService; 
	
	@Autowired
	baseballVO baseballVO;

	@Override
	@RequestMapping(value="/baseball/listMembers.do" ,method = RequestMethod.GET)
	public ModelAndView listMembers(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		response.setContentType("html/text;charset=utf-8");
		String viewName = getViewName(request);
		System.out.println("viewName :: "+ viewName );
		List membersList = memberService.listMembers();
		ModelAndView mav = new ModelAndView(viewName);
		mav.addObject("membersList", membersList);
		return mav;
	}
	
	private String getViewName(HttpServletRequest request) throws Exception {
		String contextPath = request.getContextPath();
		String uri = (String) request.getAttribute("javax.servlet.include.request_uri");
		if (uri == null || uri.trim().equals("")) {
			uri = request.getRequestURI();
		}

		int begin = 0;
		if (!((contextPath == null) || ("".equals(contextPath)))) {
			begin = contextPath.length();
		}

		int end;
		if (uri.indexOf(";") != -1) {
			end = uri.indexOf(";");
		} else if (uri.indexOf("?") != -1) {
			end = uri.indexOf("?");
		} else {
			end = uri.length();
		}

		String viewName = uri.substring(begin, end);
		if (viewName.indexOf(".") != -1) {
			viewName = viewName.substring(0, viewName.lastIndexOf("."));
		}
		if (viewName.lastIndexOf("/") != -1) {
			viewName = viewName.substring(viewName.lastIndexOf("/", 1), viewName.length());
		}
		return viewName;
	}
	
	
//	
//	public void setMemberService(MemberService memberService) {
//		this.memberService = memberService;
//	}
	
	/*
	 * // 占싯삼옙
	 * 
	 * @RequestMapping(value="/member/searchMemberList.do", method=
	 * {RequestMethod.GET, RequestMethod.POST}) public ModelAndView
	 * searchMemberList(@RequestParam("name") String name, HttpServletRequest
	 * request, HttpServletResponse response) throws Exception{
	 * 
	 * String viewName = getViewName(request); ModelAndView mav = new
	 * ModelAndView(viewName);
	 * 
	 * // String name = request.getParameter("name");
	 * 
	 * List searchMemberList = baseballService.searchMemberList(name);
	 * mav.addObject("membersList", searchMemberList); mav.addObject("name", name);
	 * 
	 * return mav; }
	 */
	
	/*
	 * @RequestMapping(value="/member/listMembers.do", method={RequestMethod.GET,
	 * RequestMethod.POST}) public ModelAndView listMembers(HttpServletRequest
	 * request, HttpServletResponse response) throws Exception{
	 * 
	 * String viewName = getViewName(request);
	 * logger.info("info �젅踰�: viewName = "+viewName);
	 * logger.debug("debug �젅踰�: viewName = "+viewName); List membersList =
	 * memberService.listMembers(); ModelAndView mav = new ModelAndView(viewName);
	 * mav.addObject("membersList", membersList);
	 * 
	 * return mav; }
	 */
	
	/*
	 * @RequestMapping(value="/member/memberForm.do", method=RequestMethod.GET)
	 * public ModelAndView memberForm(HttpServletRequest request,
	 * HttpServletResponse response) throws Exception{
	 * 
	 * String viewName = getViewName(request); ModelAndView mav = new
	 * ModelAndView(viewName);
	 * 
	 * return mav; }
	 * 
	 * @RequestMapping(value="/member/loginForm.do", method=RequestMethod.GET)
	 * public ModelAndView loginForm(HttpServletRequest request, HttpServletResponse
	 * response) throws Exception{
	 * 
	 * String viewName = getViewName(request); ModelAndView mav = new
	 * ModelAndView(viewName); return mav; }
	 * 
	 * @RequestMapping(value="/member/login.do", method=RequestMethod.POST) public
	 * ModelAndView login(@ModelAttribute("member") MemberVO member,
	 * HttpServletRequest request, HttpServletResponse response) throws Exception{
	 * 
	 * String viewName = getViewName(request); ModelAndView mav = new
	 * ModelAndView(viewName); memberVO = memberService.login(member);
	 * 
	 * if(memberVO != null) {
	 * 
	 * HttpSession session =request.getSession();
	 * session.setAttribute("member",memberVO); // 濡쒓렇�씤 �젙蹂대�� �솢�슜�븯湲� �쐞�빐 �궗�슜
	 * session.setAttribute("isLogOn",true); // 濡쒓렇�씤 �쑀臾대�� 泥댄겕 �떆 �궗�슜
	 * 
	 * mav.setViewName("redirect:/member/listMembers.do"); }else {
	 * logger.info("null �엯�땲�떎."); mav.setViewName("redirect:/member/loginForm.do"); }
	 * return mav; }
	 * 
	 * 
	 * @RequestMapping(value="/member/logout.do", method=RequestMethod.GET) public
	 * ModelAndView logout( HttpServletRequest request, HttpServletResponse
	 * response) throws Exception{
	 * 
	 * 
	 * ModelAndView mav = new ModelAndView(); HttpSession session =
	 * request.getSession();
	 * 
	 * session.removeAttribute("member"); session.removeAttribute("isLogOn");
	 * 
	 * mav.setViewName("redirect:/member/listMembers.do");
	 * 
	 * return mav; }
	 * 
	 * 
	 * @RequestMapping(value="/member/addMember.do", method=RequestMethod.POST)
	 * public ModelAndView addMember(@ModelAttribute("member") MemberVO memberVO,
	 * HttpServletRequest request, HttpServletResponse response) throws Exception{
	 * 
	 * request.setCharacterEncoding("utf-8");
	 * response.setContentType("text/html; charset=utf-8");
	 * 
	 * int addMember = memberService.addMember(memberVO);
	 * 
	 * ModelAndView mav = new ModelAndView("redirect:/member/listMembers.do");
	 * 
	 * return mav; }
	 * 
	 * @RequestMapping(value="/member/memberUpdateForm.do",
	 * method={RequestMethod.GET, RequestMethod.POST}) public ModelAndView
	 * memberUpdateForm(@ModelAttribute("member") MemberVO memberVO,
	 * HttpServletRequest request, HttpServletResponse response) throws Exception{
	 * 
	 * String viewName = getViewName(request);
	 * 
	 * //MemberVO memberVO = new MemberVO(); //bind(request, memberVO);
	 * 
	 * ModelAndView mav = new ModelAndView(viewName); mav.addObject("member",
	 * memberVO);
	 * 
	 * return mav; }
	 * 
	 * @RequestMapping(value="/member/updateMember.do", method={RequestMethod.GET,
	 * RequestMethod.POST}) public ModelAndView
	 * updateMember(@ModelAttribute("member") MemberVO memberVO, HttpServletRequest
	 * request, HttpServletResponse response) throws Exception{
	 * 
	 * request.setCharacterEncoding("utf-8");
	 * response.setContentType("text/html; charset=utf-8");
	 * 
	 * // 1. request 占쏙옙占쏙옙占싶몌옙 MemberVO占쏙옙 占쏙옙쨈占�. //MemberVO memberVO = new MemberVO();
	 * //bind(request, memberVO); // 2. memberService占쏙옙 占쌨쇽옙占썲를 占쌩곤옙 占싼댐옙.
	 * memberService.updateMember(memberVO);
	 * 
	 * // 3. 占쏙옙占쏙옙트 占쏙옙占쏙옙占쏙옙占쏙옙 占싱듸옙 ModelAndView mav = new
	 * ModelAndView("redirect:/member/listMembers.do");
	 * 
	 * return mav; }
	 * 
	 * @RequestMapping(value="/member/delete.do", method={RequestMethod.GET,
	 * RequestMethod.POST}) public ModelAndView delMember(@RequestParam("id") String
	 * id, HttpServletRequest request, HttpServletResponse response) throws
	 * Exception{
	 * 
	 * request.setCharacterEncoding("utf-8");
	 * response.setContentType("text/html; charset=utf-8");
	 * 
	 * // 1. request 占쏙옙占쏙옙占승댐옙. // String id = request.getParameter("id");
	 * System.out.println("id = "+ id);
	 * 
	 * // 2. memberService占쏙옙 占쌨쇽옙占썲를 占쌩곤옙 占싼댐옙. memberService.delMember(id);
	 * 
	 * // 3. 占쏙옙占쏙옙트 占쏙옙占쏙옙占쏙옙占쏙옙 占싱듸옙 ModelAndView mav = new
	 * ModelAndView("redirect:/member/listMembers.do");
	 * 
	 * return mav; }
	 * 
	 * 
	 * private String getViewName(HttpServletRequest request) throws Exception {
	 * String contextPath = request.getContextPath();
	 * 
	 * System.out.println("contextPath :: "+ contextPath);
	 * 
	 * String uri = (String)
	 * request.getAttribute("javax.servlet.include.request_uri"); if (uri == null ||
	 * uri.trim().equals("")) { uri = request.getRequestURI(); }
	 * 
	 * // http://localhost:8090/member/listMember.do占쏙옙 占쏙옙청占쏙옙 int begin = 0; // if
	 * (!((contextPath == null) || ("".equals(contextPath)))) { begin =
	 * contextPath.length(); // 占쏙옙체 占쏙옙청占쏙옙 占쏙옙 占쏙옙占싱몌옙 占쏙옙占쏙옙 }
	 * 
	 * int end; if (uri.indexOf(";") != -1) { end = uri.indexOf(";"); // 占쏙옙청 uri占쏙옙
	 * ';'占쏙옙 占쏙옙占쏙옙 占쏙옙占� ';'占쏙옙占쏙옙 占쏙옙치占쏙옙 占쏙옙占쏙옙 } else if (uri.indexOf("?") != -1) { end =
	 * uri.indexOf("?"); // 占쏙옙청 uri占쏙옙 '?'占쏙옙 占쏙옙占쏙옙 占쏙옙占� '?' 占쏙옙占쏙옙 占쏙옙치占쏙옙 占쏙옙占쏙옙 } else {
	 * end = uri.length(); }
	 * 
	 * // http://localhost:8090/member/listMember.do占쏙옙 占쏙옙청占쏙옙 占쏙옙占쏙옙 '.do'占쏙옙 占쏙옙占쏙옙占쏙옙 //
	 * http://localhost:8090/member/listMember占쏙옙 占쏙옙占쏙옙 占쏙옙, // 占쌕쏙옙
	 * http://localhost:8090/member/listMember占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙占쏙옙 첫占쏙옙째 '/' 占쏙옙치占쏙옙 占쏙옙占쏙옙 占쏙옙,
	 * 占쏙옙 占쏙옙占쏙옙 // listMember占쏙옙 占쏙옙占싼댐옙. String fileName = uri.substring(begin, end);
	 * if (fileName.indexOf(".") != -1) { fileName = fileName.substring(0,
	 * fileName.lastIndexOf(".")); // 占쏙옙청占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙 '.'占쏙옙 占쏙옙치占쏙옙 占쏙옙占쏙옙占쏙옙,
	 * '.do' 占쌌울옙占쏙옙占쏙옙占쏙옙 占쏙옙占쌘울옙占쏙옙 // 占쏙옙占쏙옙 } if (fileName.lastIndexOf("/") != -1) {
	 * fileName = fileName.substring(fileName.lastIndexOf("/"), fileName.length());
	 * // 占쏙옙청占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙 '/'占쏙옙 占쏙옙치占쏙옙 占쏙옙占쏙옙占쏙옙, // '/' 占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙占쌘울옙占쏙옙 占쏙옙占쏙옙 }
	 * return fileName; }
	 */

}
