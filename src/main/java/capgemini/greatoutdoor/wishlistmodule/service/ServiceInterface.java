package capgemini.greatoutdoor.wishlistmodule.service;

import java.util.Map;

import capgemini.greatoutdoor.wishlistmodule.exception.ProductException;
import capgemini.greatoutdoor.wishlistmodule.model.Product;

public interface ServiceInterface {

	Map<String, Product> displayProduct() throws ProductException;
	
	Map<String, Product> displayWishlist() throws ProductException;

	boolean addWishlist(String productId) throws ProductException;

	boolean deleteWishlist(String productId) throws ProductException;

}