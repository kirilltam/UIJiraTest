package BaseElements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ProjectPageElements  {
    public static SelenideElement statusVal = $x("//*[@id='status-val']");
    public static SelenideElement versionCheck = $x("//*[@id='versions-val']");

}

