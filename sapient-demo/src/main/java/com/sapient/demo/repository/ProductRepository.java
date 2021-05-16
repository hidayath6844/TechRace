/**
 * 
 */
package com.sapient.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sapient.demo.entities.ProductEntity;


/**
 * The Interface ProductRepository.
 *
 * @author Hidayath
 */
@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Integer>{
	
	/**
	 * Find by brand.
	 *
	 * @param brandName the brand name
	 * @return the list
	 */
	List<ProductEntity> findByBrand(String brandName);

	/**
	 * Find by price.
	 *
	 * @param price the price
	 * @return the list
	 */
	List<ProductEntity> findByPrice(int price);
	
	/**
	 * Find by color.
	 *
	 * @param color the color
	 * @return the list
	 */
	List<ProductEntity> findByColor( String color);
	
	/**
	 * Find by size.
	 *
	 * @param size the size
	 * @return the list
	 */
	List<ProductEntity> findBySize(int size);
	
	/**
	 * Find by SKU.
	 *
	 * @param size the size
	 * @return the list
	 */
	List<ProductEntity> findBySKU(int size);
	
	/**
	 * Find by seller.
	 *
	 * @param sellerName the seller name
	 * @return the list
	 */
	List<ProductEntity> findBySeller(String sellerName);

}
