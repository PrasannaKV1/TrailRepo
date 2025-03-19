import Base.TestBase;
import Base.URLLUNCH;
import Pages.QuestionPaper;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.io.IOException;
import java.time.Duration;
import java.util.UUID;

import static Base.TestBase.driver;

public class TopAssesWithImplictWait {

    public static void main(String[] args) throws InterruptedException, IOException {
        TestBase base = new TestBase();
        base.intialization(); // Initialize WebDriver
        WebDriver driver = base.getDriver();

        // Set Implicit Wait (applies globally)
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        Actions action = new Actions(driver);

        URLLUNCH URL = new URLLUNCH();
        URL.urllunch(); // Launch URL

        Actions actions = new Actions(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        QuestionPaper qppage = new QuestionPaper(driver);
        FluentWait<WebDriver> fluentWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10)) // Maximum wait time
                .pollingEvery(Duration.ofSeconds(1)) // Frequency of checking the condition
                .ignoring(Exception.class);


        qppage.clickOnQP();

           // Click on "Create Question Paper"
          // base.waitForPageLoad(driver);
//           fluentWait.until(ExpectedConditions.elementToBeClickable(qppage.getCreateQp()));
//           action.moveToElement(qppage.getCreateQp()).click().perform();

          // qppage.getCreateQp().click();

           // Click on "Auto Generation"
           qppage.getAutoGeneration().click();

           // Click on "Create Assessment"
           qppage.getCreateAssessment().click();

           // Enter Exam Name
           String randomString = UUID.randomUUID().toString().replace("-", "");
           System.out.println("Generated Exam Name: " + randomString);
           qppage.getNameofexamination().sendKeys(randomString);

           // Select Grade
           qppage.getGradeOption().click();
           qppage.getGrade7().click();

           // Select Section
           qppage.getSections().click();
           qppage.getSectionD().click();

           // Click "Go Back"
           actions.moveToElement(qppage.getGoBack()).click().perform();

           // Select Subject
           qppage.getSubjectsOptions().click();
           qppage.getHindi().click();

           // Click "Go Back"
           actions.moveToElement(qppage.getGoBack()).click().perform();

           // Click "Next"
           qppage.getNext().click();

           // Select Template
           qppage.getTemplateselection().click();
           qppage.getGoBack().click();
           qppage.getContinueedtiting().click();

           // Scroll Down and Click "Next"
           js.executeScript("window.scrollBy(0,1000)");
           qppage.getNext().click();

           // Scroll Down and Click "Generate Question Paper"
           js.executeScript("window.scrollBy(0,1000)");
           qppage.getGenerateQP().click();

           // Click "Save"
           qppage.getSave().click();


     } catch (StaleElementReferenceException e) {
            System.out.println("Stale Element Detected, Retrying...");
            driver.navigate().refresh(); // Refresh Page
            main(args); // Restart Execution
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        driver.quit(); // Ensure driver quits even if an error occurs
     }
    }
}
