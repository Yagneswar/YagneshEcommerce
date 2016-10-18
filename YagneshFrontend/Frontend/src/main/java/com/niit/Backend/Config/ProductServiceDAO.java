package com.niit.Backend.Config;

import java.util.List;

import com.niit.Backend.Model.ProductBean;

public interface ProductServiceDAO {

	public void addProduct(ProductBean m);
	public void editProduct(ProductBean m);
	public List<ProductBean> listProducts();
	public ProductBean getModelById(int SerialNo);
	public void removeProduct(int SerialNo);
}
