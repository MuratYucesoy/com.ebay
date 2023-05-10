package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.GiftCardPage;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

public class EbayStep {
    Actions actions;
    HomePage homePage;

    GiftCardPage giftCardPage;
    SoftAssert softAssert;
    @Given("the user goes to the ebay homepage")
    public void the_user_goes_to_the_ebay_homepage() {
        Driver.getDriver().get(ConfigReader.getProperty("urlEbay"));
    }
    @Then("selects the gift card from the deals and sales drop-down menu in the top bar")
    public void selects_the_gift_card_from_the_deals_and_sales_drop_down_menu_in_the_top_bar() {
        actions=new Actions(Driver.getDriver());
        homePage=new HomePage();

        actions.moveToElement(homePage.dealsAndSales).perform();
        ReusableMethods.waitForVisibility(homePage.giftCards,10);
        actions.moveToElement(homePage.giftCards).click().perform();
    }
    @Then("click all filters button")
    public void click_all_filters_button() {
        actions=new Actions(Driver.getDriver());
        homePage=new HomePage();
        giftCardPage=new GiftCardPage();

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitForClickablility(giftCardPage.allFilters,10).click();
    }


    @Then("clicks on the price and enters {string} and {string}")
    public void clicksOnThePriceAndEntersAnd(String firstPrice, String secondPrice) {
        giftCardPage=new GiftCardPage();
        actions=new Actions(Driver.getDriver());

        giftCardPage.price.click();
        giftCardPage.fromPrice.sendKeys(firstPrice);
        giftCardPage.toPrice.sendKeys(secondPrice);
        actions.sendKeys(Keys.ENTER).perform();

    }


    @Then("clicks on the item position and enters the {string} distance")
    public void clicksOnTheItemPositionAndEntersTheDistance(String distance) {
        giftCardPage=new GiftCardPage();
        //actions=new Actions(Driver.getDriver());

        giftCardPage.itemLocation.click();
        giftCardPage.withInRadio.click();
        giftCardPage.withInFirstValue.click();
        Select select=new Select(giftCardPage.withInFirstValue);
        select.selectByIndex(0);

        giftCardPage.withInSecondValue.click();
        giftCardPage.withInSecondValue.clear();
        giftCardPage.withInSecondValue.sendKeys(distance);
        //actions.sendKeys(Keys.ENTER).perform();
        giftCardPage.withInRadio.click();
    }

    @Then("clicks delivery options and enters {string}")
    public void clicksDeliveryOptionsAndEnters(String text) {
        giftCardPage=new GiftCardPage();

        switch (text) {
            case "Free Postage"->{
                giftCardPage.deliveryOptions.click();
                giftCardPage.freePostage.click();}
        }

    }
    @Then("clicks on the show only and prefer {string}, {string} and {string}")
    public void clicksOnTheShowOnlyAndPreferAnd(String arg0, String arg1, String arg2) {
        giftCardPage=new GiftCardPage();

        giftCardPage.showOnly.click();

        if (arg1.equals("Deals & Savings")){giftCardPage.dealsAndSavings.click();}
        if(arg0.equals("Sale items")){giftCardPage.saleItems.click();}
        if (arg2.equals("Accepts Best offer")){giftCardPage.acceptBestOffer.click();}
    }


    @Then("clicks on the seller and click {string}")
    public void clicksOnTheSellerAndClick(String text) {
        giftCardPage=new GiftCardPage();

        giftCardPage.seller.click();
        giftCardPage.showItemsCheckbox.click();

        switch (text){
            case "Sellers with eBay Stores"->{
                giftCardPage.sellersWithEbay.click();
            }
        }
    }

    @Then("verifies the conditions")
    public void verifiesTheConditions() {

        giftCardPage=new GiftCardPage();
        softAssert=new SoftAssert();

        softAssert.assertEquals(giftCardPage.conditions.get(0).getText(),"$500 - $1000");
        softAssert.assertEquals(giftCardPage.conditions.get(1).getText(),"Within 2 km from 10 km");
        softAssert.assertEquals(giftCardPage.conditions.get(2).getText(),"Free postage");
        softAssert.assertEquals(giftCardPage.conditions.get(3).getText(),"Deals & savings");
        softAssert.assertEquals(giftCardPage.conditions.get(4).getText(),"Sale items");
        softAssert.assertEquals(giftCardPage.conditions.get(5).getText(),"Accepts Best Offer");
        softAssert.assertEquals(giftCardPage.conditions.get(6).getText(),"Sellers with eBay Stores");

        softAssert.assertAll();

    }

    @And("clicks apply button")
    public void clicksApplyButton() {
        giftCardPage=new GiftCardPage();

        giftCardPage.apply.click();
    }

    @And("verifies that products are listed in the required criteria")
    public void verifiesThatProductsAreListedInTheRequiredCriteria() {
        giftCardPage=new GiftCardPage();

        Assert.assertFalse(giftCardPage.notFoundText.isDisplayed());

    }

    @And("closes the page")
    public void closesThePage() {
        Driver.closeDriver();
    }

    @And("verifies that the product prices are within the entered price value range")
    public void verifiesThatTheProductPricesAreWithinTheEnteredPriceValueRange() {
        giftCardPage=new GiftCardPage();

        List<WebElement> productPrices=new ArrayList<>();
        
        productPrices.addAll(giftCardPage.prices);


    }
}
