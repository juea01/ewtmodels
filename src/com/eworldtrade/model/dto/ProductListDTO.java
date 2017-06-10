package com.eworldtrade.model.dto;

import java.util.ArrayList;
import java.util.List;

public class ProductListDTO {
   private List<ProductDTO> productDTOs;

public List<ProductDTO> getProductDTOs() {
	return productDTOs;
}

public void setProductDTOs(List<ProductDTO> productDTOs) {
	this.productDTOs = productDTOs;
}

public void add(ProductDTO productDTO) {
	if (productDTOs == null) {
		productDTOs = new ArrayList<ProductDTO>();
	}
	
	productDTOs.add(productDTO);
}
  
}
