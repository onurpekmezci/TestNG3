package Gun02;

import Utils.GeneralWebDriver;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class _01_ValidateMenu extends GeneralWebDriver {
    By menufinder = By.cssSelector("ul[class='nav navbar-nav']>li");
    @Test
    void menu() {
      List<String> menuExpected = new ArrayList<>();
      menuExpected.add("Desktops");
      menuExpected.add("Laptops & Notebooks");
      menuExpected.add("Components");
      menuExpected.add("Tablets");
      menuExpected.add("Software");
      menuExpected.add("Phones & PDAs");
      menuExpected.add("Cameras");
      menuExpected.add("MP3 Players");

      List<WebElement> menuactual =driver.findElements(menufinder);

      Tools.compareTolist(menuExpected,menuactual);
    }


}

