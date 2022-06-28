package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import util.ElementHelper;

public class cartPage {
    By checkCartPage= By.cssSelector(".price-info-area");
    By checkProductSize=By.cssSelector(".rd-cart-item-size ");
    By checkProductName=By.cssSelector(".rd-cart-item-title");
    By checkProductNummberOf=By.cssSelector(".item-quantity-input.ignored");
    By clickPaymentPageButton=By.cssSelector(".col-md-12.pl-20.pr-20");
    WebDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    public cartPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }
    public void checkCartPage(){
        elementHelper.checkElementPresence(checkCartPage);
    }
    public void checkProductSize(String size){
        String text=driver.findElement(checkProductSize).getText();
    }
    public void checkProductName(String name){
        elementHelper.checkElementWithText(checkProductName,name);
    }
    public void clickPaymentPageButton(){
        elementHelper.click(clickPaymentPageButton);
    }
    public void checkProductNummberOf(int NummberOf){
        boolean find=false;
        int number= Integer.parseInt(driver.findElement(checkProductNummberOf).getAttribute("value"));
        if(number==NummberOf){
            find=true;
        }
        Assert.assertEquals(true, find);
    }
}
