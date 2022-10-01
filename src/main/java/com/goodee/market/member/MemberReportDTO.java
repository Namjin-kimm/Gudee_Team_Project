package com.goodee.market.member;

public class MemberReportDTO {
	
	private Long reportMemberNum;
	private Long reportedMemberNum;
	private String reportContent;
	
	public Long getReportMemberNum() {
		return reportMemberNum;
	}
	public void setReportMemberNum(Long reportMemberNum) {
		this.reportMemberNum = reportMemberNum;
	}
	public Long getReportedMemberNum() {
		return reportedMemberNum;
	}
	public void setReportedMemberNum(Long reportedMemberNum) {
		this.reportedMemberNum = reportedMemberNum;
	}
	public String getReportContent() {
		return reportContent;
	}
	public void setReportContent(String reportContent) {
		this.reportContent = reportContent;
	}
	
	

}
