package com.niit.springmvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.niit.Backend.DAO.ProductDAO;
import com.niit.Backend.Model.Product;

@Controller
public class ProductController {

	@Autowired
	ProductDAO productDAO;
		
	@RequestMapping(value = "/pro/all")
	public @ResponseBody List<Product> getAllProducts() {
		
		return productDAO.getAll();
		
	}
		
}