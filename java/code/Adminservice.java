package code;

import java.util.ArrayList;

public class Adminservice {
	
	private Adminservice() {}

	static ArrayList<String> service = new ArrayList<>();
	static ArrayList<String> price = new ArrayList<>();
	static ArrayList<String> address = new ArrayList<>();
	static ArrayList<String> addPrice = new ArrayList<>();
	private static boolean valbol;
	
    public static void addLocationNdPrice() {
    	address.add("Nablus aldwar");
    	address.add("Nablus,25th street");
    	address.add("rafidya street");
    	address.add("AlaaAldeen street");
    	address.add("almakhfi");
    	addPrice.add("20");
    	addPrice.add("25");
    	addPrice.add("15");
    	addPrice.add("10");
    	addPrice.add("20");
    	addPrice.add("12");
    }
    
    public static void addelemnts() {
    	Adminservice.service.add("Steam Cleaning");
		Adminservice.service.add("Stain removal");
		Adminservice.service.add("Children safe cleaning");
		Adminservice.price.add("50");
		Adminservice.price.add("100");
		Adminservice.price.add("250");
		
    }


	public static void addServNDPric(String serv,String pric) {
		valbol=foundServ(serv);
		
			if(!valbol) {
		           service.add(serv);
		           price.add(pric);
				}
			
			else {
				System.out.println("service already exists, cannot be added");
	           }


	}
	public static boolean foundServ(String ser) {
	for (int i=0;i<service.size();i++) {
		if(ser.equalsIgnoreCase(service.get(i)))
			return true;
	}
	     return false;	

	}	
public static String deliveryAvaialble(String add) {
	for(int i=0;i<address.size();i++){
		if(address.get(i).equalsIgnoreCase(add)) {
			return addPrice.get(i);
		}
	}

	return null;
}


}