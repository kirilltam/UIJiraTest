package BaseSteps;

import io.qameta.allure.Step;
import static BaseElements.ProjectPageElements.statusVal;
import static BaseElements.ProjectPageElements.versionCheck;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProjPageSteps {
    @Step("Проверяем статус и версию задачи")
    public static void projectPageMethod() {
        String statusChek = statusVal.getText();
        assertEquals("В РАБОТЕ", statusChek, "not equals");
        String versChek = versionCheck.getText();
        assertEquals("Version 2.0", versChek, "not equals");

    }
}
