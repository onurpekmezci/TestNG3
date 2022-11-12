package Gun01;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Locale;

public class _03_Assertions {

    //Actual : oluşan
    //Expected: Beklenen

    // yeşil tik test başarılı
    // sarı çarpı testte hata var
    // Beyaz : test çalıştırılamadı (skip)
    @Test
    void  EqualOrnek()
    {
        String s1 = "Merhaba";
        String s2 = "İyi akşamalar";

                         /// oluşan -- beklenen -- hata başlığı
        Assert.assertEquals(s1,s2,"Yapılan işlemin sonucu");

    }

    @Test
    void  NotEqualOrnek()
    {
        String s1 = "Merhaba";
        String s2 = "İyi akşamalar";

        /// oluşan -- beklenen -- hata başlığı
        Assert.assertNotEquals(s1,s2,"Yapılan işlemin sonucu");

    }

    @Test
    void  TrueOrnek()
    {
        int s1 = 1;
        int s2 = 1;

        /// oluşan -- beklenen -- hata başlığı
        Assert.assertTrue(s1==s2, "Karşılaştırma sonucu");

    }

    @Test
    void  NullOrnek()
    {
       String s1=null;

        /// oluşan -- beklenen -- hata başlığı
        Assert.assertNull(s1,"Karşılaştırma sonucu");
    }

    @Test
    void  FailOrnek()
    {
     Assert.fail();
    }






}
