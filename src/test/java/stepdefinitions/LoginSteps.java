package stepdefinitions;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;
import utils.Objects;
import utils.WebActions;

public class LoginSteps extends Objects{
	
    //LoginPage loginPage = new LoginPage(DriverFactory.getPage());

    @Given("user navigates to {string}")
    public void navigateToUrl(String url) throws InterruptedException {
        loginPage.navigateToUrl(url);
    }

    @When("user enters {string} username")
    public void enterUsername(String username) {
        loginPage.enterUsername(username);
    }

    @When("user enters {string} password")
    public void enterPassword(String password) {
        loginPage.enterPassword(password);
    }

    @When("user clicks Login button")
    public void clickLogin() {
        loginPage.clickLogin();
    }

    @When("user clicks on {string} icon in main page")
    public void clickOnIcon(String iconName) {
        loginPage.clickOnIcon(iconName);
    }

    @Then("verify that user is logged in and navigated to Profile page")
    public void verifyProfilePage() {
        Assert.assertTrue(loginPage.verifyProfilePage());
    }
    
    @Given("I am on homepage of demoqa")
    public void clickHome() {
    	loginPage.clickHomePage();
    	
    }
}
