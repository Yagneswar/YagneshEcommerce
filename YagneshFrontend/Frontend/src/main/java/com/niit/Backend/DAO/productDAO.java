package com.niit.Backend.DAO;

import java.util.List;

import com.niit.Backend.Model.ProductBean;

public interface ProductDAO {

	public void addProduct(ProductBean m);
	public void editProduct(ProductBean m);
	public List<ProductBean> listProducts();
	public ProductBean getModelById(int SerialNo);
	public void removeProduct(int SerialNo);
}
