import WebHooks.WebHooks;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import org.junit.Test;

import static BaseSteps.LoginSteps.loginMethod;
import static BaseSteps.MainPageSteps.mainPageMethod;
import static BaseSteps.ProjPageSteps.projectPageMethod;
import static BaseSteps.TaskPageSteps.taskPageMethod;

public class TestJira extends WebHooks {
    @Epic("Создание бага в Jira")

        @Test
    public void  Test1(){
        loginMethod();

    }

    @Epic("Создание бага в Jira")
    @Description("Выбор задачи")
    @Test
    public void Test2(){
        loginMethod();
        mainPageMethod();

    }

    @Test
    public void Test3(){
        loginMethod();
        mainPageMethod();
        projectPageMethod();

    }
    @Epic("Создание бага в Jira")
    @Test
    public void Test4(){
        loginMethod();
        mainPageMethod();
        projectPageMethod();
        taskPageMethod();


    }
}
