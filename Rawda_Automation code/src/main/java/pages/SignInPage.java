package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SignInPage {
    WebDriver driver;
    Actions actions;
    public SignInPage(WebDriver driver) {
        this.driver = driver;
        this.actions = new Actions(driver);
    }
    //Test case 8
    @Test(priority = 15)
    public void WishlistUser() {
//        WebElement SignIn = driver.findElement(By.xpath("(//a[@href='https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/'])[1]"));
//        SignIn.click();
//        WebElement Email = driver.findElement(By.xpath("//input[@name = 'login[username]']"));
//        Email.sendKeys("rawda.walid27@gmail.com");
//        WebElement Password = driver.findElement(By.xpath("//input[@name = 'login[password]']"));
//        Password.sendKeys("8fHVY#4H7fuNQJB");
//        WebElement SignInBtn = driver.findElement(By.xpath("//button[@type ='submit' and @class ='action login primary']"));
//        SignInBtn.click();
        WebElement ProductPicture = driver.findElement(By.xpath("//img[@src='https://magento.softwaretestingboard.com/pub/media/catalog/product/cache/7c4c1ed835fbbf2269f24539582c6d44/w/t/wt09-white_main_1.jpg']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(ProductPicture).perform();
        WebElement WishList = driver.findElement(By.xpath("(//a[@title='Add to Wish List'])[2]"));
        WishList.click();
    }
    //Locators

    private By CustomerLoginPageTitle = By.xpath("//span[contains(text(), 'Customer Login')]");
    private By CustomerEmailField = By.xpath("//input[@name = 'login[username]']");
    private By CustomerPassword = By.xpath("//input[@name = 'login[password]']");
    private By SignInBtn = By.xpath("//button[@type ='submit' and @class ='action login primary']");

    public String CheckCustomerLoginPage(){
        return driver.findElement(CustomerLoginPageTitle).getText();
    }

    public void WriteEmail(){
        driver.findElement(CustomerEmailField).sendKeys("rawda.walid27@gmail.com");
    }

    public void WritePassword(){
        driver.findElement(CustomerPassword).sendKeys("8fHVY#4H7fuNQJB");
    }

    public void ClickSignInBtn(){
         driver.findElement(SignInBtn).click();
    }
}
