package com.goodee.market.meetingboard.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MeetingBoardMemberService {

	@Autowired
	private MeetingBoardMemberDAO meetingBoardMemberDAO;

}