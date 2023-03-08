package com.spring.board.service;

import java.util.List;

import com.spring.board.dto.TestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.spring.board.dao.TestDAO;



@Service
public class TestServiceImpl implements TestService {

	@Autowired
	private TestDAO dao;

	

	@Override

	public List<TestVO> test() throws Exception {

		// TODO Auto-generated method stub

		return dao.test();

	}
	
	@Override
	public void insertBoard2(TestVO TestVO) throws Exception{
		dao.insertBoard2(TestVO);
	}
	
	@Override
	public TestVO detail(int bo_no) throws Exception {
		return dao.detail(bo_no);
	}
	
	@Override
	public void update(TestVO testVO)throws Exception {
		dao.update(testVO);
	}
	
	@Override
	public void delete(int bo_no) throws Exception{
		dao.delete(bo_no);
	}
}