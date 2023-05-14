package code;

import java.util.ArrayList;

public class invoice {
	static ArrayList<Product> p=new ArrayList<>();
	static String price;
	static int x;
	static String name;
	static int total=0;
	static String service;
	 static String delv;
	 
	 private invoice() {}

public static int printInvoice(String username, int pnum,String addres) {
	Adminservice.addelemnts();	
	delv=Adminservice.deliveryAvaialble(addres);
p=(ArrayList<Product>) customerServiceUse.allprod(username);

System.out.println("              ****_____________________________________________________________________________________****    ");
for(int i=0; i<pnum;i++) {
	service=p.get(i).getSpecialTreat();
	price=getPrice(service);
	System.out.println("      "+i+"   |   "+p.get(i)+"   | "+" price"+price+"\n");
	System.out.println(" ____________________________________________________________________________________________     ");
	total=total+Integer.parseInt(price);

}

System.out.println("          ******* price of all added products= "+total+"***********    "+"\n");
if(delv!=null) {
	System.out.println("price of Delivery"+delv+"\n");
	total=total+Integer.parseInt(delv);
	System.out.println("Total price including delivery"+total);
}
	
System.out.println("              ****_____________________________________________________________________________________****    ");
System.out.println("\n\n");
return total;
}

public static String getPrice(String serv) {
	
	for(int i=0;i<Adminservice.service.size();i++){
		if(Adminservice.service.get(i).equalsIgnoreCase(serv)) {
			return Adminservice.price.get(i);
			}
	}
	return "75";
}


}
