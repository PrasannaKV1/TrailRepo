package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Scanner;
import java.util.concurrent.ThreadPoolExecutor;


public class TestBase {

    public static WebDriver driver;
    Scanner sc = new Scanner(System.in);
    String browsername =sc.nextLine();
    public void intialization() throws InterruptedException {
        if(browsername.equalsIgnoreCase("chrome"))
        {
            driver=new ChromeDriver();
        } else if (browsername.equalsIgnoreCase("firefox")) {
            driver=new FirefoxDriver();

        } else if (browsername.equalsIgnoreCase("edge")) {

           driver=new EdgeDriver();
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        //driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);



    }

}