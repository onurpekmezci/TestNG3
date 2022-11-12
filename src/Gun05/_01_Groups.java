package Gun05;

import org.testng.annotations.Test;

public class _01_Groups {

    @Test(groups = "Smoketest")
    void Test1(){
        System.out.println("Test 1 Smoke test");
    }

    @Test(groups = "Regression")
    void Test3(){
        System.out.println("Test 3 Regression test");
    }
    @Test(groups = "Regression")
    void Test5(){
        System.out.println("Test 5 Regression test");
    }
    @Test(groups = "Regression")
    void Test2(){
        System.out.println("Test 2 Regression test");
    }

    @Test(groups = "Smoketest")
    void Test4(){
        System.out.println("Test 4 Smoke test");
    }

    @Test(groups = "Smoketest")
    void Test6(){
        System.out.println("Test 6 Smoke test");
    }


    @Test
    void Test7(){
        System.out.println("Test 7  test");
    }
}
