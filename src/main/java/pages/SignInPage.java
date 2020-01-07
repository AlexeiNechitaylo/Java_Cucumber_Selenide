package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SignInPage {
    private SelenideElement loginInput = $(By.cssSelector("form_email"));
    private SelenideElement PasswInput = $(By.cssSelector("form_password"));

    public void inputLogin(String text){
        this.loginInput.val(text);
    }
    public void  inputPassw(String text){
        this.PasswInput.val(text);

    }
}
