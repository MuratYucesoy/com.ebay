package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {

    protected static WebDriver driver;

    public static WebDriver getDriver() {
        if(driver == null) {
            switch (ConfigReader.getProperty("browser")) {
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                case "safari":
                    WebDriverManager.safaridriver().setup();
                    driver = new SafariDriver();
                default:
                    WebDriverManager.chromedriver().setup();
                    ChromeOptions ops = new ChromeOptions();
                    ops.addArguments("--remote-allow-origins=*");
                    driver = new ChromeDriver(ops);
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
        return driver;
    }

    // Without Browser
    public static WebDriver getDriverNB() {
        if(driver == null) {
            ChromeOptions opt = new ChromeOptions();
            opt.setHeadless(true);

            WebDriverManager.chromedriver().setup();

            driver = new ChromeDriver(opt);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
        return driver;
    }

    public static void closeDriver() {
        if(driver != null) {
            driver.close();
            driver = null;
        }
    }

    public static void quitDriver() {
        if(driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
