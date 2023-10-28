package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class CartPage extends BasePage {

    public CartPage(WebDriver driver) {
        super(driver);
    }

    By addToCart = By.cssSelector("input[name=\"submit.add-to-cart\"]");

    By message = By.cssSelector("span[class=\"a-size-medium-plus a-color-base sw-atc-text a-text-bold\"]");
    By thanksBtn = By.xpath("//span[@id=\"attachSiNoCoverage\"]//span[@class=\"a-button-inner\"]");

    By cartNav = By.cssSelector("div[id=\"nav-cart-count-container\"]");
    By deleteBtn = By.xpath("//span[@data-action=\"delete\"]//span[@data-action=\"sc-item-action\"]");


    public void userAddToCart(){
        driver.findElement(addToCart).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions
                .visibilityOfElementLocated(thanksBtn)).click();

    }


    public String checkMessage(){

         String actualMessage = driver.findElement(message).getText();

         return actualMessage;


    }

    public void deleteFromCart(){
        driver.findElement(cartNav).click();
        driver.findElement(deleteBtn).click();
    }

}
