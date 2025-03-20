import java.time.Duration;
import java.util.UUID;

import Base.TestBase;
import Base.URLLUNCH;
import Pages.QuestionPaper;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenerateQuestionPaper {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new TestBase().intialization();  // Assuming TestBase initializes WebDriver
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));  // Explicit Wait
        FluentWait<WebDriver> fluentWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofSeconds(10))
                .ignoring(NoSuchElementException.class);

        try {
            new URLLUNCH().urllunch();  // Launch URL

            QuestionPaper qppage = new QuestionPaper(driver);
            Actions actions = new Actions(driver);
            JavascriptExecutor js = (JavascriptExecutor) driver;

            // Click 'Create Question Paper'
            qppage.clickOnQP();
            wait.until(ExpectedConditions.elementToBeClickable(qppage.getCreateQp())).click();

            // Click 'Auto Generation'
            wait.until(ExpectedConditions.elementToBeClickable(qppage.getAutoGeneration())).click();

            // Click 'Create Assessment'
            wait.until(ExpectedConditions.elementToBeClickable(qppage.getCreateAssessment())).click();

            // Enter Exam Name (with unique identifier)
            String randomString = "Exam-" + UUID.randomUUID().toString().substring(0, 8);
            System.out.println("Generated Exam Name: " + randomString);
            WebElement examNameField = wait.until(ExpectedConditions.elementToBeClickable(qppage.getNameofexamination()));
            examNameField.click();
            examNameField.sendKeys(randomString);

            // Select Grade
            wait.until(ExpectedConditions.elementToBeClickable(qppage.getGradeOption())).click();
            wait.until(ExpectedConditions.elementToBeClickable(qppage.getGrade7())).click();

            // Select Section
            wait.until(ExpectedConditions.elementToBeClickable(qppage.getSections())).click();
            wait.until(ExpectedConditions.elementToBeClickable(qppage.getSectionD())).click();

            // Go Back
            actions.moveToElement(qppage.getGoBack()).click().perform();

            // Select Subject
            wait.until(ExpectedConditions.elementToBeClickable(qppage.getSubjectsOptions())).click();
            wait.until(ExpectedConditions.elementToBeClickable(qppage.getHindi())).click();
            actions.moveToElement(qppage.getGoBack()).click().perform();

            // Click 'Next'
            wait.until(ExpectedConditions.elementToBeClickable(qppage.getNext())).click();

            // Select Template
            wait.until(ExpectedConditions.elementToBeClickable(qppage.getTemplateselection())).click();
            wait.until(ExpectedConditions.elementToBeClickable(qppage.getGoBack())).click();

            // Click 'Continue Editing'
            wait.until(ExpectedConditions.elementToBeClickable(qppage.getContinueedtiting())).click();

            // Scroll Down
            js.executeScript("window.scrollBy(0,1000)");

            // Click 'Next' after scrolling
            actions.moveToElement(wait.until(ExpectedConditions.elementToBeClickable(qppage.getNext()))).click().perform();

            // Scroll & Generate Question Paper
            js.executeScript("window.scrollBy(0,1000)");
            actions.moveToElement(wait.until(ExpectedConditions.elementToBeClickable(qppage.getGenerateQP()))).click().perform();

            // Wait for Question Paper to generate
            fluentWait.until(ExpectedConditions.elementToBeClickable(qppage.getSave())).click();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();  // Ensure driver quits even if an exception occurs
        }
    }
}
