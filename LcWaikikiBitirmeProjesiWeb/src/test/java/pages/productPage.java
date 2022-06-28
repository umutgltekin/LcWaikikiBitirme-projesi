package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

import java.util.List;

public class productPage {

    By shoulSeeProductPage= By.cssSelector(".container-fluid.product-list-banner__container");
    By clickColour=By.cssSelector(".color-filter-option__text");
    By clickName=By.cssSelector(".product-card__title");
    By shouldSeeProductdetailPage=By.cssSelector(".col-xs-7.col-sm-9");
    By clickAddCart=By.id("pd_add_to_cart");
    By clikProductSize=By.xpath("//*[@id=\"option-size\"]/a[2]");
    By clickCartButton=By.id("Path_3853");
    WebDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    public productPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }
    public void shouldSeeProductsPage(){
        elementHelper.checkElementPresence(shoulSeeProductPage);
    }
    public void clickColour(String colour){
        List<WebElement> elements=driver.findElements(clickColour);
        for (WebElement element : elements) {
            if (element.getText().contains(colour)) {
                element.click();
                break;
            }
        }
    }
    public void shouldSeeProductDetailPage(){
        elementHelper.checkElementPresence(shouldSeeProductdetailPage);
    }
    public void clickName(String ProductName){
        List<WebElement> elements=driver.findElements(clickName);
        for (WebElement element : elements) {
            if (element.getText().contains(ProductName)) {
                element.click();
                break;
            }
        }
    }
    public void clickProductSize(String productSize){
       String size= driver.findElement(clikProductSize).getAttribute("size");
       elementHelper.click(clikProductSize);
    }
    public void clickCAddart(){
        elementHelper.click(clickAddCart);
    }
    public void clickCartButton(){
        elementHelper.click(clickCartButton);
    }
}
