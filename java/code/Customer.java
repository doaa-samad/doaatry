package code;
import java.util.ArrayList;


public class Customer extends User{
	static String nametemp;
	
	static ArrayList<Customer> customs= new ArrayList<>();
	
	ArrayList<Product> listing;

	public Customer() {
		super();
		listing=new ArrayList<>();
	
	}

	public Customer(String id, String nme ,String pass, String phne, String adres) {
		super(id,nme,pass,phne,adres);
		setType(1);
		listing=new ArrayList<>();
	}	

	public static void saveName(String username) {
		nametemp=username;
	}
	
	public static String returnName() {
		return nametemp;
	}
		
	}