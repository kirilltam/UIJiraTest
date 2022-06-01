package StepsDefinition;


import BaseSteps.LoginSteps;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.Тогда;
import org.junit.jupiter.api.Assertions;

import java.time.Duration;
import java.util.List;

import static BaseElements.LoginElements.asserElement;
import static BaseElements.LoginElements.loginBtn;
import static BaseElements.MainPageElements.*;
import static BaseElements.ProjectPageElements.statusVal;
import static BaseElements.ProjectPageElements.versionCheck;
import static BaseElements.TaskElements.*;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.switchTo;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class StepDefinition {



    @Дано("^авторизируюемся на странице Jira$")



    public static void page(List<String> lp) {

          //  AllureResponse.setUp();
           Selenide.open("https://edujira.ifellow.ru/secure/Dashboard.jspa");
            String username = lp.get(0);
            String password = lp.get(1);
            LoginSteps.username.setValue(username);
            LoginSteps.password.setValue(password);
            loginBtn.click();
            String elemVal = asserElement.shouldBe(Condition.visible, Duration.ofSeconds(60)).getText();
            Assertions.assertEquals(elemVal, asserElement.getText(), "error");

    }



    @Тогда("^выбираем задачу")

    public static void ttask(){

        projectElem.shouldBe(visible, Duration.ofSeconds(60)).click();
        testElem.shouldBe(visible,Duration.ofSeconds(60)).click();
        taskToDo.shouldBe(visible,Duration.ofSeconds(60)).click();


    }
    @Тогда("^проверяем количество задач")


    public static void taskN(){

        String numberTasks = numberOfTask.getText().substring(5);
        System.out.println("Текущее количество задач: " + numberTasks);
        searchInput.setValue("TestSelenium").click();
        taskTestSelenium.pressEnter();
        String testNameAssert = seleniumAssert.shouldBe(visible, Duration.ofSeconds(60)).getText();
        assertEquals("TestSelenium", testNameAssert,"not equals");


    }
    @Тогда("^проверяем статус и версию задачи")


    public static void check(){

        String statusChek = statusVal.getText();
        assertEquals("В РАБОТЕ", statusChek, "not equals");
        String versChek = versionCheck.getText();
        assertEquals("Version 2.0", versChek, "not equals");


    }
    @Тогда("^создаем и описываем багу")


    public static void bug(){

        createBtn.shouldBe(Condition.visible).pressEnter();
        taskType.shouldBe(Condition.visible).click();
        taskType.sendKeys("Ошибка");
        taskType.pressEnter();


        taskName.setValue("NewBug25");

        switchTo().frame("mce_0_ifr");
        description.sendKeys("bad bug");
        switchTo().defaultContent();





        priorityVer.shouldBe(Condition.visible).click();
        priorityVer.sendKeys("Low");
        priorityVer.pressEnter();


//        switchTo().frame("mce_6_ifr");
//        descriptionField.sendKeys("А Я вам сейчас покажу, откуда готовилось нападение!");
//        switchTo().defaultContent();


        assignMe.click();


        createTaskBtn.shouldBe(Condition.visible).click();




    }
    @Тогда("^переводим в статус выполнено")

    public static void statusDone(){

        closePopUpBtn.shouldBe(Condition.visible).click();
        searchTask.sendKeys("NewBug25");
        searchTask.shouldBe(Condition.visible).click();
        foundTask.shouldBe(Condition.visible).click();
        processBtn.shouldBe(Condition.visible).click();
        doneBtn.shouldBe().click();

    }
    @Тогда("^проверяем статус")

    public static void chekStatus(){

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String statuss = status.getText();
        assertEquals("ГОТОВО", statuss,"not equals");
    }







}
