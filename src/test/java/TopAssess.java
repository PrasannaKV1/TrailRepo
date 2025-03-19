import Base.TestBase;
import Base.URLLUNCH;
import Pages.QuestionPaper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

import static Base.TestBase.driver;

public class TopAssess extends TestBase {

    public static void main(String[] args) throws InterruptedException, IOException {
        TestBase base = new TestBase();
        base.intialization();
        URLLUNCH URL = new URLLUNCH();
        URL.urllunch();

      //  WebDriver driver = base.getDriver(); // Assuming TestBase has a method to get the driver

        Actions actions = new Actions(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        QuestionPaper qppage = new QuestionPaper(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement element = wait.until(ExpectedConditions.refreshed(
                ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Create New Question Paper']"))));
        // Click on "Auto Generation"
        Thread.sleep(2000);
        element.click();

        try {

            // Click on "Create Question Paper"
//            wait.until(ExpectedConditions.visibilityOf(qppage.getCreateQp()));

            // Click on "Create Assessment"
            wait.until(ExpectedConditions.elementToBeClickable(qppage.getCreateAssessment())).click();

            // Generate Random Exam Name
            String randomString = UUID.randomUUID().toString().replace("-", "");
            System.out.println("Generated Exam Name: " + randomString);
            WebElement examNameField = wait.until(ExpectedConditions.visibilityOf(qppage.getNameofexamination()));
            examNameField.sendKeys(randomString);

            // Select Grade
            wait.until(ExpectedConditions.elementToBeClickable(qppage.getGradeOption())).click();
            wait.until(ExpectedConditions.elementToBeClickable(qppage.getGrade7())).click();

            // Select Section
            wait.until(ExpectedConditions.elementToBeClickable(qppage.getSections())).click();
            wait.until(ExpectedConditions.elementToBeClickable(qppage.getSectionD())).click();

            // Go Back
            actions.moveToElement(wait.until(ExpectedConditions.elementToBeClickable(qppage.getGoBack()))).click().perform();

            // Select Subject
            wait.until(ExpectedConditions.elementToBeClickable(qppage.getSubjectsOptions())).click();
            wait.until(ExpectedConditions.elementToBeClickable(qppage.getHindi())).click();

            // Go Back
            actions.moveToElement(wait.until(ExpectedConditions.elementToBeClickable(qppage.getGoBack()))).click().perform();

            // Click Next
            wait.until(ExpectedConditions.elementToBeClickable(qppage.getNext())).click();

            // Select Template
            wait.until(ExpectedConditions.elementToBeClickable(qppage.getTemplateselection())).click();
            wait.until(ExpectedConditions.elementToBeClickable(qppage.getGoBack())).click();
            wait.until(ExpectedConditions.elementToBeClickable(qppage.getContinueedtiting())).click();

            // Scroll Down and Click Next
            js.executeScript("window.scrollBy(0,1000)");
            wait.until(ExpectedConditions.elementToBeClickable(qppage.getNext())).click();

            // Scroll and Click Generate Question Paper
            js.executeScript("window.scrollBy(0,1000)");
            wait.until(ExpectedConditions.elementToBeClickable(qppage.getGenerateQP())).click();

            // Click Save
            wait.until(ExpectedConditions.elementToBeClickable(qppage.getSave())).click();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit(); // Ensure driver quits even if an error occurs
        }
    }
}