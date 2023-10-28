package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ItemsPage extends BasePage{
    public ItemsPage(WebDriver driver) {
        super(driver);
    }

    By seemore = By.xpath("//ul[@data-csa-c-content-id=\"22541269031\"]//li[@class=\"a-spacing-micro\"]//span[@class=\"a-list-item\"]//div[@class=\"a-row a-expander-container a-expander-extend-container\"]//a[@data-csa-c-func-deps=\"aui-da-a-expander-toggle\"]//span[@class=\"a-expander-prompt\"]");
    By redmi = By.xpath("//li[@id=\"p_89/Redmi\"]//span[@class=\"a-list-item\"]//a[@class=\"a-link-normal s-navigation-item\"]//div[@class=\"a-checkbox a-checkbox-fancy s-navigation-checkbox aok-float-left\"]//label//i[@class=\"a-icon a-icon-checkbox\"]");

    By minPrice = By.xpath("//form[@method=\"get\"]//input[@id=\"low-price\"]");
    By highPrice = By.xpath("//form[@method=\"get\"]//input[@id=\"high-price\"]");

    By lastItem = By.cssSelector("img[data-image-index=\"4\"]");


    By goBtn = By.xpath("//span[@class=\"a-button-inner\"]//input[@type=\"submit\"]");

    public void selectBrand()  {
        //to expand the list
        driver.findElement(seemore).click();

        // to filter the mobiles
        driver.findElement(redmi).click();
        driver.findElement(minPrice).sendKeys("3500");
        driver.findElement(highPrice).sendKeys("5000");

        driver.findElement(goBtn).click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scrollBy(0,3000)");

         driver.findElement(lastItem).click();




    }
}
