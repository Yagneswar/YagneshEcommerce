package com.niit.Backend.Config;

import java.util.List;

import javax.transaction.Transactional;

import com.niit.Backend.DAO.ProductDAO;
import com.niit.Backend.Model.ProductBean;

public class ProductServiceImpl implements ProductServiceDAO {

	private ProductDAO productDAO;
	
	public void setProductDAO(ProductDAO productDAO) {
		this.productDAO = productDAO;
	}

	@Override
	@Transactional
	public void addProduct(ProductBean m) {
		this.productDAO.addProduct(m);

	}

	@Override
	@Transactional
	public void editProduct(ProductBean m) {
		
		this.productDAO.editProduct(m);
	}
	@Override
	@Transactional
	public List<ProductBean> listProducts() {

		return this.productDAO.listProducts();
	}

	@Override
	@Transactional
	public ProductBean getModelById(int SerialNo) {
		
		
		return this.productDAO.getModelById(SerialNo);
	}

	@Override
	@Transactional
	public void removeProduct(int SerialNo) {
		
		this.productDAO.removeProduct(SerialNo);

	}

}
