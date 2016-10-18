package com.niit.Backend.DAO;

import java.util.List;

import com.niit.Backend.Model.ProductBean;

public interface ProductDAO {

	public void insertProduct(ProductBean p);
	public List<ProductBean> listProducts();
	
}
