package Gun01;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class _04_Enable {

    @Test
    void test1()
    {
        System.out.println("Test1 çalıştı");
    }

    @Test(enabled = false)  // testin çalışmaması için enable false değeri verilir
    void test2()
    {
        System.out.println("Test2 çalıştı");
    }

    @Test
    void test3()
    {
        System.out.println("Test3 çalıştı");
    }
    public static WebDriver driver;


    @BeforeClass
    void Baslangicislemleri()
    {
        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true"); // slf4j ile başlayanları siler.
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        //driver.manage().window().maximize(); // ekranı maximize eder.
        driver.manage().deleteAllCookies(); // sitenin cooki üzerinden engellemesini kaldırmak için kullanıyoruz.
        Duration dr = Duration.ofSeconds(30);
        driver.manage().timeouts().pageLoadTimeout(dr); // ilk başta anasayfa yüklenirken süre tanıyor
        driver.manage().timeouts().implicitlyWait(dr); // bütün web elementler için geçerlidir. yüklenmesi iiçin süre tanır

    }

    @AfterClass
    void Bitisislemleri()
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
