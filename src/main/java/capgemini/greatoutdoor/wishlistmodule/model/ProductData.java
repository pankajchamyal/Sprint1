package capgemini.greatoutdoor.wishlistmodule.model;

import java.util.HashMap;
import java.util.Map;

public class ProductData {
	
	
	static Map<String,Product> productlist= new HashMap<>();
	
	public Map<String,Product> getdata()
	{
		Product p1=new Product("Generic name 1","Quechua","Blue",2999.0,"Dimension1","Specs1",1,1);
		Product p2=new Product("Generic name 2","Forclaz","Magenta",5199.0,"Dimension2","Specs2",1,1);
		Product p3=new Product("Generic name 3","Quechua","Blue",3999.0,"Dimesnion3","specs3",5,1);
		Product p4=new Product("Generic name 4","Inesis","White",100.0,"Dimension4","specs4",3,2);
		Product p5=new Product("Generic name 5","Inesis","Grey",1999.0,"Dimension5","specs5",1,2);
		Product p6=new Product("Generic name 6","Quechua","Black",1399.0,"Dimension6","specs6",1,3);
		Product p7=new Product("Generic name 7","Forclaz","Blue",599.0,"Dimension7","specs7",1,3);
		Product p8=new Product("Generic name 8","Forclaz","pink",899.0,"Dimension8","specs8",1,4);
		Product p9=new Product("Generic name 9","Kiprun","Black",1499.0 ,"Dimension9","specs9",1,5);
		
		
		productlist.put("a11240",p1);
		productlist.put("k88201",p2);
		productlist.put("z60502",p3);
		productlist.put("g92003",p4);
		productlist.put("j10004",p5);
		productlist.put("z10365",p6);
		productlist.put("a12356",p7);
		productlist.put("h19617",p8);
		productlist.put("v11248",p9);
		return productlist;
	}
}

