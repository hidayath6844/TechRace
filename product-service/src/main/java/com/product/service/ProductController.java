/**
 * 
 */
package com.product.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/** 
 *  @author Hidayath 
 */
@RestController
public class ProductController {

	/** The product list. */
	private static List<Product> productList = new ArrayList<>();

	static {
		productList.add(new Product(1, "Bat", 200.0));
		productList.add(new Product(2, "Ball", 30.0));
		productList.add(new Product(3, "Wickets", 300.0));
	}

	/**
	 * Gets the products.
	 *
	 * @return the products
	 */
	@GetMapping("/products")
	public ResponseEntity<List<Product>> getProducts() {
		System.out.println("ProductController.getProducts()");
		return ResponseEntity.ok(productList);

	}

	/**
	 * Gets the product.
	 *
	 * @param id the id
	 * @return the product
	 */
	@GetMapping("/product/{id}")
	public ResponseEntity<?> getProduct(@PathVariable int id) {
		System.out.println("ProductController.getProduct()");

		Product product = findProduct(id);
		if (product == null) {
			return ResponseEntity.badRequest().body("Product does not exist for the id: " + id);
		}

		return ResponseEntity.ok(product);

	}

	/**
	 * Find product.
	 *
	 * @param id the id
	 * @return the product
	 */
	private Product findProduct(int id) {
		return productList.stream().filter(product -> product.getId().equals(id)).findFirst().orElse(null);
	}

}
