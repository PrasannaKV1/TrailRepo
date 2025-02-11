import Base.TestBase;
import Base.URLLUNCH;
import Pages.QuestionPaper;
import org.openqa.selenium.interactions.Actions;
import static Base.TestBase.driver;

public class TopAssess extends TestBase {

    public static void main(String[] args) throws InterruptedException {
        TestBase base = new TestBase();
        base.intialization();
        URLLUNCH URL=new URLLUNCH();
        URL.urllunch();
        QuestionPaper qppage= new QuestionPaper();
        Thread.sleep(4000);
        //Actions referencevariable=new Actions(driver);
        qppage.getCreateQP().click();
        Thread.sleep(3000);
    }
}