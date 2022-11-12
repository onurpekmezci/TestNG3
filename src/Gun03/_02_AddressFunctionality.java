package Gun03;

import Utils.GeneralWebDriver;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

/*
       Senaryo;
       1- Siteyi açınız.
       2- Adress Ekleyiniz.
       3- En son eklenen adresi edit yaparak ad ve soyadı değiştirip kaydediniz.
       4- En son eklenen adresi siliniz.
 */
public class _02_AddressFunctionality extends GeneralWebDriver {

    By adressbtn = By.linkText("Address Book");
    By newaddbtn = By.linkText("New Address");
    By firstname = By.name("firstname");
    By lastname = By.name("lastname");
    By adrress = By.name("address_1");
    By city = By.name("city");
    By postcode = By.name("postcode");
    By countries = By.name("country_id");
    By zones = By.name("zone_id");
    By zonesoption =By.cssSelector("[id='input-zone']>option");
    By defaultaddressyes = By.cssSelector("label [name='default'][value='1']");
    By defaultaddressno = By.cssSelector("label [name='default'][value='0']");
    By continuebtn = By.cssSelector("input[type='submit']");
    By editbtn = By.xpath("//table[@class=\"table table-bordered table-hover\"]//a[text()=\"Edit\"]");
    By deletebtn = By.xpath("//table[@class=\"table table-bordered table-hover\"]//a[text()=\"Delete\"]");

    @Test
    void addAddress() {

        WebElement addbtn = driver.findElement(adressbtn);
        addbtn.click();

        WebElement newbtn = driver.findElement(newaddbtn);
        newbtn.click();

        WebElement firsttxt = driver.findElement(firstname);
        firsttxt.sendKeys("onur");
        WebElement lasttxt = driver.findElement(lastname);
        lasttxt.sendKeys("pekmezci");
        WebElement adrstxt = driver.findElement(adrress);
        adrstxt.sendKeys("eryaman");
        WebElement citytxt = driver.findElement(city);
        citytxt.sendKeys("ankara");
        WebElement postcodetxt = driver.findElement(postcode);
        postcodetxt.sendKeys("1234");


        WebElement countryselect = driver.findElement(countries);
        Select countrysel = new Select(countryselect);
        // int rnd = Integer.parseInt(String.valueOf((Math.random()*9)+1).substring(0,1));
        countrysel.selectByIndex(5);


        WebElement zoneselect = driver.findElement(zones);

      // wait.until(ExpectedConditions.stalenessOf(zoneselect));  // element bulunduktan sonra güncelleniyorsa bu şekilde hata giderililir.
        wait.until(ExpectedConditions.elementToBeClickable(countryselect));

        Select zonesel = new Select(zoneselect);

        // wait.until(ExpectedConditions.numberOfElementsToBeLessThan(zonesoption, zonesel.getOptions().size()));
        // int rnd2 =Integer.parseInt(String.valueOf((Math.random()*9)+1).substring(0,1));
        zonesel.selectByIndex(3);

        WebElement defadres = driver.findElement(defaultaddressyes);
        defadres.click();

        WebElement ctn = driver.findElement(continuebtn);
        ctn.click();

    }

    @Test(dependsOnMethods = {"addAddress"})
    void editaddress() {

        WebElement addbtn = driver.findElement(adressbtn);
        addbtn.click();

        List<WebElement> editelement = driver.findElements(editbtn);

        editelement.get(editelement.size()-1).click();

        WebElement firsttxt = driver.findElement(firstname);
        firsttxt.clear();
        firsttxt.sendKeys("sütü");

        WebElement lasttxt = driver.findElement(lastname);
        lasttxt.clear();
        lasttxt.sendKeys("çilekli");

        WebElement defadres = driver.findElement(defaultaddressno);
        defadres.click();

        WebElement ctn = driver.findElement(continuebtn);
        ctn.click();

        Tools.successMessageValditaion2();
    }


    @Test(dependsOnMethods = {"addAddress"})
    void lastrecorddelete()
    {
        List<WebElement> deleteelement = driver.findElements(deletebtn);
        deleteelement.get(deleteelement.size()-1).click();


     //Tools.successMessageValditaion2();

    }


}

