package com.itechgenie.webportal.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "catalogue")
public class Catalogue {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int productId;

	@Column
	private String category;
	@Column
	private String product;
	@Column
	private String locid;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getProdName() {
		return product;
	}

	public void setProdName(String product) {
		this.product = product;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getLocId() {
		return locid;
	}

	public void setLocId(String locid) {
		this.locid = locid;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("category=");
		builder.append(category);
		builder.append(" , prodName=");
		builder.append(product);
		builder.append(" , productId=");
		builder.append(productId);
		builder.append(" , locId=");
		builder.append(locid);
		return builder.toString();
	}
}
