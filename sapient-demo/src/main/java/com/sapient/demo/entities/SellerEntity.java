/**
 * 
 */
package com.sapient.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * The Class Seller.
 *
 * @author Hidayath
 */
@Entity(name ="sellers")
public class SellerEntity {
	
	/** The seller id. */
	@Column(name = "seller_id", unique = true)
	private int sellerId;
	
	@Column(name = "seller_name")
	private String selllerName;
	
	/** The product id. */
	@Column(name = "product_id")
	private int productId;
	
	/** The no of items available. */
	@Column(name ="no_of_items_available")
	private int noOfItemsAvailable;

	public String getSelllerName() {
		return selllerName;
	}

	/**
	 * Sets the selller name.
	 *
	 * @param selllerName the new selller name
	 */
	public void setSelllerName(String selllerName) {
		this.selllerName = selllerName;
	}
	/**
	 * Gets the seller id.
	 *
	 * @return the seller id
	 */
	public int getSellerId() {
		return sellerId;
	}

	/**
	 * Sets the seller id.
	 *
	 * @param sellerId the new seller id
	 */
	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
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
	 * Gets the no of items available.
	 *
	 * @return the no of items available
	 */
	public int getNoOfItemsAvailable() {
		return noOfItemsAvailable;
	}

	/**
	 * Sets the no of items available.
	 *
	 * @param noOfItemsAvailable the new no of items available
	 */
	public void setNoOfItemsAvailable(int noOfItemsAvailable) {
		this.noOfItemsAvailable = noOfItemsAvailable;
	}

}
