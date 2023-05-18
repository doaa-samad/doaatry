
package code;

import java.util.ArrayList;
import java.util.List;

public class customerServiceUse {
	static Customer c1;
	static Customer c2;
	static Customer c3;
	static Product p1;
	static Product p2;
	static Product p3;
	 static ArrayList<Customer> customs= new ArrayList<>();	
	
	 private customerServiceUse() {
	       
	    }
	
	public static void addUsersFirstTime() {
		c1=new Customer("144","aya","aya123","0598764123","Nablus aldwar");
		c2=new Customer("176","naser yonis","nas234","0563214698","Nablus,25th street");
		c3=new Customer("123","leen ayman","leenay123","0593587456","rafidya");
		p1= new Product("Carpet","wool","2m","3m","Stain removal");
		p2= new Product("Carpet","furr","4.5m","3.2m","children safe cleaning");
		p3= new Product("mattress","cotton","200cm","280cm","Stain removal");
		
		customs.add(c1);
		customs.add(c2);
		customs.add(c3);
		c1.listing.add(p1);
		c2.listing.add(p2);
		c3.listing.add(p3);
		
	}
	
	public static boolean UserList(String username, String type, String special) {
	    int y = customerInt(username);
	    if (y > -1 && customs.get(y) != null) {
	        for (int k = 0; k < customs.get(y).listing.size(); k++) {
	            if (customs.get(y).listing.get(k).getProdType().equalsIgnoreCase(type) &&
	                customs.get(y).listing.get(k).getSpecialTreat().equalsIgnoreCase(special)) {
	                return false;
	            }
	        }
	    }
	    return true;
	}
	
	public static int customerInt(String username) {
int x = -1;

		for(int i=0;i<customs.size();i++) 
			if(customs.get(i).getName().equalsIgnoreCase(username)) {
			
				x=i;
				break;
			}
		return x;
	}
	
	public static void addnewProductofCustomer(String username, Product p) {
		int u=customerInt(username);
		customs.get(u).listing.add(p);
			
	}
	
   public static int pList(String user){
		for(int i=0;i<customs.size();i++) {
			if(customs.get(i).getName().equalsIgnoreCase(user))
				return customs.get(i).listing.size();

		}
		return -1;
	}
   
   public static String userAddress(String username) {
	   int k=-1;
	   k=customerInt(username);
	   return customs.get(k).getAddress();

   }
	
   public static List<Product> allprod(String username) {
	    int y = customerInt(username);
	    return customs.get(y).listing;
	}
   
   public static void updateCustomsList(String username) {
	    int usr = customerInt(username);
	    customs.get(usr).listing.addAll(Product.updatedListReturn());
	}


   public static boolean customerfound(String username) {
	    int y = customerInt(username);
	    return y > -1;
	}
   
   
}

