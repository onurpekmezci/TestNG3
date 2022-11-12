package Gun02;

import Utils.GeneralWebDriver;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _02_Subscribes extends GeneralWebDriver {

    By liink = By.partialLinkText("Newsletter");
    By continuebtns=By.xpath("//input[@value=\"Continue\"]");
    By radioyes = By.xpath("//input[@value=\"1\"]");
    By radiono = By.xpath("//input[@value=\"0\"]");
    @Test(priority = 1)
    void subscribes()
    {

        WebElement newsletter = driver.findElement(liink);

        newsletter.click();

        WebElement radiosubs = driver.findElement(radioyes);
        radiosubs.click();

        WebElement continuebtn = driver.findElement(continuebtns);
        continuebtn.click();
        Tools.successMessageValditaion();

    }

    @Test(priority = 2)
    void nonsubscribe()
    {

        WebElement newsletter = driver.findElement(liink);

        newsletter.click();

        WebElement radiosubs = driver.findElement(radiono);
        radiosubs.click();

        WebElement continuebtn = driver.findElement(continuebtns);
        continuebtn.click();

      Tools.successMessageValditaion();
    }

    @Test(priority = 3)
    void validatesub()
    {

        WebElement newsletter = driver.findElement(liink);
        newsletter.click();

        WebElement radionos = driver.findElement(radiono);
        WebElement radioyess= driver.findElement(radioyes);

        if (radionos.isSelected()) radioyess.click();
        else radionos.click();

        WebElement continuebtn = driver.findElement(continuebtns);
        continuebtn.click();

        Tools.successMessageValditaion();
    }
}
