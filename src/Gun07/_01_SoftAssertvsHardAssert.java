package Gun07;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class _01_SoftAssertvsHardAssert {

    @Test
    void hardAssert()
    {

        String s1 = "Merhaba";
        System.out.println("HardAssert öncesi");

        Assert.assertEquals("1234",s1,"HardAssert Sonucu");

        System.out.println("HardAssert Sonrası");
    }

    @Test
    void SoftAssert()
    {
        String strhomepage="www.facebook.com/homepage";
        String strcartpage="www.facebook.com/cartpage";
        String strEditAccount="www.facebook.com/editaccount";

        SoftAssert _softassert = new SoftAssert();

        _softassert.assertEquals("www.facebook.com/homepage",strhomepage);  // true
        System.out.println("Assert 1 noktası");

        _softassert.assertEquals("www.facebook.com/profile",strcartpage);  /// false
        System.out.println("Assert 2 noktası");

        _softassert.assertEquals("www.facebook.com/settings",strEditAccount);  /// false
        System.out.println("Assert 3 noktası");

        _softassert.assertAll(); // bütün assert sonuçlarını işleme koyar

        System.out.println("Aktiflik sonrası");
    }
}
