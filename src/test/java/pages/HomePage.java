package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {
    public HomePage(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "(//a[text()='Deals & Sales'])[1]")
    public WebElement dealsAndSales;

    @FindBy(xpath = "//a[text()='Gift Cards']")
    public WebElement giftCards;




}
