package com.goodee.market.meetingboard;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MeetingBoardDAO {

	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE = "com.goodee.market.meetingboard.MeetingBoardDAO.";
	
	public List<MeetingBoardDTO> getMeetingBoardList() throws Exception {
		return sqlSession.selectList(NAMESPACE + "getMeetingBoardList");
	}
	
}
