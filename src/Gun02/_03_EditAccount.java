package Gun02;

import Utils.GeneralWebDriver;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.time.Duration;

public class _03_EditAccount extends GeneralWebDriver {
   /*
      1- Siteyi açınız.
      2- Edit Account a tıklatınız.
      3- Yeni isim ve soyisim göndererek Continue yapınız.
      4- İşlem sonucunu kontrol ediniz.
      5- Bu işlemi 2 kez çalıştırarak eski haline getiriniz.
     */

    @Test
    void editaccount() {

        editle("Hasan","Hüseyin");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        editle("Ali","Veli");

    }

    void editle(String names, String lastnames)
    {
        WebElement editaccount = driver.findElement(By.xpath("//a[text()='Edit Account']"));
        editaccount.click();

        WebElement editname = driver.findElement(By.name("firstname"));
        editname.clear();
        editname.sendKeys(names);

        WebElement editlastname = driver.findElement(By.name("lastname"));
        editlastname.clear();
        editlastname.sendKeys(lastnames);


        WebElement continuebtn = driver.findElement(By.cssSelector("[value=\"Continue\"]"));
        continuebtn.click();

        Tools.successMessageValditaion();
    }
}
