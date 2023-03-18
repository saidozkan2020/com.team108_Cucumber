package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)  // bu runner clasi Cucumber.class ile calisacak.
@CucumberOptions(        // future dosyalarinin nerede oldugu ve hangi trsti calistirmak istedigimizi

        //daha önceden cekic ile hallettigimizi artik bu hallediyor.

        plugin = {"html:target/paralelReport1.html",
                "json:target/json-reports/paralelReport1.json",// raporlamaya yariyor.
                "junit:target/xml-report/paralelReport1.xml"  // target altinda olusturur. bunu runnerdan calistirmak lazim.
        },
        features = "src/test/resources/features",
        glue = "stepdefinitions",      //java codlarimizin ooldugu ile feature'i birlestiren (java kodlarini nereden bulacagini)
        tags = "@pr1",   // hangi java kodlarini calistiracagini
        dryRun = false
)

public class ParalelRunner1 {
}
