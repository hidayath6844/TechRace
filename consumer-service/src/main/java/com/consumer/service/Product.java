/**
 * 
 */
package com.consumer.service;

/**
 * The Class Product.
 *
 * @author Hidayath
 */
public class Product {

	/** The id. */
	private Integer id;

	/** The name. */
	private String name;

	/** The price. */
	private double price;

	/**
	 * Instantiates a new product.
	 */
	public Product() {

	}

	/**
	 * Instantiates a new product.
	 *
	 * @param id the id
	 * @param name the name
	 * @param price the price
	 */
	public Product(Integer id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Gets the price.
	 *
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
}
