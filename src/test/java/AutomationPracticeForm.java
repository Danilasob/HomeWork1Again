import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class AutomationPracticeForm {

    @BeforeAll
    static void OpenForm() {
        //Configuration.startMaximized = true;  //масштабизацаия браузера на максимальный размер
        Configuration.browserSize="2400x1540";

    }

    @Test
    void input(){
        open("https://demoqa.com/automation-practice-form");  //конкретный адрес

        //InputPart
        //$(".main-header").shouldHave(text("Text Box"));
        //$("#userName").setValue("Sobolev Danila");
        //$("#userEmail").setValue("Sobolev@mail.ru");
        //$("#currentAddress").setValue("Moscow");
        //$("#permanentAddress").setValue("Moscow");
        //$("#submit").click();

        //AssertPart
        //$("#output #name").shouldHave(text("Sobolev Danila"));
        //$("#output #email").shouldHave(text("Sobolev@mail.ru"));
        //$("#output #currentAddress").shouldHave(text("Moscow"));
        //$("#output #permanentAddress").shouldHave(text("Moscow"));

        sleep(5000);


    }
}

