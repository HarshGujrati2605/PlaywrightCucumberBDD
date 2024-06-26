package stepdefinitions;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AlertsFramesWindowsPage;
import utils.Objects;

public class AlertsFramesWindowsSteps extends Objects {
  //  AlertsFramesWindowsPage alertsFramesWindowsPage = new AlertsFramesWindowsPage(DriverFactory.getPage(), DriverFactory.getContext());

    @When("user clicks {string} navbar option in Alerts, Frame & Windows page")
    public void clickAlertFrameWinNavBar(String navbarOption) {
        alertsFramesWindowsPage.clickAlertFrameWinNavBar(navbarOption);
    }

    @Then("verify {string} is url of new tab opened in Browser Windows section in Alerts, Frame & Windows page")
    public void verifyNewTabURL(String newTabURL) {
        Assert.assertTrue(alertsFramesWindowsPage.verifyNewTabURL(newTabURL));
    }

    @Then("verify {string} is url of new window opened in Browser Windows section in Alerts, Frame & Windows page")
    public void verifyNewWinURL(String newWinURL) {
        Assert.assertTrue(alertsFramesWindowsPage.verifyNewWinURL(newWinURL));
    }

    @When("user enters {string} text and accept the alert in Alerts section in Alerts, Frame & Windows page")
    public void enterTextAndAcceptAlert(String alertText) {
        alertsFramesWindowsPage.enterTextAndAcceptAlert(alertText);
    }

    @Then("verify {string} text is accepted in alert in Alerts section in Alerts, Frame & Windows page")
    public void verifyAlertText(String alertText) {
        Assert.assertTrue(alertsFramesWindowsPage.verifyAlertText(alertText));
    }

    @Then("verify {string} as frame content in Frames section in Alerts, Frame & Windows page")
    public void verifyFrameText(String frameText) {
        Assert.assertTrue(alertsFramesWindowsPage.verifyFrameText(frameText));
    }

    @Then("verify Nested Child frame is displayed in Nested Frames section in Alerts, Frame & Windows page")
    public void verifyNestedFrameChildText() {
        Assert.assertTrue(alertsFramesWindowsPage.verifyNestedFrameChildText());
    }
}
