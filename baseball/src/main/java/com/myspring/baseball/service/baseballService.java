package com.myspring.baseball.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.myspring.baseball.vo.baseballVO;

public interface baseballService {
	public List listMembers() throws DataAccessException;
	public void delMember(String id) throws DataAccessException;
	public void updateMember(baseballVO memberVO) throws DataAccessException;

}
