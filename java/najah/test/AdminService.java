package najah.test;
import static org.junit.Assert.assertTrue;

import java.util.Scanner;

import code.Admin;
import code.Adminservice;
import io.cucumber.java.en.*;

public class AdminService {
	 String serv;
	 String serv2;
	 String pric;
	 boolean t;
	 Admin ad = new Admin();
	 static Scanner s= new Scanner(System.in);
	 

	@Given("list of services is")
	public void listOfServicesIs(io.cucumber.datatable.DataTable dataTable) {
	   
	}
	@Given("admin is logged in")
	public void adminIsLoggedIn() {
		

	}
	@Given("service is not in the system")
	public void serviceIsNotInTheSystem() {

	}
	@Given("service is {string} and price is {string}")
	public void serviceIsAndPriceIs(String service, String price) {
		System.out.println("please press enter");
		serv=s.nextLine();
		System.out.println("please enter service you want to add");
		serv=s.nextLine();
		System.out.println("please enter price of service you want to add");
		pric=s.nextLine();
			}
	@When("admin wants to add service")
	public void adminWantsToAddService() {
		Adminservice.addServNDPric(serv,pric);

		
	}
	@Then("the service is added")
	public void theServiceIsAdded() {
		t=Adminservice.foundServ(serv);
		if(t)
			System.out.printf("service will be added");
			
		assertTrue(" added",t);
		
	}
		

	
	
	@Given("admin loged in")
	public void adminLogedIn() {

	}
	@Given("service is in the system")
	public void serviceIsInTheSystem() {

	}
	@Given("admin selects to add service")
	public void adminSelectsToAddService() {

	}
	@When("admin must enter1 {string} and {string}")
	public void adminMustEnter1And(String serv1, String pric1) {
		
		Adminservice.addServNDPric(serv1, pric1);
		serv2=serv1;
		

	}
	@Then("this service could not be added")
	public void thisServiceCouldNotBeAdded() {
		t=Adminservice.foundServ(serv2);
		assertTrue("cannot be added",t);	
		System.out.println(t);
	}
	
	
	}
