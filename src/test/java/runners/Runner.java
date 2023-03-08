package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)  // bu runner clasi Cucumber.class ile calisacak.
@CucumberOptions(        // future dosyalarinin nerede oldugu ve hangi trsti calistirmak istedigimizi

        //daha önceden cekic ile hallettigimizi artik bu hallediyor.

         features = "src/test/resources/features",
        glue = "stepdefinitions",      //java codlarimizin ooldugu ile feature'i birlestiren
        tags = "@sa",
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



   */
