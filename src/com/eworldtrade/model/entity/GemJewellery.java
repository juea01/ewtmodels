package com.eworldtrade.model.entity;

import java.io.Serializable;

import javax.persistence.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the gemJewellery database table.
 * 
 */
@Entity
@NamedQueries({@NamedQuery(name="GemJewellery.findAll", query="SELECT g FROM GemJewellery g"),
@NamedQuery(name="GemJewellery.findById", query="SELECT g FROM GemJewellery g where g.gemJewelleryId = :Id"),
@NamedQuery(name="GemJewellery.countAll", query="SELECT COUNT(g.gemJewelleryId) FROM GemJewellery g")})
public class GemJewellery implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="GEMJEWELLERY_GEMJEWELLERYID_GENERATOR", sequenceName="GEM_JEWELLERY_ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="GEMJEWELLERY_GEMJEWELLERYID_GENERATOR")
	@Column(name="gem_jewellery_id")
	private int gemJewelleryId;

	private String currency;

	@Lob
	private String description;

	private BigDecimal price;

	@Temporal(TemporalType.DATE)
	@Column(name="submission_date")
	private Date submissionDate;

	private String title;

	private String type;
	
	//bi-directional many-to-one association to Deal_Image
	@OneToMany(fetch=FetchType.EAGER, cascade=CascadeType.PERSIST)
	@JoinColumn(name="gemJewellery_id")
	private List<GemJewelleryImage> gemJewelleryImages;

	public List<GemJewelleryImage> getGemJewelleryImages() {
		return gemJewelleryImages;
	}

	public void setGemJewelleryImages(List<GemJewelleryImage> gemJewelleryImages) {
		this.gemJewelleryImages = gemJewelleryImages;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public GemJewellery() {
	}

	public int getGemJewelleryId() {
		return this.gemJewelleryId;
	}

	public void setGemJewelleryId(int gemJewelleryId) {
		this.gemJewelleryId = gemJewelleryId;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
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

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	

}