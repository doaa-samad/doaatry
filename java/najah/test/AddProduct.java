package najah.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Scanner;

import code.Customer;
import code.customerServiceUse;
import code.Product;
import io.cucumber.java.en.*;

public class AddProduct {

	
String username;	
String Type;
String Material;
String height;
String width;
String specialTreatment;
boolean isProductFounded;

Product p;

static Scanner s=new Scanner(System.in);


@Given("Customer {string} logged in successfully")
public void customerLoggedInSuccessfully(String string) {
customerServiceUse.addUsersFirstTime();


	System.out.printf("please enter valid username\n");
	username=s.nextLine();
	Customer.saveName(username);
	
	
    
}
@When("Customer must enter the info {string} {string}")
public void customerMustEnterTheInfo(String type, String material) {
	System.out.printf("please enter procut type\n");
	Type=s.nextLine();
	System.out.printf("please enter procut material\n");
	Material= s.nextLine();
	

    
}
@When("customer must add {string} {string} {string}")
public void customerMustAdd(String h, String w, String speciel) {
	System.out.printf("please enter procut height\n");
	height=s.nextLine();
	System.out.printf("please enter procut width\n");
	width= s.nextLine();
	System.out.printf("please enter procut speacial treatment\n");
	specialTreatment=s.nextLine();

   
}
@Then("Product is added to be handled")
public void productIsAddedToBeHandled() {
	
   isProductFounded=customerServiceUse.UserList(username,Type,specialTreatment);
   if(isProductFounded==false) {
	   System.out.println("this is found");
   }
   else {
    p=new Product(Type,Material,height,width,specialTreatment);
    	customerServiceUse.addnewProductofCustomer(username, p);
    	
   isProductFounded=customerServiceUse.UserList(username,Type,specialTreatment);	
assertTrue("added successfully",!isProductFounded);
if(isProductFounded==false) {
	System.out.println("added successfully");
}

    }

}




@Given("Customer {string} logged in")
public void customerLoggedIn(String string) {

    
}
@When("customer enters {string} {string}")
public void customerEnters(String string, String string2) {

   
}
@When("customer adds {string} {string} {string}")
public void customerAdds(String string, String string2, String string3) {

    
}
@When("the product was previously added and status in progress")
public void theProductWasPreviouslyAddedAndStatusInProgress() {

    
}
@Then("customer cannot add product because it already exists")
public void customerCannotAddProductBecauseItAlreadyExists() {
	isProductFounded=customerServiceUse.UserList(username,Type,specialTreatment);
	if(isProductFounded==false)
		assertEquals("already found",isProductFounded,false);

   
}










	
}
