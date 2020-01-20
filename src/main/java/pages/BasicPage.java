package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class BasicPage {

    public void clickButton(String text){
        //$(By.xpath("//div[text()='Sign in']")).click();
        $(By.xpath("//div[text()='" + text + "']")).click(); //передаем имя как переменную
    }

    public void clickButtonSpan(String text){
        ////span[text()='Sign in'] /.. позволяет вернуться вверх на элемент
        $(By.xpath("//span[text()='" + text + "']/..")).click();
    }

    public void contentIsVisible(String text){
        $(By.xpath("//*[text()='" + text + "']")).shouldBe(Condition.visible);
    }
}

