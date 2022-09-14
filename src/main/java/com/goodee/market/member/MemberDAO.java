package com.goodee.market.member;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO implements MemberInterface{
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE = "com.goodee.market.MemberDAO.";

	@Override
	public MemberDTO getLogin(MemberDTO memberDTO) throws Exception {
		return sqlSession.selectOne(NAMESPACE + "getLogin", memberDTO);
	}
	
	

}
