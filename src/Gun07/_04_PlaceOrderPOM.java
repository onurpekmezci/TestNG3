package Gun07;

import Utils.GeneralWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _04_PlaceOrderPOM extends GeneralWebDriver {



    @Test
    void ProceedCheckout()
    {
        _03_PlaceOrderElements elements = new _03_PlaceOrderElements(driver);

        elements.searchbox.sendKeys("ipod");
        elements.searchbtn.click();
        elements.addToChart.click();
        elements.totalcartbtn.click();
        elements.checkout.click();

        wait.until(ExpectedConditions.elementToBeClickable(elements.billing)).click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.shipping)).click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.shippingmethod)).click();
        elements.agreee.click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.paymentmethod)).click();

        elements.confirm.click();

        wait.until(ExpectedConditions.urlContains("success"));
        Assert.assertEquals(elements.content.getText(),"Your order has been placed!","Result :");

    }


}
