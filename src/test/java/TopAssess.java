import Base.TestBase;
import Base.URLLUNCH;
import Pages.QuestionPaper;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

import static Base.TestBase.driver;

public class TopAssess extends TestBase {

    public static void main(String[] args) throws InterruptedException {
        TestBase base = new TestBase();
        base.intialization();
        URLLUNCH URL = new URLLUNCH();
        URL.urllunch();

      //  WebDriver driver = base.getDriver(); // Assuming TestBase has a method to get the driver
        QuestionPaper qppage = new QuestionPaper(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        Actions actions = new Actions(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Wait for 'Create Question Paper' button and click
        WebElement wb= wait.until(ExpectedConditions.elementToBeClickable(qppage.getCreateQp()));
        wb.click();

        // Click Auto Generation
        wait.until(ExpectedConditions.elementToBeClickable(qppage.getAutoGeneration())).click();

        // Click Create Assessment
        wait.until(ExpectedConditions.elementToBeClickable(qppage.getCreateAssessment())).click();

        // Enter random examination name
        String randomString = UUID.randomUUID().toString().replace("-", "");
        wait.until(ExpectedConditions.visibilityOf(qppage.getNameofexamination())).sendKeys(randomString);

        // Select Grade
        wait.until(ExpectedConditions.elementToBeClickable(qppage.getGradeOption())).click();
        wait.until(ExpectedConditions.elementToBeClickable(qppage.getGrade7())).click();

        // Select Section
        wait.until(ExpectedConditions.elementToBeClickable(qppage.getSections())).click();
        wait.until(ExpectedConditions.elementToBeClickable(qppage.getSectionD())).click();

        // Click outside using Actions
        actions.moveToElement(qppage.getGoBack()).click().perform();

        // Select Subject
        wait.until(ExpectedConditions.elementToBeClickable(qppage.getSubjectsOptions())).click();
        wait.until(ExpectedConditions.elementToBeClickable(qppage.getHindi())).click();
        actions.moveToElement(qppage.getGoBack()).click().perform();

        // Click Next
        wait.until(ExpectedConditions.elementToBeClickable(qppage.getNext())).click();

        // Select Template
        wait.until(ExpectedConditions.elementToBeClickable(qppage.getTemplateselection())).click();
        wait.until(ExpectedConditions.elementToBeClickable(qppage.getGoBack())).click();
        wait.until(ExpectedConditions.elementToBeClickable(qppage.getContinueedtiting())).click();

        // Scroll and Click Next
        js.executeScript("window.scrollBy(0,1000);");
        wait.until(ExpectedConditions.elementToBeClickable(qppage.getNext())).click();

        // Click Generate Question Paper
        wait.until(ExpectedConditions.elementToBeClickable(qppage.getGenerateQP())).click();

        // Wait for Save button and Click
        wait.until(ExpectedConditions.elementToBeClickable(qppage.getSave())).click();

        // Quit driver
        driver.quit();
    }
}