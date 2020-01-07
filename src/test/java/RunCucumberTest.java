import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) //аннотация, отвечающая за запуск данного JUnit теста вместе с Cucumber
@CucumberOptions( //здесь настраиваем наш Cucumber тест
        plugin = "pretty", //отвечает за создание отчетов о тесте
        features = "src/test/resources/features" //путь до фич
)
public class RunCucumberTest {
}
