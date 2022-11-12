package Gun06;

import Utils.GeneralWebDriver;
import Utils.ParametreliWebDriver;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

public class _06_Task_3 extends GeneralWebDriver {

    @Test
    void urun() {

        WebElement specilaslink = driver.findElement(By.linkText("Specials"));
        specilaslink.click();

        List<WebElement> newprice = driver.findElements(By.cssSelector("[class=\"product-layout product-grid col-lg-3 col-md-3 col-sm-6 col-xs-12\"] [class=\"price-new\"]"));
        List<WebElement> oldprice =  driver.findElements(By.cssSelector("[class=\"product-layout product-grid col-lg-3 col-md-3 col-sm-6 col-xs-12\"] [class=\"price-old\"]"));

        Assert.assertTrue(newprice.size()== oldprice.size());

        for (int i = 0; i < 2; i++) {

            //Assert.assertTrue(Double.parseDouble(newprice.get(i).getText().substring(1))<Double.parseDouble(oldprice.get(i).getText().substring(1)));

            Assert.assertTrue(Tools.WebElementtoDouble(newprice.get(i))<Tools.WebElementtoDouble(oldprice.get(i)));
        }
            //

    }


}
