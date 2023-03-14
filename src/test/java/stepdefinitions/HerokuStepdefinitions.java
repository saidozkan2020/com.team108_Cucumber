package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HerokuPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;

public class HerokuStepdefinitions {

    HerokuPage herokuPage = new HerokuPage();
    @Then("AddElement butonuna basar")
    public void add_element_butonuna_basar() {
        herokuPage.addelementButton.click();

    }
    @Then("Delete butonu gorunur oluncaya kadar bekler")
    public void delete_butonu_gorunur_oluncaya_kadar_bekler() {
        // implicitly wait suresi yeterli oldugu icin bu adimda kod yazilmadi

    }
    @Then("Delete butonunun gorunur oldugunu test eder")
    public void delete_butonunun_gorunur_oldugunu_test_eder() {
    Assert.assertTrue(herokuPage.deleteButonu.isDisplayed());
    }
    @Then("Delete butonuna basarak butonu siler")
    public void delete_butonuna_basarak_butonu_siler() {
        herokuPage.deleteButonu.click();

    }
    @Then("Delete butonunun gorunmedigini test eder")
    public void delete_butonunun_gorunmedigini_test_eder() {
       Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        try {
            Assert.assertFalse(herokuPage.deleteButonu.isDisplayed());
        } catch (Exception e) {
          Assert.assertTrue(true);
        }

    }

    @Given("kullanici {string} anasayfaya gider")
    public void kullaniciAnasayfayaGider(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));

    }
}
