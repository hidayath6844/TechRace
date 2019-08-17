/**
 * 
 */
package com.consumer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * The Class ConsumerController.
 *
 * @author Hidayath
 */
@RestController
public class ConsumerController {

	/** The product service client. */
	@Autowired
	ProductServiceClient productServiceClient;

	/**
	 * Gets the products.
	 *
	 * @return the products
	 */
	@GetMapping("/getProducts")
	public ResponseEntity<List<Product>> getProducts() {
		System.out.println("ConsumerController.getProducts()");
		return ResponseEntity.ok(productServiceClient.getAllProducts());
	}

	/**
	 * Gets the product.
	 *
	 * @param id the id
	 * @return the product
	 */
	@GetMapping("/getProduct/{id}")
	public ResponseEntity<?> getProduct(@PathVariable int id) {
		System.out.println("ConsumerController.getProduct()");
		Product product = null;
		try {
			product = productServiceClient.getProduct(id);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.ok("Product does not exist for the id: " + id);
		}
		return ResponseEntity.ok(product);
	}

}
