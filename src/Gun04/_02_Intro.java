package Gun04;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class _02_Intro {

    @Test
    void Test1()
    {
        System.out.println("Test1");

    }
    @Test
    void Test2()
    {
        System.out.println("Test2");

    }

// aynı annotation olursa class ismi alfabetik sırasına göre çalışır
    @BeforeTest
    void btest ()
    {
        System.out.println("before a test");

    }

}
