package com.niit.Backend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.Backend.DAO.ProductDAO;
import com.niit.Backend.Model.ProductBean;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("Before");
    	
    	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
    	context.scan("com.niit");
    	context.refresh();
    	ProductDAO dao=(ProductDAO)context.getBean(ProductDAO.class);
    	
    	ProductBean bean1=new ProductBean();
    	bean1.setId(109);
    	bean1.setName("Yagneshwar");
    	bean1.setPrice(310);
    	dao.insertProduct(bean1);
    	
    }
}
