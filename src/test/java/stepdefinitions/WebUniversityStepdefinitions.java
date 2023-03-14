package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en_old.Ac;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.WebUniversityPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.security.Key;

public class WebUniversityStepdefinitions {

    WebUniversityPage webUniversityPage=new WebUniversityPage();
    String ilkSayfaWHD;
    String ikinciSayfaWHD;

    @Then("Login Portal gorununceye kadar asagi iner")
    public void login_portal_gorununceye_kadar_asagi_iner() {
        Actions actions=new Actions(Driver.getDriver());

        actions.sendKeys(Keys.DOWN)
                .sendKeys(Keys.DOWN).perform();
        ReusableMethods.bekle(2);

    }
    @Then("Login Portal butonuna tiklar")
    public void login_portal_butonuna_tiklar() {
        ilkSayfaWHD= Driver.getDriver().getWindowHandle();
        webUniversityPage.loginPortalLinki.click();


    }
    @Then("acilan ikinci window'a gecer")
    public void acilan_ikinci_window_a_gecer() {
        ReusableMethods.switchToWindow("WebDriver | Login Portal");
        ikinciSayfaWHD=Driver.getDriver().getWindowHandle();

    }
    @Then("Username kutusuna deger yazdirir")
    public void username_kutusuna_deger_yazdirir() {
        webUniversityPage.usernameKutusu.sendKeys("said");

    }
    @Then("Password kutusuna deger yazdirir")
    public void password_kutusuna_deger_yazdirir() {
        webUniversityPage.passwordKutusu.sendKeys(ConfigReader.getProperty("webUniPassword"));



    }
    @Then("webUniversity login butonuna basar")
    public void web_university_login_butonuna_basar() {
        webUniversityPage.loginButtonu.click();

    }
    @Then("Popup'ta cikan yazinin validation failed oldugunu test eder")
    public void popup_ta_cikan_yazinin_validation_failed_oldugunu_test_eder() {
        String expectedAlertYazi="validation failed";
        String actualAlertYazi=Driver.getDriver().switchTo().alert().getText();
        Assert.assertEquals(expectedAlertYazi,actualAlertYazi);

    }
    @Then("Ok diyerek Popup'i kapatir")
    public void ok_diyerek_popup_i_kapatir() {
    Driver.getDriver().switchTo().alert().accept();
    }
    @Then("Ilk sayfaya geri doner")
    public void ilk_sayfaya_geri_doner() {
        Driver.getDriver().switchTo().window(ilkSayfaWHD);

    }
    @Then("Ilk sayfaya donuldugunu test eder")
    public void ilk_sayfaya_donuldugunu_test_eder() {
     Assert.assertTrue(webUniversityPage.loginPortalLinki.isDisplayed());
    }
    @Then("tum sayfalari kapatir")
    public void tum_sayfalari_kapatir() {
    Driver.quitDriver();
    }


}
