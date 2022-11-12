package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ParametreliWebDriver {

    public WebDriver driver;  //static paralel tesstte  değer veremeyiz.
    public static WebDriverWait wait;

    @Parameters("browser")
    @BeforeClass
   public void Baslangicislemleri( String browser) {

        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);

        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true"); // slf4j ile başlayanları siler.
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();
        }
        else  if (browser.equalsIgnoreCase("firefox")){

            System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
            System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
            driver = new FirefoxDriver();

        }

       // driver.manage().window().maximize(); // ekranı maximize eder.
        driver.manage().deleteAllCookies(); // sitenin cooki üzerinden engellemesini kaldırmak için kullanıyoruz.
        Duration dr = Duration.ofSeconds(30);
        driver.manage().timeouts().pageLoadTimeout(dr); // ilk başta anasayfa yüklenirken süre tanıyor
        driver.manage().timeouts().implicitlyWait(dr); // bütün web elementler için geçerlidir. yüklenmesi iiçin süre tanır

        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30)); // ilk başta anasayfa yüklenirken süre tanıyor
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // bütün web elementler için geçerlidir. yüklenmesi iiçin süre tanır

        driver.get("http://opencart.abstracta.us/index.php?route=account/login");

        logintest();
    }

    void logintest() {
        WebElement inputemail = driver.findElement(By.id("input-email"));
        inputemail.sendKeys("ali@veli.com");

        WebElement inputpass = driver.findElement(By.id("input-password"));
        inputpass.sendKeys("123456");

        WebElement loginbtn = driver.findElement(By.cssSelector("input[value=\"Login\"]"));
        loginbtn.click();

    }
    @AfterClass
    public void Bitisislemleri()
    {

        System.out.println("Driver Stop");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();

    }
}
