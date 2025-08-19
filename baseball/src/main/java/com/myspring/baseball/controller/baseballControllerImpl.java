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
	public ModelAndView listMembers(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		return null;
	} 
	
//	
//	public void setMemberService(MemberService memberService) {
//		this.memberService = memberService;
//	}
	
	/*
	 * // �˻�
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
	 * logger.info("info 레벨: viewName = "+viewName);
	 * logger.debug("debug 레벨: viewName = "+viewName); List membersList =
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
	 * session.setAttribute("member",memberVO); // 로그인 정보를 활용하기 위해 사용
	 * session.setAttribute("isLogOn",true); // 로그인 유무를 체크 시 사용
	 * 
	 * mav.setViewName("redirect:/member/listMembers.do"); }else {
	 * logger.info("null 입니다."); mav.setViewName("redirect:/member/loginForm.do"); }
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
	 * // 1. request �����͸� MemberVO�� ��´�. //MemberVO memberVO = new MemberVO();
	 * //bind(request, memberVO); // 2. memberService�� �޼��带 �߰� �Ѵ�.
	 * memberService.updateMember(memberVO);
	 * 
	 * // 3. ����Ʈ �������� �̵� ModelAndView mav = new
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
	 * // 1. request �����´�. // String id = request.getParameter("id");
	 * System.out.println("id = "+ id);
	 * 
	 * // 2. memberService�� �޼��带 �߰� �Ѵ�. memberService.delMember(id);
	 * 
	 * // 3. ����Ʈ �������� �̵� ModelAndView mav = new
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
	 * // http://localhost:8090/member/listMember.do�� ��û�� int begin = 0; // if
	 * (!((contextPath == null) || ("".equals(contextPath)))) { begin =
	 * contextPath.length(); // ��ü ��û�� �� ���̸� ���� }
	 * 
	 * int end; if (uri.indexOf(";") != -1) { end = uri.indexOf(";"); // ��û uri��
	 * ';'�� ���� ��� ';'���� ��ġ�� ���� } else if (uri.indexOf("?") != -1) { end =
	 * uri.indexOf("?"); // ��û uri�� '?'�� ���� ��� '?' ���� ��ġ�� ���� } else {
	 * end = uri.length(); }
	 * 
	 * // http://localhost:8090/member/listMember.do�� ��û�� ���� '.do'�� ������ //
	 * http://localhost:8090/member/listMember�� ���� ��, // �ٽ�
	 * http://localhost:8090/member/listMember���� �������� ù��° '/' ��ġ�� ���� ��,
	 * �� ���� // listMember�� ���Ѵ�. String fileName = uri.substring(begin, end);
	 * if (fileName.indexOf(".") != -1) { fileName = fileName.substring(0,
	 * fileName.lastIndexOf(".")); // ��û���� �������� ���� '.'�� ��ġ�� ������,
	 * '.do' �տ������� ���ڿ��� // ���� } if (fileName.lastIndexOf("/") != -1) {
	 * fileName = fileName.substring(fileName.lastIndexOf("/"), fileName.length());
	 * // ��û���� �������� ���� '/'�� ��ġ�� ������, // '/' ���������� ���ڿ��� ���� }
	 * return fileName; }
	 */

}
