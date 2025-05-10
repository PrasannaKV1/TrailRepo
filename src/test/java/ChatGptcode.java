

import Base.TestBase;
import Base.URLLUNCH;
import Pages.QuestionPaper;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;
import java.util.UUID;

import static Base.TestBase.driver;

public class ChatGptcode {

        public static void main(String[]args) throws InterruptedException, IOException {
        TestBase base = new TestBase();
        try {
            base.intialization(); // Set implicit wait here if not already in TestBase
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        URLLUNCH URL = new URLLUNCH();
        try {
            URL.urllunch();
        } catch (InterruptedException e) {


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        QuestionPaper qppage = new QuestionPaper(driver);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Actions actions = new Actions(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(qppage.getCreateQp())).click();
        wait.until(ExpectedConditions.elementToBeClickable(qppage.getAutoGeneration())).click();
        wait.until(ExpectedConditions.elementToBeClickable(qppage.getCreateAssessment())).click();

        wait.until(ExpectedConditions.elementToBeClickable(qppage.getNameofexamination())).click();
        String randomString = UUID.randomUUID().toString().replace("-", "");
        System.out.println(randomString);
        qppage.getNameofexamination().sendKeys(randomString);

        wait.until(ExpectedConditions.elementToBeClickable(qppage.getGradeOption())).click();
        wait.until(ExpectedConditions.elementToBeClickable(qppage.getGrade7())).click();

        wait.until(ExpectedConditions.elementToBeClickable(qppage.getSections())).click();
        wait.until(ExpectedConditions.elementToBeClickable(qppage.getSectionD())).click();

        actions.moveToElement(qppage.getGoBack()).click().perform();

        wait.until(ExpectedConditions.elementToBeClickable(qppage.getSubjectsOptions())).click();
        wait.until(ExpectedConditions.elementToBeClickable(qppage.getHindi())).click();

        actions.moveToElement(qppage.getGoBack()).click().perform();
        Thread.sleep(5000);
        wait.until(ExpectedConditions.elementToBeClickable(qppage.getNext())).click();
        Thread.sleep(6000);
        wait.until(ExpectedConditions.elementToBeClickable(qppage.getTemplateselection())).click();
        wait.until(ExpectedConditions.elementToBeClickable(qppage.getGoBack())).click();
        wait.until(ExpectedConditions.elementToBeClickable(qppage.getContinueedtiting())).click();

        js.executeScript("window.scrollBy(0,1000)");
        actions.moveToElement(qppage.getNext()).click().perform();

        js.executeScript("window.scrollBy(0,1000)");
        actions.moveToElement(qppage.getGenerateQP()).click().perform();

        // Wait longer for the QP to be generated
        WebDriverWait longWait = new WebDriverWait(driver, Duration.ofSeconds(20));
        longWait.until(ExpectedConditions.elementToBeClickable(qppage.getSave())).click();

        driver.quit();
    }
}

