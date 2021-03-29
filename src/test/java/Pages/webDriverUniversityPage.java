package Pages;

import Steps.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import static com.thoughtworks.selenium.SeleneseTestNgHelper.assertEquals;

public class webDriverUniversityPage {
    public static final String URL = "http://webdriveruniversity.com/";

    public static void initialiseSite() {
        Driver.getDriver().get(URL);
        PageFactory.initElements(Driver.getDriver(), webDriverUniversityPage.class);
    }

    @FindBy(xpath = "//h1[text()='BUTTON CLICKS']")
    private static WebElement buttonClicks;

    @FindBy(id = "button1")
    private static WebElement clickMe1;

    @FindBy(id = "button2")
    private static WebElement clickMe2;

    @FindBy(id = "button3")
    private static WebElement clickMe3;

    @FindBy(xpath = "//h4[text()='Congratulations!']")
    private static WebElement firstMessage;

    @FindBy(xpath = "//h4[text()='It’s that Easy!!  Well I think it is.....']")
    private static WebElement secondMessage;

    @FindBy(xpath = "//div[@id='myModalMoveClick']//h4")
    private static WebElement thirdMessage;

    @FindBy(xpath = "//button[text()='Close']")
    private static WebElement buttonClose;

    @FindBy(xpath = "//*[@id=\"myModalJSClick\"]/div/div/div[3]/button")
    private static WebElement buttonClose2;

    @FindBy(xpath = "//*[@id=\"myModalMoveClick\"]/div/div/div[3]/button")
    private static WebElement buttonClose3;


    public static void clickButtonClicks() {
        buttonClicks.click();
    }

    public static void ClickMe1() {
        clickMe1.click();
    }

    public static void ClickMe2() {
        clickMe2.click();
    }

    public static void ClickMe3() {
        clickMe3.click();
    }

    public static void clickButtonClose() {
        buttonClose.click();
    }

    public static void clickButtonClose2() {
        buttonClose2.click();
    }

    public static void clickButtonClose3() {
        buttonClose3.click();
    }

    public static void checkFirstMessage() {
        String actualResult = firstMessage.getText().trim();
        String expectedResult = "Congratulations!";
        assertEquals(actualResult, expectedResult);

    }

    public static void checkSecondMessage() {
        String actualResult = secondMessage.getText().trim();
        String expectedResult = "It’s that Easy!! Well I think it is.....";
        assertEquals(actualResult, expectedResult);
    }

    public static void checkThirdMessage() {
        String actualResult = thirdMessage.getText().trim();
        String expectedResult = "Well done! the Action Move & Click can become very useful!";
        assertEquals(actualResult, expectedResult);

    }
}
