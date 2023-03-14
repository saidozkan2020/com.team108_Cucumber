package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WebUniversityPage {
    public WebUniversityPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//h1[text()='LOGIN PORTAL']")
    public WebElement loginPortalLinki;

    @FindBy(xpath = "//input[@placeholder=\"Username\"]")
    public WebElement usernameKutusu;

    @FindBy(xpath = "//input[@placeholder=\"Password\"]")
    public WebElement passwordKutusu;

    @FindBy(xpath = "//button[@onclick=\"javascript:validate()\"]")
    public WebElement loginButtonu;





}
