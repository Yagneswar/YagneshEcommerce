package com.niit.springmvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.niit.Backend.DAO.productDAO;
import com.niit.Backend.Model.Model;

@Controller
public class productController {

	@Autowired
	productDAO p;
	@RequestMapping("/product/all")
	public @ResponseBody List<Model> getAll()
	{
		return p.getAll();
	}
	
}
