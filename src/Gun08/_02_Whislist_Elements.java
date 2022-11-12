package Gun08;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class _02_Whislist_Elements {
    public _02_Whislist_Elements(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[contains(@onclick,\"wish\")]")
    public List<WebElement> wishbtn;
    @FindBy(xpath = "//div[contains(@class,\"caption\")]//a")
    public List<WebElement> titles;

    @FindBy(id = "wishlist-total")
    public WebElement wishListButton;

    @FindBy (xpath = "//td[@class='text-left']/a")
    public List<WebElement> tablenames;

}
