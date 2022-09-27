package com.goodee.market.trade.item;

import java.sql.Date;

public class ItemDTO {
	
	   private Long itemNum;
	   private Long memberNum;
	   private String itemTitle;
	   private String itemCotents;
	   private String itemCategory;
	   private Integer itemPrice;
	   private Date itemDueDate;
	   private Integer itemStatus;
	   
	   
	public Long getItemNum() {
		return itemNum;
	}
	public void setItemNum(Long itemNum) {
		this.itemNum = itemNum;
	}
	public Long getMemberNum() {
		return memberNum;
	}
	public void setMemberNum(Long memberNum) {
		this.memberNum = memberNum;
	}
	public String getItemTitle() {
		return itemTitle;
	}
	public void setItemTitle(String itemTitle) {
		this.itemTitle = itemTitle;
	}
	public String getItemCotents() {
		return itemCotents;
	}
	public void setItemCotents(String itemCotents) {
		this.itemCotents = itemCotents;
	}
	public String getItemCategory() {
		return itemCategory;
	}
	public void setItemCategory(String itemCategory) {
		this.itemCategory = itemCategory;
	}
	public Integer getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(Integer itemPrice) {
		this.itemPrice = itemPrice;
	}
	public Date getItemDueDate() {
		return itemDueDate;
	}
	public void setItemDueDate(Date itemDueDate) {
		this.itemDueDate = itemDueDate;
	}
	public Integer getItemStatus() {
		return itemStatus;
	}
	public void setItemStatus(Integer itemStatus) {
		this.itemStatus = itemStatus;
	}
	   
	   
	   

}
