package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GiftCertificatesPage {

    public GiftCertificatesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //https://www.ebay.com.au/ > Deals & Sales > Gift Cards > All filters > Apply > product > Add to cart
    @FindBy(xpath = "//span[text()='Add to cart']")
    public WebElement addToCart;

    //https://www.ebay.com.au/ > Deals & Sales > Gift Cards > All filters > Apply > product > Add to cart > Go to cart
    @FindBy(xpath = "//*[text()='Go to cart']")
    public WebElement goToCart;

    //https://www.ebay.com.au/ > Deals & Sales > Gift Cards > All filters > Apply > product > Add to cart > Go to cart> Go to checkout
    @FindBy(xpath = "//*[text()='Go to checkout']")
    public WebElement goToCheckout;


}
