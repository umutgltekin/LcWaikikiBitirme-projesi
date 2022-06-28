package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class loginPage {
    By shouldSeeLoginPage= By.id("login");
    By enterEmail=By.name("email");
    By enterPassword=By.name("password");
    By clickLoginButton=By.cssSelector(".login-form__button.login-form__button--bg-blue");
    WebDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    public loginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }
        public void shouldSeeLoginPage(){
        elementHelper.checkElementPresence(shouldSeeLoginPage);

    }    public void enterEmail(String mail){
        elementHelper.sendKey(enterEmail,mail);

    }    public void enterPassword(String password){
        elementHelper.sendKey(enterPassword,password);

    }    public void clickLoginpageButton(){
        elementHelper.click(clickLoginButton);


    }

}
