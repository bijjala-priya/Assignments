package com.capgemini.angularproject.bean;

import java.util.List;



public class ProductResponse {
	
	private boolean error;
	private String message;
	private ProductInfo info;
	private List<ProductInfo> productInfo;
	public boolean isError() {
		return error;
	}
	public void setError(boolean error) {
		this.error = error;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public ProductInfo getInfo() {
		return info;
	}
	public void setInfo(ProductInfo info) {
		this.info = info;
	}
	public List<ProductInfo> getProductInfo() {
		return productInfo;
	}
	public void setProductInfo(List<ProductInfo> productInfo) {
		this.productInfo = productInfo;
	}

}
