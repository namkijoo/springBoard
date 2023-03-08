package com.spring.board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import com.spring.board.dto.TestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@Repository
@Service
public class TestDAOImpl implements TestDAO {
	private static final String namespace="com.spring.board.testMapper";
	
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<TestVO> test() throws Exception {
		return sqlSession.selectList(namespace+".test");
	}
	
	@Override
	public void insertBoard2(TestVO testVO) throws Exception{
		sqlSession.insert(namespace+".insertBoard2",testVO);
	}
	
	@Override
	public TestVO detail(int no) throws Exception{
		return sqlSession.selectOne(namespace+".detail",no);
	}
	
	@Override
	public void update(TestVO testVO) throws Exception{
		sqlSession.update(namespace+".update",testVO);
	}
	
	@Override
	public void delete(int no) throws Exception{
		sqlSession.delete(namespace+".delete",no);
	}

}
