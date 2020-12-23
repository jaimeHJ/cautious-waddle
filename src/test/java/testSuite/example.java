package testSuite;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class example {
    private static SoftAssert softAssert = new SoftAssert();

    @BeforeSuite
    public void metodo1(){
        System.out.println("inicio de Suite");
    }
    @AfterSuite
    public void metodo2(){
        System.out.println("Termino de Suite");
    }
    @Test(priority = 1,description = "Prueba 1")
    public void metodo3(){
        System.out.println("Test 1");
//        softAssert.fail("Fail SOFT");
//        System.out.println("Test 1");

    }
    @Test(priority = 2, description = "Prueba 2")
    public void metodo4(){
        System.out.println("Test 2");
        Assert.assertTrue(true);
        Assert.assertTrue(false);
        Assert.assertEquals("1","0","Numero No Son Iguales");

        Assert.fail("FAIL");

//        System.out.println("Test 2");
    }
    @AfterMethod
    public void metodo5(){
        System.out.println("Termino test");
        Assert.assertTrue(true);

    }
}
