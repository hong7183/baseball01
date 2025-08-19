package com.myspring.baseball.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.myspring.baseball.dao.baseballDAO;
import com.myspring.baseball.vo.baseballVO;

@Service("baseballService")
public class baseballServiceImpl implements baseballService {
	
	@Autowired
	private baseballDAO baseballDAO;

	@Override
	public List listMembers() throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delMember(String id) throws DataAccessException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateMember(baseballVO memberVO) throws DataAccessException {
		// TODO Auto-generated method stub
		
	} 
	
	// memberDAO �Ӽ��� setter�� �̿��Ͽ� ���� ���Ͽ��� ������ memberDAO ���� �����մϴ�.
//	public void setMemberDAO(MemberDAO memberDAO) {
//		this.memberDAO = memberDAO;
//	}
	
	
	/*public List searchMemberList(String name) throws DataAccessException{
		List searchMemberList = null;
		searchMemberList = memberDAO.searchMemberList(name);
		return searchMemberList;
	}
	
	@Override
	public List listMembers() throws DataAccessException{
		List membersList = null;
		membersList = memberDAO.selectAllMembers();
		return membersList;
	}
	
	@Override
	public int addMember(MemberVO memberVO) throws DataAccessException{
		int addMember = 0;
		addMember = memberDAO.insertMember(memberVO);
		return addMember;
	}
	
	@Override
	public MemberVO login(MemberVO memberVO) throws DataAccessException{
		MemberVO loginMember;
		loginMember = memberDAO.selectLoginMember(memberVO);
		return loginMember;
	}
	
	@Override
	public void updateMember(MemberVO memberVO) throws DataAccessException{
		memberDAO.updateMember(memberVO);
	}
	
	@Override
	public void delMember(String id) throws DataAccessException{
		memberDAO.deleteMember(id);
	}

	@Override
	public void updateMember(baseballVO memberVO) throws DataAccessException {
		// TODO Auto-generated method stub
		
	}*/
	
}
