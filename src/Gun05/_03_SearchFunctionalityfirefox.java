package Gun05;

import Utils.GeneralWebDriver;
import Utils.ParametreliWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

public class _03_SearchFunctionalityfirefox extends ParametreliWebDriver {

    @Parameters("aranacakkelime")
    @Test
    void SearchFunction(String search) {

        WebElement searchinput = driver.findElement(By.name("search"));
        searchinput.sendKeys(search);

        WebElement srchbtn = driver.findElement(By.cssSelector("[class='btn btn-default btn-lg']"));
        srchbtn.click();

        List<WebElement> captions = driver.findElements(By.cssSelector("[class='product-thumb'] [class='caption'] a"));

        for (WebElement e : captions) {
            Assert.assertTrue(e.getText().toLowerCase().contains(search));
        }
    }

}
