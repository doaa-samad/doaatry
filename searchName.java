package najah.test;

import io.cucumber.java.en.*;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Scanner;

import code.customerServiceUse;
import code.Product;

public class searchName {
	
	static boolean userfound;
	static Scanner s= new Scanner(System.in);
	String username;
	@Given("that customer exists in the system")
	public void thatCustomerExistsInTheSystem() {
	    System.out.println("please enter user name you want to search");
	    username=s.nextLine();
	}
	@Given("customer may or may not have products")
	public void customerMayOrMayNotHaveProducts() {
	    
	}
	@When("the worker searches for customer name")
	public void theWorkerSearchesForCustomerName() {
	    userfound=customerServiceUse.customerfound(username);
	    
	}
	@Then("the worker recieves a list of customer name and thier products")
	public void theWorkerRecievesAListOfCustomerNameAndThierProducts() {
		if(userfound==true) {
			System.out.println("Customer name is : "+username+"\n");
			Product.printList(username);
			System.out.println("\n");
			assertTrue(userfound);
					
		}
	    
	}
	
	
	@Given("that worker searches for customer")
	public void thatWorkerSearchesForCustomer() {
	    
	}
	@Given("customer does not exist in the system")
	public void customerDoesNotExistInTheSystem() {
	    
	}
	@When("worker searches for customer name")
	public void workerSearchesForCustomerName() {
	    
	}
	@Then("a message pops up to infrom the worker no customer exists with that name.")
	public void aMessagePopsUpToInfromTheWorkerNoCustomerExistsWithThatName() {
		if(userfound==false) {
			System.out.println("cannot find user please try again later");
			assertFalse(userfound);
			
		}
		

	   
	}

}
