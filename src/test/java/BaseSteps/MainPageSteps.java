package BaseSteps;

import BaseElements.MainPageElements;
import io.qameta.allure.Step;
import org.junit.Assert;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainPageSteps extends MainPageElements {


    @Step("Выбрать задачу")
    public static void mainPageMethod(){
        projectElem.shouldBe(visible, Duration.ofSeconds(60)).click();
        testElem.shouldBe(visible).click();
        taskToDo.shouldBe(visible).click();
        String numberTasks = numberOfTask.getText().substring(5);

        Assert.assertNotNull(numberTasks);
        searchInput.setValue("TestSelenium").click();
        taskTestSelenium.pressEnter();
        String testNameAssert = seleniumAssert.shouldBe(visible).getText();
        assertEquals("TestSelenium", testNameAssert,"not equals");







    }


}
