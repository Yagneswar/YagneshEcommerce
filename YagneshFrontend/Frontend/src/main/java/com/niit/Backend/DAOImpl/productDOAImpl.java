package com.niit.Backend.DAOImpl;

import org.springframework.stereotype.Repository;

import com.niit.Backend.DAO.productDAO;
import com.niit.Backend.Model.Model;

@Repository("")
public class productDOAImpl implements productDAO
{
	@Override
	public productDAO createNewEmployee()
    {
        Model m = new Model();
        m.setSerialNo(1);
        m.setName("Mattress");
        m.setBrand("Aerocom");
        m.setCategory("Matress");
        
        return m;
    }
}
