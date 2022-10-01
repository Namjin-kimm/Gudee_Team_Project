package com.goodee.market.member;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO implements MemberInterface{
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE = "com.goodee.market.member.MemberDAO.";

	//로그인
	@Override
	public MemberDTO getLogin(MemberDTO memberDTO) throws Exception {
		return sqlSession.selectOne(NAMESPACE + "getLogin", memberDTO);
	}
	
	//회원가입
	@Override
	public int setJoin(MemberDTO memberDTO) throws Exception {
		return sqlSession.insert(NAMESPACE + "setJoin", memberDTO);
	}
	
	//회원가입 시 멤버 등급 인서트
	@Override
	public int setMemberRoles(MemberDTO memberDTO) throws Exception {
		return sqlSession.insert(NAMESPACE + "setMemberRoles", memberDTO);
	}
	

	//멤버 정보 불러오기
	@Override
	public MemberDTO getMemberDetail(MemberDTO memberDTO) throws Exception {
		return sqlSession.selectOne(NAMESPACE + "getMemberDetail", memberDTO);
	}


	//회원 정보 수정
	@Override
	public int setInfoUpdate(MemberDTO memberDTO) throws Exception {
		return sqlSession.update(NAMESPACE + "setInfoUpdate", memberDTO);
	}
	
	//파일 추가
	@Override
	public int setAddFile(MemberFileDTO memberFileDTO) throws Exception {
		return sqlSession.insert(NAMESPACE + "setAddFile", memberFileDTO);
	}

	//프로필 이미지 삭제
	@Override
	public int setFileDelete(MemberFileDTO memberFileDTO) throws Exception {
		return sqlSession.delete(NAMESPACE + "setFileDelete", memberFileDTO);
	}

	//기존 프로필 이미지 정보 불러오기
	@Override
	public MemberFileDTO getFileDetail(MemberFileDTO memberFileDTO) throws Exception {
		return sqlSession.selectOne(NAMESPACE + "getFileDetail", memberFileDTO);
	}

	//찜목록 불러오기
	@Override
	public MemberDTO getMLList(MemberDTO memberDTO) throws Exception {
		return sqlSession.selectOne(NAMESPACE + "getMLList", memberDTO);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
