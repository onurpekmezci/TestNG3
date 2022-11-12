package Gun06;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _01_Dataprovider {

    //@Parameters("Username")   *// çoklu veri göndermede bunu kullanamayız
    /**
     * Aşağıdaki ikili ile Dataproviderın içindeki bütün veriler tek tek test e gönderilerek
     * data sayısı kadar test çalıştırılır, dataların olduğu yere DataProvider annottion ı konur.
     * çalıştırılacak teste ise dataProvider = "getData"  bölümü eklenir.
     * Dataprovider bir testi birden fazla DATA ile çok çalıştırmak için kullanılır.
     * XML filer file gruplama, pararalel, ve farklı tesleri koordine edip birarada çalıştırmak için kullanılır.
     */

    @Test(dataProvider = "getData")
    void UsernameTesting(Object Username)
    {
        System.out.println(Username);

    }

    @DataProvider
    public  Object[] getData()
    {

        Object[] data={"Onur","Ali","Veli",49,50};
        return  data;
    }

/****************************************************/


// dataprovider ve object void aynı olmalı
@Test(dataProvider = "Users")
void UsernameTesting2(Object Username)
{
    System.out.println(Username);

}

    @DataProvider
    public  Object[] Users()
    {

        Object[] data={"Onur","Ali","Veli",49,50};
        return  data;
    }

}
