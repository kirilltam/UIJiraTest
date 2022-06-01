package BaseElements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
public class MainPageElements {
     public static SelenideElement projectElem = $x("//a[contains(@title,'Просмотр недавних проектов или списка всех проектов')]");
     public static SelenideElement testElem = $x("((//ul[@class='aui-nav'])[1]//li//a[contains(@href,'TEST')])[2]");
     public static SelenideElement taskToDo = $x("//a[@href='/projects/TEST/issues']");
     public static SelenideElement numberOfTask = $x("//span[starts-with(text(),'1')]");
     public static SelenideElement searchInput = $x("//input[@placeholder='Поиск']");
     public static SelenideElement taskTestSelenium = $x("//a[@href = 'https://edujira.ifellow.ru/browse/TEST-374']");
     public static SelenideElement seleniumAssert = $x("//*[@id='summary-val']");
}

