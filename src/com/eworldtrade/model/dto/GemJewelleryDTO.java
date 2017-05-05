package com.eworldtrade.model.dto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class GemJewelleryDTO {
	
	
	private int gemJewelleryId;
	private String type;
	private String title;
	private String description;
	private String currency;
	private BigDecimal price;
	private Date subissionDate;
	private List<String> images;
	
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
	public int getGemJewelleryId() {
		return gemJewelleryId;
	}
	public void setGemJewelleryId(int i) {
		this.gemJewelleryId = i;
	}
	public String getType() {
		return type;
	}
	public void setType(String dealType) {
		this.type = dealType;
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
