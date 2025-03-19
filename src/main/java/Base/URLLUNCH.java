package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import static Base.TestBase.driver;

public class URLLUNCH {


    public void urllunch() throws InterruptedException, IOException {
        driver.get("https://phase7.nprd.topschool.co.in");;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement elk=driver.findElement(By.xpath("//span[text()='Teacher']"));
        elk.click();
        Thread.sleep(4000);
        WebElement base2 =driver.findElement(By.xpath("//input[@name='userName']"));
        base2.click();
        Thread.sleep(2000);
        FileInputStream fs=new FileInputStream("C:\\TopAssess\\FinalTopAssessAutomation\\src\\main\\java\\Data\\TestData.properties");
        Properties p=new Properties();
        p.load(fs);
        String un = p.getProperty("username");
        String pw = p.getProperty("password");
        System.out.println(un);
        System.out.println(pw);
        base2.sendKeys(un);
        WebElement base3=driver.findElement(By.xpath("//input[@name='password']"));
        Thread.sleep(2000);
        base3.sendKeys(pw);
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
