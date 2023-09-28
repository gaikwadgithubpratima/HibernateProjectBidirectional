package com.project.hibernateprojectbidirectional;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name="Customer_Information")
@Table(name="Customer_Details")

public class Customer {
	@Id
	@Column(name="Customer_id")
	private int cid;
	@Column(name="Customer_name")
	private String cname;
	
	@OneToOne
	@JoinColumn(name = "Product_id")
	private Product product;

	public Customer(int cid, String cname, Product product) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.product = product;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	
}
