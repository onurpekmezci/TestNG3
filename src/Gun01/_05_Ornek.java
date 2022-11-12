package Gun01;

import Utils.GeneralWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class _05_Ornek extends GeneralWebDriver {

    /*
   Senaryo ;
     1- http://opencart.abstracta.us/index.php?route=account/login  sitesini açınız.
     2- asd@gmail.com  ve 123qweasd   bilgileri ile login olan test metodunu yazınız.
     3- Login olup olmadığınızı assert ile kontrol ediniz.
   ali@veli.com
   123456
 */

    @Test
    void logintest() {
        WebElement inputemail = driver.findElement(By.id("input-email"));
        inputemail.sendKeys("ali@veli.com");

        WebElement inputpass = driver.findElement(By.id("input-password"));
        inputpass.sendKeys("123456");

        WebElement loginbtn = driver.findElement(By.cssSelector("input[value=\"Login\"]"));
        loginbtn.click();


    }


}
