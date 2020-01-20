package steps;

import config.UserConfig;
import io.cucumber.java.en.Then;
import pages.BasicPage;
import pages.SignInPage;

public class SignInPageDef {
    SignInPage signInPage = new SignInPage();

    @Then("Input login")
    public void inputLogin() {
    signInPage.inputLogin(UserConfig.USER_LOGIN);
    }

    @Then("Input password")
    public void inputPasword(){
    signInPage.inputPassw(UserConfig.USER_PASSWORD);
    }
}
