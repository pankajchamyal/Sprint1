package capgemini.greatoutdoor.wishlistmodule.dao;

import java.util.HashMap;
import java.util.Map;

import capgemini.greatoutdoor.wishlistmodule.exception.ProductException;
import capgemini.greatoutdoor.wishlistmodule.model.Product;
import capgemini.greatoutdoor.wishlistmodule.model.ProductData;

public class DaoImpl implements DaoInterface {
	ProductData pd = new ProductData();
	Map<String, Product> productlist = pd.getdata();
	Map<String, Product> wishlist = new HashMap<>();

	public boolean addWishlist(String id) throws ProductException {
		if (productlist.containsKey(id)) {
			if (wishlist.containsKey(id)) {
				throw new ProductException("Product is already in the Wish List");
			} else {
				wishlist.put(id, productlist.get(id));
				return true;
			}
		} else {
			throw new ProductException("Product with " + id + " not present");
		}
	}

	public boolean deleteWishlist(String id) throws ProductException {
		if (wishlist.containsKey(id)) {
			wishlist.remove(id);
			return true;
		} else {
			throw new ProductException("Product with " + id + " not present");
			}
	}

	public Map<String, Product> displayProduct() throws ProductException {
		if (productlist.isEmpty())
			throw new ProductException("No product exists!");
		else
			return productlist;
	}

	public Map<String, Product> displayWishlist() throws ProductException {
		if (wishlist.isEmpty())
			throw new ProductException("List is Empty");
		else
			return wishlist;
	}
}
