package Steps;

import Pages.webDriverUniversityPage;
import cucumber.api.java.en.Then;

public class ThenSteps {
    @Then("I check the first message")
    public void thenICheckTheFirstMessage() throws InterruptedException {
        Thread.sleep(2000);
        webDriverUniversityPage.checkFirstMessage();
        Thread.sleep(1000);
        webDriverUniversityPage.clickButtonClose();
    }

    @Then("I check the second message")
    public void thenICheckTheSecondMessage() throws InterruptedException {
        Thread.sleep(2000);
        webDriverUniversityPage.checkSecondMessage();
        Thread.sleep(1000);
        webDriverUniversityPage.clickButtonClose2();
    }

    @Then("I check the third message")
    public void thenICheckTheThirdMessage() throws InterruptedException {
        Thread.sleep(2000);
        webDriverUniversityPage.checkThirdMessage();
        Thread.sleep(1000);
        webDriverUniversityPage.clickButtonClose3();
    }

}
