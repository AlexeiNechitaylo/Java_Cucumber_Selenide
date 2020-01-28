package steps;

import io.cucumber.java.Before;
import pages.BasicPage;

import static com.codeborne.selenide.Selenide.open;

public class PrePostSteps { //действия перед/после степов
    BasicPage basicPage = new BasicPage();

    @Before
    public void openURL(){
        open("https://grinfer.com/"); //открытие главной страницы
        closeCookiesPopup();
    }
    public void closeCookiesPopup(){
        if (basicPage.checkTextExist("This website uses cookies")){
            basicPage.clickButtonSpan("I agree");
        }
    }
}
