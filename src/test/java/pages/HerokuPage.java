package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HerokuPage {
    public HerokuPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[.='Add Element']")
    public WebElement addelementButton;

    @FindBy(xpath = "//*[.='Delete']")
    public WebElement deleteButton;

    @FindBy (xpath = "//button[@onclick=\"deleteElement()\"]")
    public  WebElement deleteButonu;


}



