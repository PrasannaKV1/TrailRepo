package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;

public class QuestionBank {


    @FindBy(xpath = "//a[text()='Question Bank']")
    WebElement QuestionBank;

    @FindBy(xpath ="//span[text()='Public']")
    WebElement publicORprivate;





}
