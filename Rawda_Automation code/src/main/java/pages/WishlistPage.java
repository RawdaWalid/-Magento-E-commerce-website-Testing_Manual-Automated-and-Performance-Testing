package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WishlistPage {
    WebDriver driver;

    public WishlistPage(WebDriver driver) {
        this.driver = driver;
    }

    //span[contains(text(), 'My Wish List')]
    //Locators
    private By WishlistPageTitle = By.xpath("//span[contains(text(), 'My Wish List')]");

    //Actions

    public String GetWishlistPageTitle(){

        return driver.findElement(WishlistPageTitle).getText();
    }
}