package BaseSteps;

import Hooks.Configuration;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static BaseElements.TaskElements.*;
import static com.codeborne.selenide.Selenide.switchTo;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskPageSteps {

    @Step("Создание баги и перевод в статус ГОТОВО")
    public static void taskPageMethod() {

        createBtn.shouldBe(Condition.visible).pressEnter();
        taskType.shouldBe(Condition.visible).click();
        taskType.sendKeys("Ошибка");
        taskType.pressEnter();
        taskName.setValue(Configuration.getConfigurationValue("taskName"));
        switchTo().frame("mce_0_ifr");
        description.sendKeys(Configuration.getConfigurationValue("description"));
        switchTo().defaultContent();
        priorityVer.shouldBe(Condition.visible).click();
        priorityVer.sendKeys(Configuration.getConfigurationValue("priorityVer"));
        priorityVer.pressEnter();
        assignMe.click();
        createTaskBtn.shouldBe(Condition.visible).click();
        closePopUpBtn.shouldBe(Condition.visible).click();
        searchTask.sendKeys(Configuration.getConfigurationValue("searchTask"));
        searchTask.shouldBe(Condition.visible).click();
        foundTask.shouldBe(Condition.visible).click();
        processBtn.shouldBe(Condition.visible).click();
        doneBtn.shouldBe().click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String statuss = status.getText();
        assertEquals("ГОТОВО", statuss,"not equals");








    }
}

