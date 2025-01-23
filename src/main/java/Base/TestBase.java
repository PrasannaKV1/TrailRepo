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
        driver.get("https://phase7.nprd.topschool.co.in");
        Thread.sleep(4000);
        WebElement elk=driver.findElement(By.xpath("//span[text()='Teacher']"));
        elk.click();
        Thread.sleep(4000);
        WebElement base2 =driver.findElement(By.xpath("//input[@name='userName']"));
        base2.click();
        Thread.sleep(2000);
        base2.sendKeys("rrh");
        WebElement base3=driver.findElement(By.xpath("//input[@name='password']"));
        Thread.sleep(2000);
        base3.sendKeys("Test@123");
        driver.findElement(By.xpath("//*[text()='Log In']")).click();
        Thread.sleep(3000);
        Actions as=new Actions(driver);
        WebElement elf1=driver.findElement(By.xpath("//img[@class='logoImg']"));
        as.moveToElement(elf1);
        WebElement elf =driver.findElement(By.xpath("//div[text()='Assessment']"));
        as.moveToElement(elf).click().perform();
        driver.findElement(By.xpath("//div[text()='Question Paper']")).click();




    }

}