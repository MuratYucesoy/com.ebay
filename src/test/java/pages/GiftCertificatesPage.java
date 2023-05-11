package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GiftCertificatesPage {

    public GiftCertificatesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[text()='Add to cart']")
    public WebElement addToCart;

    @FindBy(xpath = "//*[text()='Go to cart']")
    public WebElement goToCart;

    @FindBy(xpath = "//*[text()='Go to checkout']")
    public WebElement goToCheckout;


}
