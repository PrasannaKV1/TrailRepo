import Base.TestBase;
import Base.URLLUNCH;
import Pages.QuestionPaper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Base.TestBase.driver;

public class TopAssess extends TestBase {

    public static void main(String[] args) throws InterruptedException {
        TestBase base = new TestBase();
        base.intialization();
        URLLUNCH URL=new URLLUNCH();
        URL.urllunch();
        QuestionPaper qppage= new QuestionPaper(driver) ;

        Thread.sleep(8000);
        //Actions referencevariable=new Actions(driver);
        qppage.getCreateQp().click();
        Thread.sleep(3000);
        qppage.getAutoGeneration().click();
        Thread.sleep(3000);
        qppage.getCreateAssessment().click();
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //WebElement createQpButton = wait.until(ExpectedConditions.elementToBeClickable(qppage.getCreateQp()));
        //createQpButton.click();
        Thread.sleep(3000);
        //qppage.getNameofexamination().click();
        qppage.getNameofexamination().sendKeys("rekha_karthik");
        Thread.sleep(3000);
//        Actions a = new Actions(driver);
//        a.moveToElement(qppage.getNameofexamination()).click().perform();
        //qppage.getNameofexamination().sendKeys("rekha_karthik");
        driver.quit();
    }
}