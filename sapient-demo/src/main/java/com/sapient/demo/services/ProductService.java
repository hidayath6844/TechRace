/**
 * 
 */
package com.sapient.demo.services;

import java.util.List;

import com.sapient.demo.dtos.Product;

/**
 * The Interface ProductService.
 *
 * @author Hidayath
 */
public interface ProductService {
	
	/**
	 * Gets the by brand.
	 *
	 * @param brandName the brand name
	 * @return the by brand
	 */
	List<Product> getByBrand(String brandName);

	/**
	 * Gets the by price.
	 *
	 * @param price the price
	 * @return the by price
	 */
	List<Product> getByPrice(int price);
	
	/**
	 * Gets the by color.
	 *
	 * @param color the color
	 * @return the by color
	 */
	List<Product> getByColor( String color);
	
	/**
	 * Gets the by size.
	 *
	 * @param size the size
	 * @return the by size
	 */
	List<Product> getBySize(int size);
	
	/**
	 * Gets the by SKU.
	 *
	 * @param size the size
	 * @return the by SKU
	 */
	List<Product> getBySKU(int size);
	
	/**
	 * Gets the by seller.
	 *
	 * @param sellerName the seller name
	 * @return the by seller
	 */
	List<Product> getBySeller(String sellerName);

}
