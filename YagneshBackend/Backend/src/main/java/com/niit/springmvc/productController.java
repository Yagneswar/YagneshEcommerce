package com.niit.springmvc;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.Backend.Config.ProductServiceDAO;
import com.niit.Backend.Model.ProductBean;

@Controller
public class productController {

	private ProductServiceDAO serviceDAO;
	
	@Autowired(required=true)
	@Qualifier(value="serviceDAO")
	public void setServiceDAO(ProductServiceDAO serviceDAO) {
		this.serviceDAO = serviceDAO;
	}
	@RequestMapping(value="/products",method=RequestMethod.GET)
	public String listProducts(Model model)
	{
		model.addAttribute("product", new ProductBean());
		model.addAttribute("listProducts", this.serviceDAO.listProducts());
		return "product";
	}
	
	@RequestMapping(value="/product/add",method=RequestMethod.POST)
	public String addProduct(@ModelAttribute("product") ProductBean m)
	{
		if(m.getSerialNo()==0)
		{
			this.serviceDAO.addProduct(m);
		}
		else
		{
			this.serviceDAO.editProduct(m);
		}
		return "redirect:/products";
	}
	@RequestMapping("/remove/{SerialNo}")
	public String removeProduct(@PathVariable("SerialNo") int SerialNo)
	{
		this.serviceDAO.removeProduct(SerialNo);
		return "/redirect:/products";
	}
	@RequestMapping("/edit/{SerialNo}")
	public String editProduct(@PathVariable("SerialNo") int SerialNo, Model model)
	{
		model.addAttribute("product",this.serviceDAO.getModelById(SerialNo));
		model.addAttribute("listProducts", this.serviceDAO.listProducts());
		return "product";
	}
	
}
