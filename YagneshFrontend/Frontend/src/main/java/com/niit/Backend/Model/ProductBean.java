package com.niit.Backend.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Model")
public class ProductBean {
     @Id
     @Column(name="SerialNo")
     @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int SerialNo;
	private String brand;
	private String Category;
	private String name;
	public int getSerialNo() {
		return SerialNo;
	}
	@Override
	public String toString() {
		return "Model [SerialNo=" + SerialNo + ", brand=" + brand + ", Category=" + Category + ", name=" + name + "]";
	}
	public void setSerialNo(int serialNo) {
		SerialNo = serialNo;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
