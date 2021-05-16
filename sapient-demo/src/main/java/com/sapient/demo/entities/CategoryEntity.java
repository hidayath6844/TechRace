/**
 * 
 */
package com.sapient.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * The Class Category.
 *
 * @author Hidayath
 */
@Entity(name ="categories")
public class CategoryEntity {

	/** The category id. */
	@Column(name = "category_id", unique = true)
	private int categoryId;
	
	/** The category name. */
	@Column(name = "category_name")
	private String categoryName;

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
	 * Gets the category name.
	 *
	 * @return the category name
	 */
	public String getCategoryName() {
		return categoryName;
	}

	/**
	 * Sets the category name.
	 *
	 * @param categoryName the new category name
	 */
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
}
