package Gun05;

import Utils.GeneralWebDriver;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class _02_ContactUs extends GeneralWebDriver {

    @Test
    @Parameters("mesaj")
    void contactus(String qwerty) {

        WebElement contact = driver.findElement(By.linkText("Contact Us"));
        contact.click();

        WebElement enq = driver.findElement(By.id("input-enquiry"));
        enq.sendKeys(qwerty);

        WebElement submtbtn = driver.findElement(By.cssSelector("[value='Submit']"));
        submtbtn.click();

        WebElement content = driver.findElement(By.cssSelector("[id='content']>h1"));

        System.out.println(content.getText());
        Assert.assertEquals("Contact Us", content.getText(), "Karşılaştırma Sonucu :");


    }
}
