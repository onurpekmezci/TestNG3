package Gun01;

import org.testng.annotations.Test;

public class _01_Giris {
  // varsayılan sıralama alfabetiktir.

    @Test (priority = 1)   // annotation tanımlaama priority ile sıralama verilir
    void WebSitesiniAc()
    {
        System.out.println("Web sitesi açıldı");

    }

    @Test(priority = 2)
    void logintestisleminiyap()
    {
        System.out.println("Login test işlemleri yapıldı");

    }

    @Test(priority = 3)
    void driverikapat()
    {
        System.out.println("Driver kapatıldı ve çıkıldı.");

    }

}
