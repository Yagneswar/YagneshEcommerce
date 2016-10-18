package com.niit.Backend.DAO;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.Backend.Model.ProductBean;

@Repository
@Transactional
public class ProductDAOImpl implements ProductDAO{

	
	@Autowired
	private SessionFactory sessionFactory;
	

	@Override
	public List<ProductBean> listProducts() {				
		return sessionFactory.getCurrentSession().createQuery("FROM ProductBean").list();
	}

	@Override
	public void insertProduct(ProductBean p) {
		sessionFactory.getCurrentSession().persist(p);
		
	}

}