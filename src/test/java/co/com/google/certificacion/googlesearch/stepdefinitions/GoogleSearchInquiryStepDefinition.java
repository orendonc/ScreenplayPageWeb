package co.com.google.certificacion.googlesearch.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.com.google.certificacion.googlesearch.interactions.commons.OpenTheBrowser.navigateForGoogle;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;


public class GoogleSearchInquiryStepDefinition {

    @Before
    public void initialConfiguration(){
        setTheStage(new OnlineCast());
    }

    @Given("^(.*) visit the Google platform$")
    public void userVisitTheGooglePlatform(String actor) throws Exception {
        theActorCalled(actor).wasAbleTo(navigateForGoogle());
    }

    @When("^User tries to search the next information$")
    public void userTriesToSearchTheNextInformation(String arg1) throws Exception {

    }


    @Then("^User verifies is success for the search$")
    public void userVerifiesIsSuccessForTheSearch() throws Exception {

    }

}
