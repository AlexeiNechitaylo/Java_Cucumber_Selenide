package steps;

import io.cucumber.java.Before;
import static com.codeborne.selenide.Selenide.open;

public class PrePostSteps { //действия перед/после степов

    @Before
    public void openURL(){
        open("https://grinfer.com/"); //открытие главной страницы
    }
}
