package co.com.google.certificacion.authentication.stepdefinitions;

import co.com.google.certificacion.authentication.exceptions.AuthenticationException;
import co.com.google.certificacion.authentication.models.Credentials;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static co.com.google.certificacion.authentication.exceptions.AuthenticationException.THE_AUTHENTICATION_WAS_FAILED;
import static co.com.google.certificacion.authentication.questions.authentication.SuccessAuthentication.theVerificationWasSuccessForAuthentication;
import static co.com.google.certificacion.authentication.tasks.Authenticate.authenticateWith;
import static co.com.google.certificacion.authentication.tasks.NavigateTo.visitSauceLabPageWeb;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;


public class AuthenticationStepDefinition {

    @Before
    public void initialConfiguration(){
        setTheStage(new OnlineCast());
    }

    @Given("^(.*) visit the SauceLab web$")
    public void userVisitTheSauceLabWeb(String actor) {
        theActorCalled(actor).wasAbleTo(visitSauceLabPageWeb());
    }

    @When("^User tries to login with the next information$")
    public void userTriesToLoginWithTheNextInformation(List<Credentials> data){
        theActorInTheSpotlight().attemptsTo(authenticateWith(data.get(0)));
    }

    @Then("^User verifies is success authentication was successful$")
    public void userVerifiesIsSuccessAuthenticationWasSuccessful(){
        theActorInTheSpotlight().should(seeThat(theVerificationWasSuccessForAuthentication()).orComplainWith(AuthenticationException.class,THE_AUTHENTICATION_WAS_FAILED));
    }


}
