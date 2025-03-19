package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuestionPaper {



    static WebDriver driver;

     @FindBy(xpath = "//div[text()='Question Paper']")
     WebElement QuestionPaper;

     @FindBy(xpath = "//div[text()='Assessment']")
     WebElement Assessment;

//     @FindBy(xpath = "//button[text()='Create New Question Paper']")
//     WebElement CreateQP;

    public WebElement getAutoGeneration() {
        return AutoGeneration;
    }

    @FindBy(xpath = "//h4[text()='Auto generation']")
     WebElement AutoGeneration;


    @FindBy(xpath = "//input[@type='text]")
    WebElement NameOfExamination;


    public WebElement getNameOfExamination() {
        return NameOfExamination;
    }





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

     @FindBy(xpath = "//label[text()='Name of Examination *']/following-sibling::div/input")
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
     @FindBy(xpath = "(//input[@class='PrivateSwitchBase-input css-1m9pwf3'])[2]") WebElement firstQP;
     public WebElement getFirstQP()
     {
         return firstQP;
     }

    public WebElement getGradeOption() {
        return GradeOption;
    }

    public void setGradeOption(WebElement gradeOption) {
        GradeOption = gradeOption;
    }

    @FindBy(xpath = "//label[text()='Grade']/parent::div")
     WebElement GradeOption;

    public WebElement getGrade7() {
        return Grade7;
    }

    public void setGrade7(WebElement grade7) {
        Grade7 = grade7;
    }

    @FindBy(xpath = "//li[text()='Grade 7']")
     WebElement Grade7;

    public WebElement getSections() {
        return Sections;
    }

    @FindBy(xpath ="//label[text()='Section(s)']/parent::div" )
     WebElement Sections;

    public WebElement getSectionD() {
        return SectionD;
    }

    @FindBy(xpath="//span[text()='D']")
     WebElement SectionD;

    public WebElement getSubjectsOptions() {
        return subjectsOptions;
    }

    @FindBy(xpath = "//label[text()='Subject(s)']/parent::div")
    WebElement subjectsOptions;

    public WebElement getHindi() {
        return Hindi;
    }



    @FindBy(xpath = "//span[text()='Hindi']")
     WebElement Hindi;

    public WebElement getOutside() {
        return outside;
    }

    @FindBy(xpath ="//div[@id='root']")
    WebElement outside;

    public WebElement getGoBack() {
        return GoBack;
    }

    @FindBy(xpath="//p[text()='Go back']")
    WebElement GoBack;

    public WebElement getNext() {
        return Next;
    }

    @FindBy(xpath = "//button[text()='Next']")
    WebElement Next;

    public WebElement getTemplateselection() {
        return Templateselection;
    }

    @FindBy(xpath="//input[@value=2251]")
    WebElement Templateselection;

    public WebElement getGenerateQP() {
        return GenerateQP;
    }

    @FindBy(xpath ="//button[text()='Generate Question paper']")
    WebElement GenerateQP;


    public WebElement getContinueedtiting() {
        return Continueedtiting;
    }

    @FindBy(xpath ="//button[text()='Continue Editing']")
    WebElement Continueedtiting;

    public WebElement getSave() {
        return save;
    }

    @FindBy(xpath ="//button[text()='Save']")
    WebElement save;

 ;    //     @;;FindBy(xpath="//b
     //     utton[text()='Create New Question Paper']")
     //     WebElement CreateQuestionPaper;
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

//     public WebElement getCreateQP() {
//          return CreateQP;
//     }

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

    public void clickOnQP() throws InterruptedException {
        driver.navigate().refresh();
     //   wait(2);
    //    getCreateQp().click();
        getFirstQP().click();
        Actions action = new Actions(driver);
        action.moveToElement(getCreateQp()).click().perform();
    }
}

