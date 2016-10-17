package com.niit.Backend.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.Backend.Model.Model;
@Repository
public class productDAOImpl implements productDAO {

	List<Model> pro;
	
	public productDAOImpl()
	{
		pro=new ArrayList<Model>();
		
		Model m1=new Model();
		m1.setSerialNo(01);
		m1.setName("Alishan");
		m1.setCategory("Matress");
		m1.setBrand("Aerocom");
		
		pro.add(m1);
	}
	
	public List<Model> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
