package com.eworldtrade.model.dto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class DealDTO {
	
	
	private int dealId;
	private String dealType;
	private String briefDescription;
	private String description;
	private String currency;
	private BigDecimal price;
	private Date subissionDate;
	private List<String> images;
	private int userId;
	
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public List<String> getImages() {
		return images;
	}
	public void setImages(List<String> images) {
		this.images = images;
	}
	public int getDealId() {
		return dealId;
	}
	public void setDealId(int i) {
		this.dealId = i;
	}
	public String getDealType() {
		return dealType;
	}
	public void setDealType(String dealType) {
		this.dealType = dealType;
	}
	public String getBriefDescription() {
		return briefDescription;
	}
	public void setBriefDescription(String title) {
		this.briefDescription = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Date getSubissionDate() {
		return subissionDate;
	}
	public void setSubissionDate(Date subissionDate) {
		this.subissionDate = subissionDate;
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	
	
	

}
