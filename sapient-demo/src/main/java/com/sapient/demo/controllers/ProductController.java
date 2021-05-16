/**
 * 
 */
package com.sapient.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.demo.dtos.Product;
import com.sapient.demo.services.ProductService;

/**
 * @author Hidayath
 *
 */
@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/brand/{brandName}")
	List<Product> getByBrand(@PathVariable("brandName") String brandName)
	{
		return productService.getByBrand(brandName);
	}

	@GetMapping("/price/{price}")
	List<Product> getByPrice(@PathVariable("price") int price)
	{
		return productService.getByPrice(price);
	}
	
	@GetMapping("/color/{color}")
	List<Product> getByColor(@PathVariable("color") String color)
	{
		return productService.getByColor(color);
	}
	
	@GetMapping("/size/{size}")
	List<Product> getBySize(@PathVariable("size") int size)
	{
		return productService.getBySize(size);
	}
	
	@GetMapping("/sku/{sku}")
	List<Product> getBySKU(@PathVariable("sku") int sku)
	{
		return productService.getBySKU(sku);
	}
	
	
	@GetMapping("/seller/{sellerName}")
	List<Product> getBySeller(@PathVariable("sellerName") String sellerName)
	{
		return productService.getBySeller(sellerName);
	}
	
	
}
