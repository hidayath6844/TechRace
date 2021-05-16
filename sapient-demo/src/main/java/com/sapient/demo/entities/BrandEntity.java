/**
 * 
 */
package com.sapient.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * The Class Brand.
 *
 * @author Hidayath
 */
@Entity(name="brands")
public class BrandEntity {
	
	/** The brand id. */
	@Column(name = "brand_id", unique = true)
	private int brandId;
	
	/** The brand name. */
	@Column(name = "brand_name")
	private String brandName;
	
	/**
	 * Gets the brand name.
	 *
	 * @return the brand name
	 */
	public String getBrandName() {
		return brandName;
	}
	
	/**
	 * Sets the brand name.
	 *
	 * @param brandName the new brand name
	 */
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	
	/**
	 * Gets the brand id.
	 *
	 * @return the brand id
	 */
	public int getBrandId() {
		return brandId;
	}
	
	/**
	 * Sets the brand id.
	 *
	 * @param brandId the new brand id
	 */
	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}
	

}
