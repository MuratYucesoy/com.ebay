package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class GiftCardPage {
    public GiftCardPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //https://www.ebay.com.au/ > Deals & Sales > Gift Cards > All filters
    @FindBy(xpath = "//button[text()='All filters']")
    public WebElement allFilters;

    //https://www.ebay.com.au/ > Deals & Sales > Gift Cards > All filters >price
    @FindBy(css = "#c3-mainPanel-price")
    public WebElement price;

    //https://www.ebay.com.au/ > Deals & Sales > Gift Cards > All filters > price > Minimum value
    @FindBy(xpath = "//input[@aria-label='Minimum value, Australian Dollar']")
    public WebElement fromPrice;

    //https://www.ebay.com.au/ > Deals & Sales > Gift Cards > All filters > price > Maximum value
    @FindBy(xpath = "//input[@aria-label='Maximum value, Australian Dollar']")
    public WebElement toPrice;

    //https://www.ebay.com.au/ > Deals & Sales > Gift Cards > All filters > Item location
    @FindBy(xpath = "//span[text()='Item location']")
    public WebElement itemLocation;

    //https://www.ebay.com.au/ > Deals & Sales > Gift Cards > All filters > Item location > Within
    @FindBy(css = "#c3-subPanel-location_Within-0-_valueOption")
    public WebElement withInRadio;

    //https://www.ebay.com.au/ > Deals & Sales > Gift Cards > All filters > Item location > Within > FirstValue
    @FindBy(id = "c3-subPanel-location_Within-0-_select")
    public WebElement withInFirstValue;

    //https://www.ebay.com.au/ > Deals & Sales > Gift Cards > All filters > Item location > Within > SecondValue
    @FindBy(xpath = "//input[@class='x-zipcode-validator-input']")
    public WebElement withInSecondValue;

    //https://www.ebay.com.au/ > Deals & Sales > Gift Cards > All filters > Delivery options
    @FindBy(xpath = "//*[text()='Delivery options']")
    public WebElement deliveryOptions;

    //https://www.ebay.com.au/ > Deals & Sales > Gift Cards > All filters > Delivery options > Free Postage
    @FindBy(id = "c3-subPanel-LH_FS_Free%20postage_cbx")
    public WebElement freePostage;

    //https://www.ebay.com.au/ > Deals & Sales > Gift Cards > All filters > Show Only
    @FindBy(xpath = "//span[text()='Show only']")
    public WebElement showOnly;

    //https://www.ebay.com.au/ > Deals & Sales > Gift Cards > All filters > Show Only > SaleItems
    @FindBy(xpath = "//input[@id='c3-subPanel-LH_SaleItems_Sale%20items_cbx']")
    public WebElement saleItems;

    //https://www.ebay.com.au/ > Deals & Sales > Gift Cards > All filters > Show Only > Deals & Savings
    @FindBy(xpath = "//input[@id='c3-subPanel-LH_Savings_Deals%20%26%20savings_cbx']")
    public WebElement dealsAndSavings;

    //https://www.ebay.com.au/ > Deals & Sales > Gift Cards > All filters > Show Only > Accept Best Offer
    @FindBy(xpath = "//input[@id='c3-subPanel-LH_BO_Accepts%20Best%20Offer_cbx']")
    public WebElement acceptBestOffer;

    //https://www.ebay.com.au/ > Deals & Sales > Gift Cards > All filters > Seller
    @FindBy(xpath = "//span[text()='Seller']")
    public WebElement seller;

    //https://www.ebay.com.au/ > Deals & Sales > Gift Cards > All filters > Only show items from
    @FindBy(xpath = "//input[@id='c3-subPanel-_x-seller[0]_toggler']")
    public WebElement showItemsCheckbox;

    //https://www.ebay.com.au/ > Deals & Sales > Gift Cards > All filters > Only show items from > Sellers with eBay Stores
    @FindBy(xpath = "(//input[@class='radio__control'])[2]")
    public WebElement sellersWithEbay;

    //https://www.ebay.com.au/ > Deals & Sales > Gift Cards > All filters > Apply
    @FindBy(xpath = "//button[@class='x-overlay-footer__apply-btn btn btn--primary']")
    public WebElement apply;

    //https://www.ebay.com.au/ > Deals & Sales > Gift Cards > All filters > Apply > result text
    @FindBy(xpath = "//*[text()='0 results found. Try ']")
    public WebElement notFoundText;

    //https://www.ebay.com.au/ > Deals & Sales > Gift Cards > All filters >
    @FindBy(css =".x-tray-pill")
    public List<WebElement> conditions;

    //https://www.ebay.com.au/ > Deals & Sales > Gift Cards > All filters > Apply > products
    @FindBy(xpath ="//div[@class='s-item__image-wrapper']")
    public List<WebElement >  productPhotos;

    //https://www.ebay.com.au/ > Deals & Sales > Gift Cards > All filters > Apply > products
    @FindBy(xpath = "//div[@class='s-item__info clearfix']")
    public List<WebElement> productInformations;
}
