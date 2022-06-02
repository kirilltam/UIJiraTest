package Hooks;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;

public class AllureResponse {

    @BeforeAll
    public static void Listener() {
        String listenerName = "AllureSelenide";
        if (!(SelenideLogger.hasListener(listenerName)))
            SelenideLogger.addListener(listenerName, new AllureSelenide()
                    .screenshots(true)
                    .savePageSource(false));
    }
}


