package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {

    /*
        Pages class'lari surekli kullandigimiz locate'leri
        tekrar tekrar locate etmek zorunda kalmaktan kurtulmak icin kullanilir

        Her pages class'i Driver class'inda olusturulan driver'i kullanir

        @FindBy notasyonunun Driver class'indaki webDriver'i kullanabilmesi icin
        bu class'a tanitmamiz gerekiyor

        bunun icin her pages sayfasi ilk olusturuldugunda
        basina parametresiz bir constructor olusturup
        icerisinde driver'i bu class'a tanitiyoruz.

     */

    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="twotabsearchtextbox")
    public WebElement aramaKutusu;

    @FindBy(xpath = "//h1[@class='a-size-base s-desktop-toolbar a-text-normal']")
    public WebElement aramaSonucElementi;

    @FindBy(xpath = "(//img[@class='s-image'])[2]")
    public WebElement ikinciUrun;

    @FindBy(xpath = "//span[@id='productTitle']")
    public WebElement ilkUrunIsimElementi;

    public WebElement istenenUrunElementi(int index){

        String dinamikXpath = "(//span[@class='a-size-base-plus a-color-base a-text-normal'])["+index+"]";
        WebElement istenenUrun=Driver.getDriver().findElement(By.xpath(dinamikXpath));

        return istenenUrun;
    }

}
/*
echo "# com.team108_Cucumber" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M master
git remote add origin https://github.com/saidozkan2020/com.team108_Cucumber.git
git push -u origin master

Said_Ozkan
 */