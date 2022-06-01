package BaseSteps;
import BaseElements.LoginElements;
import Hooks.Configuration;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;

public class LoginSteps extends LoginElements {
    @Step("Авторизация в Jira")
    public static void loginMethod(){
        username.shouldBe(Condition.visible).setValue(Configuration.getConfigurationValue("username"));
        password.setValue(Configuration.getConfigurationValue("password"));
        loginBtn.click();
        String elemVal = asserElement.shouldBe(Condition.visible).getText();
        Assertions.assertEquals(elemVal, asserElement.getText(),"error");
    }

}
