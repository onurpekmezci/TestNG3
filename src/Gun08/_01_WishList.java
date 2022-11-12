package Gun08;

import Gun07._03_PlaceOrderElements;
import Utils.GeneralWebDriver;
import Utils.Tools;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.List;

public class _01_WishList extends GeneralWebDriver {


    @Parameters("aranacakkelime")
    @Test
    void wishlist(String kelime) {
        _03_PlaceOrderElements allelements = new _03_PlaceOrderElements(driver);

        SoftAssert _softassert = new SoftAssert();
        allelements.searchbox.sendKeys(kelime);
        allelements.searchbtn.click();

        _02_Whislist_Elements elements = new _02_Whislist_Elements(driver);




//
//        List<String> namelist = new ArrayList<>();
//        namelist.add("iPod Classic");
//        namelist.add("iPod Nano");
//        namelist.add("iPod Shuffle");
//        namelist.add("iPod Touch");


//        for (int i = 0; i < namelist.size(); i++) {
//
//            wait.until(ExpectedConditions.elementToBeClickable(elements.wishbtn.get(i))).click();
//
//            _softassert.assertEquals(elements.titles.get(i).getText(), namelist.get(i));
//
//        }

        int rndm = Tools.randomgenerator(elements.wishbtn.size());
        wait.until(ExpectedConditions.elementToBeClickable(elements.wishbtn.get(rndm))).click();

        String urunad= elements.titles.get(rndm).getText();

        elements.wishbtn.get(rndm).click();

        elements.wishListButton.click();

        boolean bulundu =false;
        for (WebElement item: elements.tablenames
             ) {
            if (item.getText().equals(urunad)) {
                bulundu = true;
                break;
            }

        }


        _softassert.assertTrue(bulundu);

        _softassert.assertAll();
    }
}
