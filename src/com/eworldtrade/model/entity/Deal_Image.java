package com.eworldtrade.model.entity;

import java.io.Serializable;

import javax.persistence.*;


/**
 * The persistent class for the Deal_Image database table.
 * 
 */
@Entity
@NamedQuery(name="Deal_Image.findAll", query="SELECT d FROM Deal_Image d")
public class Deal_Image implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="DEAL_IMAGE_IMAGEID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DEAL_IMAGE_IMAGEID_GENERATOR")
	@Column(name="IMAGE_ID")
	private int imageId;

	@Column(name="IMAGE_PATH")
	private String imagePath;

	public Deal_Image() {
	}

	public int getImageId() {
		return this.imageId;
	}

	public void setImageId(int imageId) {
		this.imageId = imageId;
	}

	public String getImagePath() {
		return this.imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

}