package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

import javax.swing.*;
import java.util.List;


public class homePage {
    By userNavigatesToLcwaikiki=By.cssSelector(".mini-slider.container");
    By clickLoginButton=By.id("user_1_");
    By hoverMousHover=By.cssSelector(".menu-header-item__title");
    By cliclProductName=By.linkText("Bluz");
    WebDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;
    Actions action;

    public homePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.action=new Actions(driver);
        this.elementHelper = new ElementHelper(driver);
    }
    public void userNavigatestoLCWaikiki(){
        elementHelper.checkElementPresence(userNavigatesToLcwaikiki);
    }
    public void clickLoginButton(){
        elementHelper.click(clickLoginButton);
    }
    public void shouldSeeHomePage (){
        elementHelper.checkElementPresence(userNavigatesToLcwaikiki);
    }
    public void hoverMouseHover (String categoryName ){
        List<WebElement> elements=driver.findElements(hoverMousHover);
        for (WebElement element : elements) {
            if (element.getText().contains(categoryName)) {
                action.moveToElement(element).perform();
                break;
            }
        }
    }
    public void clickProduct(String productName){
       driver.findElement(cliclProductName).click();

            }


}
