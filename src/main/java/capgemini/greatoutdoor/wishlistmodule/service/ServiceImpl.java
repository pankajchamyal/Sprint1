package capgemini.greatoutdoor.wishlistmodule.service;

import java.util.Map;

import capgemini.greatoutdoor.wishlistmodule.dao.DaoImpl;
import capgemini.greatoutdoor.wishlistmodule.exception.ProductException;
import capgemini.greatoutdoor.wishlistmodule.model.Product;

public class ServiceImpl implements ServiceInterface {
	static DaoImpl dao=new DaoImpl();

	@Override
	public Map<String, Product> displayWishlist() throws ProductException {
		return dao.displayWishlist();
	}

	@Override
	public boolean addWishlist(String productId) throws ProductException {
		if(!productId.isEmpty())
			return dao.addWishlist(productId);
		else
			throw new ProductException("ProductId Cannot be Empty");
	}

	@Override
	public boolean deleteWishlist(String productId) throws ProductException {
		if(!productId.isEmpty())
			return dao.deleteWishlist(productId);
		else
			throw new ProductException("ProductId Cannot be Empty");
	}

	@Override
	public Map<String, Product> displayProduct() throws ProductException {
		return dao.displayProduct();
	}

}
