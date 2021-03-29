package Steps;

import Pages.webDriverUniversityPage;
import cucumber.api.java.en.Given;

public class GivenSteps {
    @Given("I am on the webdriveruniversity site")
    public void givenIAmOnTheWebDriverUniversitySite() {
        webDriverUniversityPage.initialiseSite();
    }
}
