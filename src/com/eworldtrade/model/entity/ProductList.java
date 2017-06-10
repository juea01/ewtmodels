package com.eworldtrade.model.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the ProductList database table.
 * 
 */
@Entity
@NamedQuery(name="ProductList.findAll", query="SELECT p FROM ProductList p")
public class ProductList implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PRODUCTLIST_ID_GENERATOR", sequenceName="ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PRODUCTLIST_ID_GENERATOR")
	private int id;

	private Timestamp creationDate;

	private String productId;

	private String productName;

	public ProductList() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Timestamp getCreationDate() {
		return this.creationDate;
	}

	public void setCreationDate(Timestamp creationDate) {
		this.creationDate = creationDate;
	}

	public String getProductId() {
		return this.productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

}