package capgemini.greatoutdoor.wishlistmodule.model;

public class Product {
	
double price;
String color;
String dimension;
String specification;
String manufacturer;
String productName;
int quantity;
int productCategory;
Product(String productName,String manufacturer,String color,double price,String dimension,
		String specification,int quantity,int productCategory)
{
	setProductName(productName);
	setManufacturer(manufacturer);
	setColor(color);
	setPrice(price);
	setDimension(dimension);
	setSpecification(specification);
	setQuantity(quantity);
	setProductCategory(productCategory);
	}
@Override
public String toString() {
	return String.format("\t%s\t\t%s\t\t%s\t%s\t\t%s  \t%s\t\t%s\t\t%s ",productName,color,price,specification,manufacturer,quantity,productCategory,dimension);
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public String getDimension() {
	return dimension;
}
public void setDimension(String dimension) {
	this.dimension = dimension;
}
public String getSpecification() {
	return specification;
}
public void setSpecification(String specification) {
	this.specification = specification;
}
public String getManufacturer() {
	return manufacturer;
}
public void setManufacturer(String manufacturer) {
	this.manufacturer = manufacturer;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public int getProductCategory() {
	return productCategory;
}
public void setProductCategory(int productCategory) {
	this.productCategory = productCategory;
}

}

