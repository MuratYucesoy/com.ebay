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
    @FindBy(xpath = "//button[text()='All filters']")
    public WebElement allFilters;

    @FindBy(css = "#c3-mainPanel-price")
    public WebElement price;

    @FindBy(xpath = "//input[@aria-label='Minimum value, Australian Dollar']")
    public WebElement fromPrice;

    @FindBy(xpath = "//input[@aria-label='Maximum value, Australian Dollar']")
    public WebElement toPrice;

    @FindBy(xpath = "//span[text()='Item location']")
    public WebElement itemLocation;

    @FindBy(css = "#c3-subPanel-location_Within-0-_valueOption")
    public WebElement withInRadio;

    @FindBy(id = "c3-subPanel-location_Within-0-_select")
    public WebElement withInFirstValue;

    @FindBy(xpath = "//input[@class='x-zipcode-validator-input']")
    public WebElement withInSecondValue;

    @FindBy(xpath = "//button[@id='c3-subPanel-LH_PrefLoc_Within-0-_submit']")
    public WebElement submitValue;

    @FindBy(xpath = "//*[text()='Delivery options']")
    public WebElement deliveryOptions;

    @FindBy(id = "c3-subPanel-LH_FS_Free%20postage_cbx")
    public WebElement freePostage;

    @FindBy(xpath = "//span[text()='Show only']")
    public WebElement showOnly;

    @FindBy(xpath = "//input[@id='c3-subPanel-LH_SaleItems_Sale%20items_cbx']")
    public WebElement saleItems;

    @FindBy(xpath = "//input[@id='c3-subPanel-LH_Savings_Deals%20%26%20savings_cbx']")
    public WebElement dealsAndSavings;

    @FindBy(xpath = "//input[@id='c3-subPanel-LH_BO_Accepts%20Best%20Offer_cbx']")
    public WebElement acceptBestOffer;

    @FindBy(xpath = "//span[text()='Seller']")
    public WebElement seller;

    @FindBy(xpath = "//input[@id='c3-subPanel-_x-seller[0]_toggler']")
    public WebElement showItemsCheckbox;

    @FindBy(xpath = "(//input[@class='radio__control'])[2]")
    public WebElement sellersWithEbay;

    @FindBy(xpath = "//button[@class='x-overlay-footer__apply-btn btn btn--primary']")
    public WebElement apply;

    @FindBy(xpath = "//*[text()='0 results found. Try ']")
    public WebElement notFoundText;

    @FindBy(css =".x-tray-pill")
    public List<WebElement> conditions;

    @FindBy(xpath = "//span[@class='s-item__price']")
    public List<WebElement> prices;
}
