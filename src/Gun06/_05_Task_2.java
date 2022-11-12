package Gun06;

import Utils.ParametreliWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

public class _05_Task_2 extends ParametreliWebDriver {

    @Test(dataProvider = "getdata")
    void SearchFunction(String search) {

        WebElement searchinput = driver.findElement(By.name("search"));
        searchinput.clear();
        searchinput.sendKeys(search);

        WebElement srchbtn = driver.findElement(By.cssSelector("[class='btn btn-default btn-lg']"));
        srchbtn.click();

        List<WebElement> captions = driver.findElements(By.cssSelector("[class='product-thumb'] [class='caption'] a"));

        wait.until(ExpectedConditions.visibilityOfAllElements(captions));

        for (WebElement e : captions) {
            Assert.assertTrue(e.getText().toLowerCase().contains(search));
        }

    }

    @DataProvider
    public Object[] getdata()
    {
        Object[] data = {"mac","samsung","iphone"};

        return data;
    }
}
