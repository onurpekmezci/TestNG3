package Gun04;

import org.testng.annotations.*;

public class _01_Intro {

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
    @BeforeSuite
    void asuit()
    {

        System.out.println("Before Suit");
    }

    @BeforeTest
    void ctest()
    {

        System.out.println("Before b Test");
    }
    @BeforeGroups
    void bgroup()
    {

        System.out.println("Before Group");
    }
    @BeforeClass
    void bclass()
    {

        System.out.println("Before Class");
    }
    @BeforeMethod
    void bmethod()
    {

        System.out.println("Before Method");
    }

    @Test
    void TestIntro1()
    {
        System.out.println("Test intro1");

    }
    @Test
    void TestIntro2()
    {
        System.out.println("Test intro2");

    }


    @AfterMethod
    void amethod()
    {

        System.out.println("after method");
    }

    @AfterClass
    void aclass()
    {

        System.out.println("After class");
    }
    @AfterGroups
    void agroup()
    {

        System.out.println("After group");
    }

    @AfterTest
    void atest ()
    {
        System.out.println("After Test");
    }

    @AfterSuite
    void asuite()
    {

        System.out.println("After suite");
    }


















}
