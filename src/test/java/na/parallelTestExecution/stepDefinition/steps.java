package na.parallelTestExecution.stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class steps {
	@Given("^When project is setup properly$")
	public void whenProjectIsSetupProperly()  {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Given");
	}

	@When("^This is parallel execution is done$")
	public void thisIsParallelExecutionIsDone() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("When");
	}

	@Then("reports should be created {string}")
	public void reportsShouldBeCreated(String scenario) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(scenario + " executed");
	}
	
	
}
