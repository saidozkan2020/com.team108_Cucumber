package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)  // bu runner clasi Cucumber.class ile calisacak.
@CucumberOptions(        // future dosyalarinin nerede oldugu ve hangi trsti calistirmak istedigimizi

        //daha önceden cekic ile hallettigimizi artik bu hallediyor.

        plugin = {"html:target/cucumber-reports.html",
                "json:target/json-reports/cucumber.json",// raporlamaya yariyor.
                "junit:target/xml-report/cucumber.xml"  // target altinda olusturur. bunu runnerdan calistirmak lazim.
        },
         features = "src/test/resources/features",
        glue = "stepdefinitions",      //java codlarimizin ooldugu ile feature'i birlestiren (java kodlarini nereden bulacagini)
        tags = "@ss or @wip",   // hangi java kodlarini calistiracagini
        dryRun = false
)
public class Runner {

}
  /*
  Runner class testlerimizi tekli veya toplu olarak calistirmamizi sagar
  Runner class BOS bir class dir
  burada asil isi yapan 2 tane notasyon
  ve iclerine yazdigimiz argumentlerdir.

   @CucumberOptions icecisine yazacagimiz degerter
   bu Runner class inin calistiracagi
    - feature dosyalarinin ve
    - feature dosyalaring ait Java method'larinin nerede oldugunu
    - ve bu feature dosualari icerisinde olusturulan
      Scenario veya Feature'larin hangilerinin calistirilacagini belirier.

dryRun  :  default degeri olan "false" oldugunda
                feature dosyasinda run tusuna bastigimiz gibi calistirir
                stepdefiniton'i olusturulan adimlari calistirir
                stepdefiniton'i olmayan ilk adimda, eksik adimlari bize raporlar

                Ancak bu tur calistirmada gereksiz calistirilan adimlar olur
                bunun yerine

                "true" degerini verirseniz
                testi calistirmayi denemez
                sadece adimlari kontrol eder ve eksik adim VARSA kodlari olusturur
                EKSIK ADIM YOKSA hic bir adimi calistirmadan TEST PASSED der
                buradaki test passed "EKSIK ADIM YOK" anlamina gelmektedir

   */
