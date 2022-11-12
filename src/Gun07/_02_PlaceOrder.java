package Gun07;

import Utils.GeneralWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class _02_PlaceOrder extends GeneralWebDriver {

    @Test
    void ProceedCheckout()
    {

        WebElement searchinput = driver.findElement(By.name("search"));
        searchinput.sendKeys("ipod");

        WebElement srchbtn = driver.findElement(By.cssSelector("[class='btn btn-default btn-lg']"));
        srchbtn.click();

        WebElement cartbtn = driver.findElement(By.xpath("//div[@class=\"button-group\"]//following::button[1]"));
        cartbtn.click();

        WebElement totalcartbtn = driver.findElement(By.xpath("//div[contains(@id,\"cart\")]//button"));
        wait.until(ExpectedConditions.visibilityOfAllElements(totalcartbtn));
        totalcartbtn.click();

       // wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("[class=\"dropdown-menu pull-right\"]"))));
        WebElement checkout = driver.findElement(By.cssSelector("[href=\"https://opencart.abstracta.us:443/index.php?route=checkout/checkout\"]"));
        checkout.click();

        WebElement billing = driver.findElement(By.cssSelector("[id=\"button-payment-address\"]"));
        billing.click();

        WebElement shipping = driver.findElement(By.cssSelector("[id=\"button-shipping-address\"]"));
        shipping.click();

        WebElement shippingmethod = driver.findElement(By.cssSelector("[id=\"button-shipping-method\"]"));
        shippingmethod.click();

        WebElement agreee = driver.findElement(By.cssSelector("[name=\"agree\"]"));
        agreee.click();

        WebElement paymentmethod = driver.findElement(By.cssSelector("[id=\"button-payment-method\"]"));
        paymentmethod.click();

        WebElement confirm = driver.findElement(By.cssSelector("[id=\"button-confirm\"]"));
        confirm.click();


        wait.until(ExpectedConditions.titleContains("Your order has been placed!"));
       // wait.until(ExpectedConditions.urlContains("success"));
        WebElement content = driver.findElement(By.xpath("//div[@id='content']//following::h1"));

        Assert.assertEquals("Your order has been placed!",content.getText(),"Hata sonucu :");


    }
}
