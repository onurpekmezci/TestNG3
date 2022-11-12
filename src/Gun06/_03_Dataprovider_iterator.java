package Gun06;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _03_Dataprovider_iterator {
    @Test(dataProvider = "Users")
    void UsernameTesting2(Object Username)
    {
        System.out.println(Username);

    }

    @DataProvider
    public Iterator<Object> Users()
    {

        List<Object> data = new ArrayList<>();
        data.add("Onur");
        data.add("Ali");
        data.add("Veli");

        return  data.iterator();
    }


    /************************************************************/

    @Test(dataProvider = "Userss")
    void UsernameTesting2(Object Username,Object Password)
    {
        System.out.println(Username+" / "+Password);

    }

    @DataProvider
    public  Iterator<Object[]> Userss()
    {

       List<Object[]> data = new ArrayList<>();

        data.add(   new Object[]{"Onur","1111111"});
        data.add(   new Object[]{"Ali","222222"});
        data.add(   new Object[]{"Veli","333333"});

        return  data.iterator();
    }


}
