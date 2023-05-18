package najah.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Scanner;

import code.Customer;
import code.customerServiceUse;
import code.Product;
import io.cucumber.java.en.*;

public class productUpdate {
	static Scanner s= new Scanner(System.in);
	String nameofuser;
	static boolean found;
	static boolean update;
	static int temp;
	
	@Given("Customer {string} has product {string} in their cart")
	public void customerHasProductInTheirCart(String string, String string2) {
		System.out.println("Please enter username");
		nameofuser=Customer.returnName();
		temp=customerServiceUse.customerInt(nameofuser);
		}
	@Given("the customer {string} wants to update product \"Furr \"information to {string}")
	public void theCustomerWantsToUpdateProductFurrInformationTo(String string, String string2) {
		found=Product.isProductFound(nameofuser);

	}
	@When("the product {string} is found in the system")
	public void theProductIsFoundInTheSystem(String string) {

	}
	@Then("the product information are updated to {string} .")
	public void theProductInformationAreUpdatedTo(String string) {
		if(found==true) {
			update=Product.updateProduct();
			customerServiceUse.updateCustomsList(nameofuser);
			assertTrue("updated successfully",update);
		}
		
	}
	

	
	
	@Given("Customer {string} doesnt have the product {string} in thier cart")
	public void customerDoesntHaveTheProductInThierCart(String string, String string2) {

	}
	@Given("customer {string} tries to update product {string} information {string}")
	public void customerTriesToUpdateProductInformation(String string, String string2, String string3) {
	
	}
	@When("the product {string} isnt in the system")
	public void theProductIsntInTheSystem(String string) {
		

	}
	@Then("the information {string} are not updated.")
	public void theInformationAreNotUpdated(String string) {
		if(found==false)  {
			System.out.println("product is not available in the system");
			assertFalse("cannot be updated",found);
		}
			
	
	}
	
	
	
}
