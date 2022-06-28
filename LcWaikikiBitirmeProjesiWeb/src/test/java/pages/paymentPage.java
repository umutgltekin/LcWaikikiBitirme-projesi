package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class paymentPage {
    By checkPaymentPage= By.id("progressStateBar");
    WebDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    public paymentPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }
    public void checkPaymentPage(){
        elementHelper.checkElementPresence(checkPaymentPage);

    }

}
