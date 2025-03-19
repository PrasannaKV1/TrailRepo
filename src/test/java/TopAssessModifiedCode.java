import Base.TestBase;
import Base.URLLUNCH;
import Pages.QuestionPaper;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;
import java.util.UUID;

import static Base.TestBase.driver;

public class TopAssessModifiedCode {


    public static void main(String[] args) throws InterruptedException,  IOException {
        TestBase base = new TestBase();
        base.intialization();
        URLLUNCH URL = new URLLUNCH();
        URL.urllunch();

        Actions actions = new Actions(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        try {
            QuestionPaper qppage = new QuestionPaper(driver);

            // Click on "Create Question Paper" with retry handling
            clickWithRetry(wait, qppage.getCreateQp());

            // Click on "Auto Generation"
            clickWithRetry(wait, qppage.getAutoGeneration());

            // Click on "Create Assessment"
            clickWithRetry(wait, qppage.getCreateAssessment());

            // Generate Random Exam Name
            String randomString = UUID.randomUUID().toString().replace("-", "");
            System.out.println("Generated Exam Name: " + randomString);
            WebElement examNameField = wait.until(ExpectedConditions.visibilityOf(qppage.getNameofexamination()));
            examNameField.sendKeys(randomString);

            // Select Grade and Section
            clickWithRetry(wait, qppage.getGradeOption());
            clickWithRetry(wait, qppage.getGrade7());

            clickWithRetry(wait, qppage.getSections());
            clickWithRetry(wait, qppage.getSectionD());

            // Go Back
            clickWithRetry(wait, qppage.getGoBack());

            // Select Subject
            clickWithRetry(wait, qppage.getSubjectsOptions());
            clickWithRetry(wait, qppage.getHindi());

            // Go Back
            clickWithRetry(wait, qppage.getGoBack());

            // Click Next
            clickWithRetry(wait, qppage.getNext());

            // Select Template
            clickWithRetry(wait, qppage.getTemplateselection());
            clickWithRetry(wait, qppage.getGoBack());
            clickWithRetry(wait, qppage.getContinueedtiting());

            // Scroll Down and Click Next
            js.executeScript("window.scrollBy(0,1000)");
            clickWithRetry(wait, qppage.getNext());

            // Scroll and Click Generate Question Paper
            js.executeScript("window.scrollBy(0,1000)");
            clickWithRetry(wait, qppage.getGenerateQP());

            // Click Save
            clickWithRetry(wait, qppage.getSave());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit(); // Ensure driver quits even if an error occurs
        }
    }

    // Method to handle stale element exception and retry clicking
    private static void clickWithRetry(WebDriverWait wait, WebElement element) {
        for (int i = 0; i < 4; i++) { // Retry up to 3 times
            try {
                wait.until(ExpectedConditions.refreshed(
                                ExpectedConditions.elementToBeClickable(element)))
                        .click();
                return;
            } catch (org.openqa.selenium.StaleElementReferenceException e) {
                System.out.println("StaleElementReferenceException encountered. Retrying... Attempt " + (i + 1));
            }
        }
    }
}


