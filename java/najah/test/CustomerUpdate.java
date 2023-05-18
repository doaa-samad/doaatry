package najah.test;

import io.cucumber.java.en.*;

import static org.junit.Assert.assertTrue;

import code.Customer;


public class CustomerUpdate {
	
	String customerNewAddress;
	String customerNewPhone;
	String customerNewPassword;
	boolean couldChange;
	Customer c1= new Customer();
	
	
	@Given("Customer wants to change address which is {string}")
	public void customerWantsToChangeAddressWhichIs(String string) {
	    // Write code here that turns the phrase above into concrete actions

	}
	@When("Customer requests to change it to {string}")
	public void customerRequestsToChangeItTo(String userInputAddress) {
	    // Write code here that turns the phrase above into concrete actions
		c1.setAddress(userInputAddress);
		customerNewAddress=c1.getAddress();
		couldChange=customerNewAddress.equalsIgnoreCase(userInputAddress);
		

	}
	@Then("Customer could change Address in record")
	public void customerCouldChangeAddressInRecord() {
		assertTrue("done",couldChange);

	}
	
	@Given("customer wants to change phone number whih is {string}")
	public void customerWantsToChangePhoneNumberWhihIs(String string) {


	}
	@When("customer requests to changes it to {string}")
	public void customerRequestsToChangesItTo(String userInputPhone) {
		c1.setPhone(userInputPhone);
		customerNewPhone=c1.getPhone();
		couldChange=customerNewPhone.equalsIgnoreCase(userInputPhone);


	}
	@Then("Customer have changed address in record")
	public void customerHaveChangedAddressInRecord() {
		assertTrue("done",couldChange);

	}
	
	@Given("Customer wants to change password which is {string}")
	public void customerWantsToChangePasswordWhichIs(String string) {

	}
	@When("customer change it to {string}")
	public void customerChangeItTo(String userInputPassword) {
		c1.setPassword(userInputPassword);
		customerNewPassword=c1.getPassword();
		couldChange=customerNewPassword.equals(userInputPassword);

	}
	@Then("customer have changed it in records")
	public void customerHaveChangedItInRecords() {
		assertTrue("done",couldChange);

	}
	
	
}