package com.spring.board.service;

import java.util.List;

import com.spring.board.dto.TestVO;

public interface TestService {
	public List<TestVO> test() throws Exception;
	
	public void insertBoard2(TestVO testVO) throws Exception;
	
	public TestVO detail(int bo_no) throws Exception;
	
	public void update(TestVO testVO) throws Exception;
	
	public void delete(int bo_no) throws Exception;
}
