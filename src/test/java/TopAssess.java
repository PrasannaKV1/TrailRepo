import Base.TestBase;
import Pages.QuestionPaper;
import org.openqa.selenium.interactions.Actions;

public class TopAssess extends TestBase {

    public static void main(String[] args) throws InterruptedException {
        TestBase base = new TestBase();
        base.intialization();
        QuestionPaper qppage= new QuestionPaper();
        Thread.sleep(4000);
        qppage.getCreateQP().click();
        Thread.sleep(3000);

    }
}