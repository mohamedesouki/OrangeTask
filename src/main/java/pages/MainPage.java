package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    By searchBar = By.cssSelector("input[id=\"twotabsearchtextbox\"]");

    By searchBtn = By.cssSelector("input[id=\"nav-search-submit-button\"]");



    public void enterItem(String item){
        driver.findElement(searchBar).sendKeys("Mobile");
    }

    public void clickButton(){
        driver.findElement(searchBtn).click();
    }
}
