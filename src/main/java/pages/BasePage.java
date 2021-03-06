package pages;


import helper.factory.Browser;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;

public abstract class BasePage {

    public Browser browser;
    public WebDriver driver;


    public BasePage() throws Exception {

        browser = new Browser();
        driver = browser.init();
        browser.open();
        PageFactory.initElements(driver, this);


    }

    public void close() {
        browser.close();
    }


    public void waitIfElementIsClickable(WebElement element, int time) {
        WebDriverWait wait = new WebDriverWait(driver, time);

        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitIfElementIsClickable(WebElement element) {

        waitIfElementIsClickable(element, 20);

    }

    public void waitIfElementIsEnabled(WebElement element, int time) {

        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.visibilityOf(element));

    }

    public void waitIfElementIsEnabled(WebElement element) {

        waitIfElementIsEnabled(element, 30);

    }

    public void waitIfElementIsClickableFluent(WebElement element, int Timeout, int Polling) {

        Wait wait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(Timeout))
                .pollingEvery(Duration.ofSeconds(Polling))
                .ignoring(Exception.class);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitIfElementIsClickableFluent(WebElement element) {

        waitIfElementIsClickableFluent(element, 30, 5);

    }

    public WebElement getClickableElement(WebElement element) {

        waitIfElementIsClickableFluent(element);
        return element;
    }

    public WebElement getEnabledElement(WebElement element) {

        waitIfElementIsEnabled(element);
        return element;
    }

    public WebElement getClickableFluentElement(WebElement element) {

        waitIfElementIsClickableFluent(element);
        return element;
    }


    public void clickIfElementIsClickable(WebElement element) {

        waitIfElementIsClickable(element);
        element.click();
    }

    public void clickIfElementIsClickableFluent(WebElement element) {

        waitIfElementIsClickableFluent(element);
        element.click();
    }

    public void clickIfElementIsEnabled(WebElement element) {

        waitIfElementIsEnabled(element);
        element.click();
    }

    public void clearField(WebElement element) {
        waitIfElementIsClickable(element);
        element.sendKeys(Keys.CONTROL + "a");
        element.sendKeys(Keys.DELETE);
    }

    public void moveToElement(WebElement element){


        new Actions(driver).moveToElement(element).build().perform();
    }

    public void refreshPage() {
        driver.navigate().refresh();
    }

    public String getNextTabUrlPage() throws InterruptedException {

        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
   //     driver.wait(20);
        String url = driver.getCurrentUrl();
        driver.close();
        driver.switchTo().window(tabs2.get(0));
        return url;

    }

    public void driverWait(int time) {

        driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
    }
}
