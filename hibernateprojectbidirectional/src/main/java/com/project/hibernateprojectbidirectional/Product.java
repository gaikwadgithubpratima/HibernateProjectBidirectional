package com.project.hibernateprojectbidirectional;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name="Product_Information")
@Table(name="Product_Details")

public class Product {
	@Id
	@Column(name="Product_id")
	private int pid;
	@Column(name="Product_name")
	private String pname;
	 
	@OneToOne(mappedBy = "product", cascade = CascadeType.ALL)
	private Customer customer;


	public Product(int pid, String pname, Customer customer) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.customer = customer;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
}
