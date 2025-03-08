import Base.TestBase;
import Base.URLLUNCH;

import Pages.QuestionPaper;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;


import java.util.UUID;

import static Base.TestBase.driver;

public class TopAssessETOE {

    public static void main(String[] args) throws InterruptedException {
        TestBase base = new TestBase();
        base.intialization();
        URLLUNCH URL=new URLLUNCH();
        URL.urllunch();
        QuestionPaper qppage= new QuestionPaper(driver);
        Thread.sleep(8000);
        Actions referencevariable=new Actions(driver);
        Thread.sleep(3000);
        qppage.getCreateQp().click();
        Thread.sleep(2000);
        qppage.getAutoGeneration().click();
        Thread.sleep(3000);
        qppage.getCreateAssessment().click();
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // WebElement createQpButton = wait.until(ExpectedConditions.elementToBeClickable(qppage.getCreateQp()));
        // createQpButton.click();Thread.sleep(3000);
         qppage.getNameofexamination().click();
         String randomString = UUID.randomUUID().toString().replace("-", "");
        // System.out.println(randomString);
        qppage.getNameofexamination().sendKeys(randomString);
        Thread.sleep(3000);
        qppage.getGradeOption().click();
        Thread.sleep(2000);
        qppage.getGrade7().click();
        Thread.sleep(2000);
        qppage.getSections().click();
        Thread.sleep(2000);
        qppage.getSectionD().click();
        Thread.sleep(2000);
        Actions a = new Actions(driver);
        a.moveToElement(qppage.getGoBack()).click().perform();
        qppage.getSubjectsOptions().click();
        qppage.getHindi().click();
        a.moveToElement(qppage.getGoBack()).click().perform();
        qppage.getNext().click();
        //a.moveToElement(qppage.getGoBack()).click().perform();
        /// qppage.getOutside().click();
        Thread.sleep(2000);
        /////qppage.getHindi().click();
        //Thread.sleep(2000);
        //a.moveToElement(qppage.getGoBack()).click().perform();
        //Thread.sleep(2000);
        //qppage.getContinueedtiting().click();
       // qppage.getNext().click();
       // Thread.sleep(2000);
        qppage.getTemplateselection().click();//p[text()='Go back']
        qppage.getGoBack().click();
        Thread.sleep(2000);
        qppage.getContinueedtiting().click();Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(2000);
        a.moveToElement(qppage.getNext()).click().perform();
        qppage.getNext().click();
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,1000)");
        a.moveToElement(qppage.getGenerateQP()).click().perform();
        Thread.sleep(15000);
        qppage.getSave().click();
        //qppage.getNameofexamination().sendKeys("rekha_karthik");
        driver.quit();


    }
}
