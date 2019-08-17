/**
 * 
 */
package com.consumer.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * The Interface ProductServiceClient.
 *
 * @author Hidayath
 */
@FeignClient(name = "product-service", url = "http://localhost:9011")
public interface ProductServiceClient {

 /**
  * Gets the all products.
  *
  * @return the all products
  */
 @GetMapping("/products")
 public List < Product > getAllProducts();

 /**
  * Gets the product.
  *
  * @param productId the product id
  * @return the product
  */
 @GetMapping("/product/{id}")
 public Product getProduct(@PathVariable("id") int productId);

}
