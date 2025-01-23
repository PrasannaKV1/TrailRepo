import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.internal.annotations.IBeforeMethod;

public class Testng1 {
    @Test
    public void  test ()
    {
        System.out.println("Welcome to the automation  prasanna ");
    }

    @Test
    public void test1()
    {
        System.out.println("This is the main reason why i'm faling");
    }
    @BeforeMethod
    public void test2()
    {
        System.out.println("execute before the method  ");
    }
    @AfterMethod
    public void test3()
    {
        System.out .println("execute after the method ");
    }


}
