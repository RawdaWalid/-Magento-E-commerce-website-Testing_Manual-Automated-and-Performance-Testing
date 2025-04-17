package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage {

    WebDriver driver;
    Actions actions;

    public HomePage(WebDriver driver){

        this.driver = driver;
        this.actions = new Actions(driver);
    }

    //Locators
    //CategoriesName/dropDownMenu
    private By WhatsNew = By.xpath("//a[@href='https://magento.softwaretestingboard.com/what-is-new.html']");
    private By Women = By.xpath("//*[contains(text(),'Women')]");
    private By Men = By.xpath("//span[contains(text(),'Men')]");
    private By Gear = By.xpath("//span[contains(text(),'Gear')]");
    private By Training = By.xpath("//span[contains(text(),'Training')]");
    private By Sales = By.xpath("//span[contains(text(),'Sale')]");
    private By Tops = By.xpath("//a[@href='https://magento.softwaretestingboard.com/women/tops-women.html']");
    private By Jackets = By.xpath("//a[@href='https://magento.softwaretestingboard.com/women/tops-women/jackets-women.html']");
    private By ProductBreatheEasyTank = By.xpath("//img[@src='https://magento.softwaretestingboard.com/pub/media/catalog/product/cache/7c4c1ed835fbbf2269f24539582c6d44/w/t/wt09-white_main_1.jpg']");
    private By WishlistProductBreathe = By.xpath("(//a[@title='Add to Wish List'])[2]");
    private By AddToCart = By.xpath("(//span[contains(text(),'Add to Cart')])[2]");
    private By AddToCompareList = By.xpath("(//a[@title= 'Add to Compare'])[2]");
    private By PopUpCompareList = By.xpath("//a[contains(text(), 'comparison list')]");
    private By ReviewsBreathe = By.xpath("//a[@href= 'https://magento.softwaretestingboard.com/breathe-easy-tank.html#reviews']");
    private By SizeMediumBreathe = By.xpath("(//div[@id= 'option-label-size-143-item-168' and @option-label='M'])[2]");
    private By ColorWhiteBreathe = By.xpath("//div[ @option-label='White']");
    private By CartNumber = By.xpath("//span[@class='counter-number']//parent::span[@class='counter qty']");
    private By FindBreatheTankInCart = By.xpath("//a[@href='https://magento.softwaretestingboard.com/breathe-easy-tank.html' and text()='Breathe-Easy Tank']");
    private By EditProductCart= By.xpath("//a[@title='Edit item']");
    private By EditQtyBreatheCart= By.xpath("//input[contains(@data-bind,'qty')]");
    private By EditUpdateBtn = By.xpath("//button[contains(@data-bind,'Update')]");
    private By DeleteProductBtn = By.xpath("//a[contains(@data-bind,'Remove item')]");
    private By ConfirmDeletionBtn = By.xpath("//button[@class='action-primary action-accept']");
    private By CheckOutBtnCart = By.xpath("//button[contains(@data-bind,'Proceed to Checkout')]");
    private By AfterDeletionMessage= By.xpath("//strong[contains(text(), 'You have no items in your shopping cart')]");
    private By ViewProductCart= By.xpath("//span[contains(@data-bind,'View and Edit Cart')]");

    //SignIn/Register
    private By SignIn = By.xpath("(//a[@href='https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/'])[1]");

//Actions

    public SignInPage ClickOnSignIn(){
        driver.findElement(SignIn).click();
        return new SignInPage(driver);
    }

    public WhatsNewPage ClickOnWhatsNew(){
        driver.findElement(WhatsNew).click();
        return new WhatsNewPage(driver);
    }

    public void ClickOnWomen(){
        driver.findElement(Women).click();
    }

    public void CheckDropDownWomen(){
        actions.moveToElement(driver.findElement(Women)).perform();
    }

    public void CheckSubDropDownTops(){
        actions.moveToElement(driver.findElement(Tops)).perform();
    }

    public String CheckTextJackets(){
        return driver.findElement(Jackets).getText();
    }

    public String CheckTextTops(){
        return driver.findElement(Tops).getText();
    }

    public void ClickOnMen(){
        driver.findElement(Men).click();
    }

    public void ClickOnGear(){
        driver.findElement(Gear).click();
    }

    public void ClickOnTraining(){
        driver.findElement(Training).click();
    }

    public SalesPage ClickOnSales(){
        driver.findElement(Sales).click();
        return new SalesPage(driver);
    }

    public ProductBreatheTankPage ClickOnProductBreath(){
        driver.findElement(ProductBreatheEasyTank).click();
        return new ProductBreatheTankPage(driver);
    }

    public void HoverOnProductBreath(){
        actions.moveToElement(driver.findElement(ProductBreatheEasyTank)).perform();
    }

    public WishlistPage ClickWishlistProductBreathe(){
        driver.findElement(WishlistProductBreathe).click();
        return new WishlistPage(driver);
    }

    public void ClickOnAddCart(){
        driver.findElement(AddToCart).click();

    }

    public void ClickOnAddCompareList(){
        driver.findElement(AddToCompareList).click();

    }

    public String PopUpCompareListGetText(){
      return driver.findElement(PopUpCompareList).getText();
    }

    public void ClickOnReviewsBreathe(){
        driver.findElement(ReviewsBreathe).click();
    }

    public void ClickOnSizeMediumBreathe(){
        driver.findElement(SizeMediumBreathe).click();
    }

    public void ClickOnColorWhiteBreathe(){
        driver.findElement(ColorWhiteBreathe).click();
    }

    public void ClickOnCartNumber(){
        driver.findElement(CartNumber).click();
    }

    public String FindBreatheTankInCartGetText(){
        return driver.findElement(FindBreatheTankInCart).getText();
    }

    public void ClickOnFindBreatheTankInCart(){
         driver.findElement(FindBreatheTankInCart).click();
    }

    public void ClickOnEditProductCart(){
        driver.findElement(EditProductCart).click();
    }

    public void EditQtyIsDisplayed(){
         driver.findElement(EditQtyBreatheCart).isDisplayed();
    }
    public String EditQtyBreatheCartGetAttribute(){
        return driver.findElement(EditQtyBreatheCart).getAttribute("value");
    }

    public void EditQtyDeleteNumber(){
         driver.findElement(EditQtyBreatheCart).sendKeys(Keys.CONTROL +"a");
         driver.findElement(EditQtyBreatheCart).sendKeys(Keys.BACK_SPACE);
    }

    public String EditQtyAddNumber(String Number){
        driver.findElement(EditQtyBreatheCart).sendKeys(Number);
        return Number;
    }

    public void ClickOnEditUpdateBtn(){
        driver.findElement(EditUpdateBtn).click();
    }

    public ShippingAdressPage ClickOnCheckOutBtnCart(){
        driver.findElement(CheckOutBtnCart).click();
        return new ShippingAdressPage(driver);
    }

    public void AddBreatheTankToCart() {
        actions.moveToElement(driver.findElement(ProductBreatheEasyTank)).perform();
        driver.findElement(SizeMediumBreathe).click();
        driver.findElement(ColorWhiteBreathe).click();
        driver.findElement(AddToCart).click();
        driver.findElement(CartNumber).click();
    }
    public void DeleteBreatheTankFromCart(){
        driver.findElement(DeleteProductBtn).click();
        driver.findElement(ConfirmDeletionBtn).click();
    }

    public String AfterDeletionMessageGetText(){
        return driver.findElement(AfterDeletionMessage).getText();
    }

    public ShoppingCartPage ClickOnViewProductCart(){
        driver.findElement(ViewProductCart).click();
        return new ShoppingCartPage(driver);
    }
}

