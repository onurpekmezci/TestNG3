package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.awt.*;
import java.util.List;

public class Tools {

    public static void compareTolist(List<String> MenuexpectdList, List<WebElement> menuactuallist)
    {
        for (int i = 0; i < MenuexpectdList.size(); i++) {
            Assert.assertEquals(MenuexpectdList.get(i),menuactuallist.get(i).getText());
        }

    }

    public  static void successMessageValditaion()
    {
        WebElement valid = GeneralWebDriver.driver.findElement(By.xpath("//div[@class=\"alert alert-success alert-dismissible\"]"));
        Assert.assertTrue(valid.getText().contains("Success"));

    }
    public  static void successMessageValditaion2()
    {
        WebElement valid = GeneralWebDriver.driver.findElement(By.xpath("//div[@class=\"alert alert-success alert-dismissible\"]"));
        Assert.assertTrue(valid.getText().contains("successfully"));

    }

    public static double WebElementtoDouble(WebElement e1)
    {

        return Double.parseDouble(e1.getText().replaceAll("[^\\d]",""));
    }

    public static int randomgenerator(int max)
    {

        return (int) (Math.random()*max);

    }
}
