package capgemini.greatoutdoor.wishlistmodule.dao;

import java.util.Map;

import capgemini.greatoutdoor.wishlistmodule.exception.ProductException;
import capgemini.greatoutdoor.wishlistmodule.model.Product;

public interface DaoInterface {
	boolean addWishlist(String id) throws ProductException;
	boolean deleteWishlist(String id)throws ProductException;
	Map<String,Product> displayProduct()throws ProductException;
	Map<String,Product> displayWishlist()throws ProductException;
}
