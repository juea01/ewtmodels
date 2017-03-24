package com.eworldtrade.model.dto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class DealDTO {
	
	
	private int dealId;
	private String dealType;
	private String title;
	private String description;
	private String currency;
	private BigDecimal price;
	private Date subissionDate;
	private List<String> dealImages;
	
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public List<String> getDealImages() {
		return dealImages;
	}
	public void setDealImages(List<String> dealImages) {
		this.dealImages = dealImages;
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
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
	
	
	
	

}
