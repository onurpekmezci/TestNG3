package Gun01;

import org.testng.annotations.*;

public class _02_Annotations  {

    /*

    @BeforeClass  -- her class çalışırken önce burası çalışır.
    @BeforeMethod -- her method'dan önce çalışır

    @Test
    @Test

    @AfterClass -- her classtan sonra burası çalışır
    @AfterMethod -- her method'dan sonra çalışır  (test method)


         */


    /*
     @BeforeSuit
       @BeforeTest
         @BeforeGroup
           @BeforeClass
             @BeforeMethod
               @Test
               @Test
             @AfterMethod
           @AfterClass
        @AfterGroup
     @AfterTest
   @AfterSuit
    */

    @BeforeClass
    void beforeclass()
    {
        System.out.println("Before Class her class tan önce çalışır");
    }


    @BeforeMethod
    void beforemethod()
    {

        System.out.println("Her method tan önce çalışır");
    }


    @AfterMethod
    void aftermethod()
    {

        System.out.println("Her method'tan sonra çalışır");


    }


    @Test
    void test1()
    {
        System.out.println("Test1 çalıştı");

    }

    @Test
    void test2()
    {
        System.out.println("Test2 çalıştı");

    }



    @AfterClass
    void  afterclass()
    {
        System.out.println("Her class tan sonra çalışır");

    }

}
