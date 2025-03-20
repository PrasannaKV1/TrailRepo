package Base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Scanner;

//import static TestBase.driver;


public class TestBase {

    public static WebDriver driver;
    Scanner sc = new Scanner(System.in);
    String browsername =sc.nextLine();
    public WebDriver intialization() throws InterruptedException {
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


        return driver;
    }


    public WebDriver getDriver() {
        return driver;
    }

    public void waitForPageLoad(WebDriver driver) {
        new WebDriverWait(driver, Duration.ofSeconds(30)).until(
                webDriver -> ((JavascriptExecutor) webDriver)
                        .executeScript("return document.readyState").equals("complete")
        );
    }
}
