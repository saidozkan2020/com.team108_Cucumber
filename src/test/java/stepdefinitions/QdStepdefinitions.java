package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import pages.QdPage;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class QdStepdefinitions {

    QdPage qdPage=new QdPage();
    @Then("ilk login linkine tiklar")
    public void ilk_login_linkine_tiklar() {
        qdPage.ilkLoginLinki.click();

    }
    @Then("username olarak {string} girer")
    public void username_olarak_girer(String username) {
        qdPage.emailKutusu.sendKeys(ConfigReader.getProperty(username));

    }
    @Then("password olarak {string} girer")
    public void password_olarak_girer(String password) {
        qdPage.passwordKutusu.sendKeys(ConfigReader.getProperty(password));

    }
    @Then("login butonuna basar")
    public void login_butonuna_basar() {
        qdPage.loginButonu.click();

    }
    @Then("giris yapilamadigini test eder")
    public void giris_yapilamadigini_test_eder() {
        Assert.assertTrue(qdPage.emailKutusu.isEnabled());

    }

    @And("username olarak examples {string} girer")
    public void usernameOlarakExamplesGirer(String username ) {
        qdPage.emailKutusu.sendKeys(username);
    }

    @And("password olarak examples {string} girer")
    public void passwordOlarakExamplesGirer(String password) {
        qdPage.passwordKutusu.sendKeys(password);
    }

    @Then("basarili olarak giris yapildigini test eder")
    public void basariliOlarakGirisYapildiginiTestEder() {
        Assert.assertTrue(qdPage.basariliGirisElementi.isDisplayed());

    }
}
