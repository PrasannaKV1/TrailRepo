package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuestionPaper {



    WebDriver driver;

     @FindBy(xpath = "//div[text()='Question Paper']")
     WebElement QuestionPaper;

     @FindBy(xpath = "//div[text()='Assessment']")
     WebElement Assessment;

     @FindBy(xpath = "//button[text()='Create New Question Paper']")
     WebElement CreateQP;

    public WebElement getAutoGeneration() {
        return AutoGeneration;
    }

    @FindBy(xpath = "//h4[text()='Auto generation']")
     WebElement AutoGeneration;

    public WebElement getNameOfExamination() {
        return NameOfExamination;
    }

    @FindBy(xpath = "//label[text()='Name of Examination *']")
    WebElement NameOfExamination;




    public QuestionPaper(WebDriver driver) {
         this.driver=driver;
          PageFactory.initElements(driver,this);

    }

    public WebElement getCreateQp() {
        return CreateQp;
    }

    @FindBy(xpath = "//button[text()='Create New Question Paper']")
     WebElement CreateQp;

     @FindBy(xpath="//h4[text()='Auto generation']")
     WebElement Auto ;

     @FindBy(xpath = "(//button[text()='Create Assessment'])[1]")
     WebElement CreateAssessment;

     @FindBy(xpath = "//span[text()='Name of Examination *']")
     WebElement  Nameofexamination;

     @FindBy(xpath = "(//div[@role='button'])[1]")
     WebElement Grade;

     @FindBy(xpath = "//label[text()='Grade']")
     WebElement Grade1;

     @FindBy(xpath = "//label[text()='Section(s)']")
     WebElement Section1;

     @FindBy(xpath = "//label[text()='Subject(s)']")
     WebElement Subjects1;

     @FindBy(xpath = "(//div[@role='button'])[2]")
     WebElement Section;

     @FindBy(xpath = "//button[text()='Next']")
     WebElement NextButtonFirstStep;

    // @FindBy(xpath="//button[text()='Create New Question Paper']")
    // WebElement CreateQuestionPaper;
     @FindBy(xpath = "//img[@class='logoImg']")
     WebElement SchoolLogo;
     public void setQuestionPaper(WebElement questionPaper) {
          QuestionPaper = questionPaper;
     }

     public WebElement getAuto() {
          return Auto;
     }

     public WebElement getCreateAssessment() {
          return CreateAssessment;
     }

     public WebElement getCreateQP() {
          return CreateQP;
     }

     public WebElement getGrade() {
          return Grade;
     }

     public WebElement getNameofexamination() {
          return Nameofexamination;
     }

    public WebElement getGrade1() {
        return Grade1;
    }

    public WebElement getSection1() {
        return Section1;
    }

     public WebElement getQuestionPaper() {
          return QuestionPaper;
     }

     public WebElement getSchoolLogo() {
          return SchoolLogo;
     }

     public WebElement getAssessment() {
          return Assessment;
     }


}

