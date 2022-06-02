import WebHooks.WebHooks;

import org.junit.Test;
import static BaseSteps.LoginSteps.loginMethod;
import static BaseSteps.MainPageSteps.mainPageMethod;
import static BaseSteps.ProjPageSteps.projectPageMethod;
import static BaseSteps.TaskPageSteps.taskPageMethod;

public class JiraTest extends WebHooks {

    @Test
    public void  Test1(){
        loginMethod();

    }


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

    @Test
    public void Test4(){
        loginMethod();
        mainPageMethod();
        projectPageMethod();
        taskPageMethod();


    }
}
