/**
 * 
 */
package com.sapient.demo.dtos;

import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class Product.
 *
 * @author Hidayath
 */
public class Product {
	
	/** The product id. */
	private int productId;
	
	/** The product name. */
	private String productName;
	
	/** The category id. */
	private int categoryId;
	
	/** The brand. */
	private String brand;
	
	/** The color. */
	private String color;
	
	/** The size. */
	private int size;
	
	/** The sku. */
	private int sku;
	
	/** The sellers. */
	private List<Seller> sellers;
	
	
	/**
	 * Gets the color.
	 *
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * Sets the color.
	 *
	 * @param color the new color
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * Gets the size.
	 *
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * Sets the size.
	 *
	 * @param size the new size
	 */
	public void setSize(int size) {
		this.size = size;
	}

	/**
	 * Gets the sku.
	 *
	 * @return the sku
	 */
	public int getSku() {
		return sku;
	}

	/**
	 * Sets the sku.
	 *
	 * @param sku the new sku
	 */
	public void setSku(int sku) {
		this.sku = sku;
	}

	/**
	 * Gets the sellers.
	 *
	 * @return the sellers
	 */
	public List<Seller> getSellers() {
		return sellers;
	}

	/**
	 * Sets the sellers.
	 *
	 * @param sellers the new sellers
	 */
	public void setSellers(List<Seller> sellers) {
		this.sellers = sellers;
	}

	
	/**
	 * Gets the product id.
	 *
	 * @return the product id
	 */
	public int getProductId() {
		return productId;
	}
	
	/**
	 * Sets the product id.
	 *
	 * @param productId the new product id
	 */
	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	/**
	 * Gets the product name.
	 *
	 * @return the product name
	 */
	public String getProductName() {
		return productName;
	}
	
	/**
	 * Sets the product name.
	 *
	 * @param productName the new product name
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	/**
	 * Gets the category id.
	 *
	 * @return the category id
	 */
	public int getCategoryId() {
		return categoryId;
	}
	
	/**
	 * Sets the category id.
	 *
	 * @param categoryId the new category id
	 */
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	
	/**
	 * Gets the brand.
	 *
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}
	
	/**
	 * Sets the brand.
	 *
	 * @param brand the new brand
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

}
