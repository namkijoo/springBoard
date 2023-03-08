package com.spring.board.dao;

import java.util.List;

import com.spring.board.dto.TestVO;

public interface TestDAO {
	public List<TestVO> test() throws Exception; //조회
	
	public void insertBoard2(TestVO testVO) throws Exception; //글쓰기
	
	public TestVO detail(int no) throws Exception; //상세보기
	
	public void update(TestVO testVO) throws Exception;
	
	public void delete(int bo_no) throws Exception;
}
