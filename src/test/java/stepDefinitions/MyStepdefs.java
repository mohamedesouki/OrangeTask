package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.CartPage;
import pages.ItemsPage;
import pages.MainPage;
import static stepDefinitions.Hooks.driver;

public class MyStepdefs {

    MainPage mainPage = new MainPage(driver);
    ItemsPage itemsPage = new ItemsPage(driver);
    CartPage cartPage = new CartPage(driver);
    @Given("user open main page")
    public void userOpenMainPage() {
    }


    @When("user search for {string}")
    public void userSearchFor(String item) {
        mainPage.enterItem(item);
        mainPage.clickButton();
    }

    @And("user filter the the brand and select last item")
    public void userSelectTheBrand() {
        itemsPage.selectBrand();
    }

    @And("user add mobile to the cart")
    public void userAddMobileToTheCart() {
        cartPage.userAddToCart();
    }

    @Then("success message appears")
    public void successMessageAppears() {
        Assert.assertEquals(cartPage.checkMessage(),"تمت الإضافة إلى عربة التسوق");

    }

    @And("user delete mobile from cart")
    public void userDeleteMobileFromCart() {
        cartPage.deleteFromCart();

    }
}
