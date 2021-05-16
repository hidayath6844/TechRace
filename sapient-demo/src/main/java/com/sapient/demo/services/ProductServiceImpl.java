/**
 * 
 */
package com.sapient.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sapient.demo.dtos.Product;
import com.sapient.demo.dtos.Seller;
import com.sapient.demo.entities.ProductEntity;
import com.sapient.demo.repository.ProductRepository;

/**
 * @author Hidayath
 *
 */
@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public List<Product> getByBrand(String brandName) {
		List<ProductEntity> productEntities = productRepository.findByBrand(brandName);
		return prepareProductsResponse(productEntities);
	}

	
	@Override
	public List<Product> getByPrice(int price) {
		List<ProductEntity> productEntities = productRepository.findByPrice(price);
		return prepareProductsResponse(productEntities);
	}

	@Override
	public List<Product> getByColor(String color) {
		List<ProductEntity> productEntities = productRepository.findByColor(color);
		return prepareProductsResponse(productEntities);
	}

	@Override
	public List<Product> getBySize(int size) {
		List<ProductEntity> productEntities = productRepository.findBySize(size);
		return prepareProductsResponse(productEntities);
	}

	@Override
	public List<Product> getBySKU(int sku) {
		List<ProductEntity> productEntities = productRepository.findBySKU(sku);
		return prepareProductsResponse(productEntities);
	}

	@Override
	public List<Product> getBySeller(String sellerName) {
		List<ProductEntity> productEntities = productRepository.findBySeller(sellerName);
		return prepareProductsResponse(productEntities);
	}

	/**
	 * Prepare products response.
	 *
	 * @param productEntities the product entities
	 * @return the list
	 */
	private List<Product> prepareProductsResponse(List<ProductEntity> productEntities)
	{
		List<Product> products= new ArrayList<>();
		productEntities.stream().forEach(entity -> {
			Product product = new Product();
			product.setProductId(entity.getProductId());
			product.setProductName(entity.getProductName());
			product.setBrand(entity.getBrand());
			product.setCategoryId(entity.getCategoryId());
			product.setColor(entity.getColor());
			product.setSize(entity.getSize());
			product.setSku(entity.getSku());
			
			List<Seller> sellers = new ArrayList<>();
			entity.getSellers().stream().forEach(sellerEntity -> {
				Seller seller = new Seller();
				seller.setSellerId(sellerEntity.getSellerId());
				seller.setNoOfItemsAvailable(sellerEntity.getNoOfItemsAvailable());
				seller.setProductId(sellerEntity.getProductId());
				seller.setSelllerName(sellerEntity.getSelllerName());
				sellers.add(seller);
			});
			product.setSellers(sellers);
			products.add(product);
			
		});
		return products;
	}
}
