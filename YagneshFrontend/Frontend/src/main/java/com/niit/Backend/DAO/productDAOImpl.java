package com.niit.Backend.DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.niit.Backend.Model.ProductBean;

@Repository
public class ProductDAOImpl implements ProductDAO {

	public static final Logger logger=LoggerFactory.getLogger(ProductDAOImpl.class);
    
	private SessionFactory factory;
	
	
	public void setFactory(SessionFactory sf) {
		this.factory = sf;
	}

	@Override
	public void addProduct(ProductBean m) {

		Session session=this.factory.getCurrentSession();
		session.persist(m);
		logger.info("Product saved successfully....="+m);
	}

	@Override
	public void editProduct(ProductBean m) {
		
		Session session=this.factory.getCurrentSession();
		session.update(m);
		logger.info("Product updated successfully...="+m);
	}
    
	@SuppressWarnings("Unchecked")
	@Override
	public List<ProductBean> listProducts() {
		
		Session session=this.factory.getCurrentSession();
		List<ProductBean> listpro=session.createQuery("from Model").list();
	    
		for(ProductBean m:listpro)
	    {
             logger.info("Product List::"+m);	    	
	    }
		
		return listpro;
	}

	@Override
	public ProductBean getModelById(int SerialNo) {
		
		Session session=this.factory.getCurrentSession();
		ProductBean m=(ProductBean)session.load(ProductBean.class, new Integer(SerialNo));
		logger.info("Product submitted successfully...::"+m);
		return m;
	}

	@Override
	public void removeProduct(int SerialNo) 
	{
		Session session=this.factory.getCurrentSession();
		ProductBean m=(ProductBean)session.load(ProductBean.class, new Integer(SerialNo));
		if(null!=m)
		{
			session.delete(m);
		}
		logger.info("Product deleted successfully...."+m);
	}

}
