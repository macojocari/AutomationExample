package Steps;

import Pages.webDriverUniversityPage;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class WhenSteps {
    @When("I click on the BUTTON CLICKS")
    public void whenIClickOnTheBUTTONCLICKS() {
        webDriverUniversityPage.clickButtonClicks();
    }

    @When("I switch to another tab")
    public void whenISwitchToAnotherTab() {

        ArrayList<String> tabs = new ArrayList(Driver.getDriver().getWindowHandles());
        Driver.getDriver().switchTo().window(tabs.get(1));
    }

    @When("I click on the first button")
    public void whenIClickOnTheFirstButton() {

        webDriverUniversityPage.ClickMe1();
    }

    @When("I click on the second button")
    public void whenIClickOnTheSecondButton() {
        webDriverUniversityPage.ClickMe2();
    }

    @When("I click on the third button")
    public void whenIClickOnTheThirdButton() {
        webDriverUniversityPage.ClickMe3();
    }
}
