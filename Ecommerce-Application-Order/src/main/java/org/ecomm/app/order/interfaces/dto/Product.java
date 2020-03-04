package org.ecomm.app.order.interfaces.dto;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Product {
	
	@JsonProperty(required = true)
    @NotNull
	private Integer productId;
	
	@JsonProperty(required =  true)
	@NotNull
	private String sku;
	
	@JsonProperty(required = true)
	@NotNull
	private String productName;

	@JsonProperty(required = true)
	@NotNull
	private String productDescription;
	
	@JsonProperty(required = true)
	@NotNull
	private Integer unitsInStock;
	
	@JsonProperty(required = true)
	@NotNull
	private Integer unitsInOrder;
	
	@JsonProperty(required = true)
	@NotNull
	private Integer unitPrice;

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public Integer getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(Integer unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

	public Integer getUnitsInOrder() {
		return unitsInOrder;
	}

	public void setUnitsInOrder(Integer unitsInOrder) {
		this.unitsInOrder = unitsInOrder;
	}

	public Integer getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Integer unitPrice) {
		this.unitPrice = unitPrice;
	}
	

}
