package com.eworldtrade.model.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the gemJewelleryImage database table.
 * 
 */
@Entity
@NamedQuery(name="GemJewelleryImage.findAll", query="SELECT g FROM GemJewelleryImage g")
public class GemJewelleryImage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="GEMJEWELLERYIMAGE_IMAGEID_GENERATOR", sequenceName="GEM_JEWELLERY_ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="GEMJEWELLERYIMAGE_IMAGEID_GENERATOR")
	@Column(name="image_id")
	private int imageId;


	@Column(name="image_path")
	private String imagePath;

	public GemJewelleryImage() {
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