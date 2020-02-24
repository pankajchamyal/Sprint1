package capgemini.greatoutdoor.wishlistmodule.ui;


import java.util.Map;
import java.util.Scanner;

import capgemini.greatoutdoor.wishlistmodule.exception.ProductException;
import capgemini.greatoutdoor.wishlistmodule.model.Product;
import capgemini.greatoutdoor.wishlistmodule.service.ServiceImpl;

public class Main {
	int choice = 0;
	static ServiceImpl service = new ServiceImpl();
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) throws ProductException {
		Main mObject = new Main();
		mObject.welcome();
		mObject.choose();
	}

	void welcome() throws ProductException{
		System.out.println("*** Welcome to the Great Outdoor ***");
		System.out.println("\n\n");
		System.out.println("\nProducts Available\n");
		displayProduct();
	}

	void choose() throws ProductException {
		int flag = 1;
		while (flag == 1) {
			System.out.println("Choose Option\n1. Add Product to Wish List\n2. Delete Product from Wish List"
					+ "\n3. Display Wish List\n4. Exit Program");

			choice = in.nextInt();
			switch (choice) {
			case 1:
				addWishlist();
				break;
			case 2:
				deleteWishlist();
				break;
			case 3:
				displayWishlist();
				break;
			case 4:
				flag = 0;
				break;
			default:
				System.out.println("Wrong Option");
				break;
			}
		}
	}

	public void displayProduct() throws ProductException {
		Map<String, Product> productlist = service.displayProduct();
		System.out.println(
				"ProductId\tProduct Name\t\tColor\t\tPrice\tSpecification\tManufacturer\tQuantity\tCategory\tDimensions");
		productlist.forEach((k, v) -> System.out.println(k + "\t" + v.toString()));
	}

	public void displayWishlist() throws ProductException {
		Map<String, Product> wishlist = service.displayWishlist();
		System.out.println(
				"ProductId\tProduct Name\t\tColor\t\tPrice\tSpecification\tManufacturer\tQuantity\tCategory\tDimensions");
		wishlist.forEach((k, v) -> System.out.println(k + "\t" + v.toString()));
	}

	public void deleteWishlist() throws ProductException {
		System.out.print("\nEnter productId to delete:");
		String input = "";
		input = in.nextLine();
		boolean isdeleted = true;
		isdeleted = service.deleteWishlist(input);
		if (isdeleted)
			System.out.println("Product Deleted SuccessFully !!");
		else
			System.out.println("Unable to delete product!");
	}

	public void addWishlist() throws ProductException {
		System.out.print("\nEnter productId to add:");
		String input = "";
		input = in.nextLine();
		boolean isadded = service.addWishlist(input);
		if (isadded)
			System.out.println("Product Added SuccessFully !!");
		else
			System.out.println("Unable to add product!");
	}
}
