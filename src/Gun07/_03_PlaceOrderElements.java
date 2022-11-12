package Gun07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _03_PlaceOrderElements {
    // Bu sayfadaki bütün elemenalrın driverlar bağlantısı gerekiyor
    // bunun için aşağıdaki consructor eklendi ve için PageFatory ile
    // driver üzerinden bu (this) sayfadaki bütün elemnalar ilşkilendirildi.
    // Böylece Sayfada dan nesne türetildiği zaman değil, kullanıldığı
    // anda elemanların bulunması aktif oluyor.Bu yöntemle bütün sayfalarda
    // aynı isimde elemanlar var ise buradaki tanımlama hepsi için geçerli hale
    // gelmiş oluyor. buna yapıya Page Object Model (POM) adı veriliyor.


    public _03_PlaceOrderElements(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "search")
    public WebElement searchbox;

    @FindBy(className = "input-group-btn")
    public WebElement searchbtn;

    @FindBy(xpath = "//div[@class=\"button-group\"]//following::button[1]")
    public WebElement addToChart;

    @FindBy(xpath = "//div[contains(@id,\"cart\")]//button")
    public WebElement totalcartbtn;

    @FindBy(css = "[href=\"https://opencart.abstracta.us:443/index.php?route=checkout/checkout\"]")
    public WebElement checkout;

    @FindBy(css = "[id=\"button-payment-address\"]")
    public WebElement billing;


    @FindBy(id = "button-shipping-address")
    public WebElement shipping;


    @FindBy(css = "[id=\"button-shipping-method\"]")
    public WebElement shippingmethod;


    @FindBy(css = "[name=\"agree\"]")
    public WebElement agreee;

    @FindBy(css = "[id=\"button-payment-method\"]")
    public WebElement paymentmethod;

    @FindBy(css = "[id=\"button-confirm\"]")
    public WebElement confirm;

    @FindBy(xpath = "//div[@id='content']//following::h1")
   public WebElement content ;


}
