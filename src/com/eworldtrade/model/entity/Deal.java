package com.eworldtrade.model.entity;

import java.io.Serializable;

import javax.persistence.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the deal database table.
 * 
 */
@Entity
@NamedQueries({@NamedQuery(name="Deal.findAll", query="SELECT d FROM Deal d"),
@NamedQuery(name="Deal.findAllBySearchKeyWord", query="SELECT d FROM Deal d where d.dealType like :searchKeyWord"),
@NamedQuery(name="Deal.findAllByUserId", query="SELECT d FROM Deal d where d.user.userId = :userId"),
@NamedQuery(name="Deal.findById", query="SELECT d FROM Deal d where d.dealId = :Id"),
@NamedQuery(name="Deal.countAll", query="SELECT COUNT(d.dealId) FROM Deal d"),
@NamedQuery(name="Deal.countAllBySearchKeyWord", query="SELECT COUNT(d.dealId) FROM Deal d where d.dealType like :searchKeyWord"),
@NamedQuery(name="Deal.countAllByUserId", query="SELECT COUNT(d.dealId) FROM Deal d where d.user.userId = :userId")})
public class Deal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="DEAL_DEALID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DEAL_DEALID_GENERATOR")
	@Column(name="DEAL_ID")
	private int dealId;

	private String currency;

	@Column(name="DEAL_TYPE")
	private String dealType;

	@Lob
	private String description;

	private BigDecimal price;

	@Temporal(TemporalType.DATE)
	@Column(name="SUBMISSION_DATE")
	private Date submissionDate;

	private String title;
	
//	@Column(name="U_ID")
//	private int uId;

	//bi-directional many-to-one association to Deal_Image
	@OneToMany(fetch=FetchType.EAGER, cascade=CascadeType.PERSIST)
	@JoinColumn(name="DEAL_ID")
	private List<Deal_Image> dealImages;
	
	//unidirectional many-to-one relationship to User
	@ManyToOne
	@JoinColumn(name="U_ID")
	private User user;
	
	
	
	public Deal() {
	}

	public int getDealId() {
		return this.dealId;
	}

	public void setDealId(int dealId) {
		this.dealId = dealId;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getDealType() {
		return this.dealType;
	}

	public void setDealType(String dealType) {
		this.dealType = dealType;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Date getSubmissionDate() {
		return this.submissionDate;
	}

	public void setSubmissionDate(Date submissionDate) {
		this.submissionDate = submissionDate;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public List<Deal_Image> getDealImages() {
		return this.dealImages;
		}

	public void setDealImages(List<Deal_Image> dealImages) {
	this.dealImages = dealImages;
	}
	
//	public int getuId() {
//		return uId;
//	}
//
//	public void setuId(int uId) {
//		this.uId = uId;
//	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	

}