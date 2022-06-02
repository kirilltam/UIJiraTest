package BaseElements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class TaskElements {


    public static SelenideElement createBtn = $x("//*[@id='create_link']");
    public static SelenideElement taskType = $x("//*[@id='issuetype-single-select']/span");

    public static SelenideElement taskName = $x("//input[@class='text long-field']");
    public static SelenideElement description = $x("//body[@data-id='mce_0']");
    public static SelenideElement priorityVer = $x("//*[@id='priority-field']");
    public static SelenideElement assignMe = $x("//button[contains(text(),'Назначить меня')]");
    public static SelenideElement createTaskBtn = $x("//section[@id='create-issue-dialog']//input[@id='create-issue-submit']");

    public static SelenideElement processBtn = $x("//*[@id='opsbar-transitions_more']/span");
    public static SelenideElement  doneBtn = $x("//span[text()='Выполнено']");
    public static SelenideElement searchTask = $x("//*[@id='quickSearchInput']");

    public static SelenideElement foundTask = $x("//li[@class='quick-search-result-item']/a");
    public static SelenideElement closePopUpBtn = $x("//button[@class='aui-close-button']");
    public static SelenideElement status = $x("//*[@id='status-val']/span");













}

