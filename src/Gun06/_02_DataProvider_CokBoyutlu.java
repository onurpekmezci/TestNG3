package Gun06;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _02_DataProvider_CokBoyutlu {

    @Test(dataProvider = "Users")
    void UsernameTesting2(Object Username,Object Password,Object mail,Object Sayi)
    {
        System.out.println(Username+" / "+Password+" / "+mail+" / "+Sayi);

    }

    @DataProvider
    public  Object[][] Users()
    {

        Object[][] data={
                {"Onur","1111111","Onur","1111111"},
                {"Ali","222222","Onur","1111111"},
                {"Veli","333333","Onur","1111111"}};
        return  data;
    }
}
