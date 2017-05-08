package ru.aplana.autotests.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertEquals;

/**
 * Created by Maria on 29.04.2017.
 */
public class ServicePage extends PageObject {

    @FindBy(xpath = "//*[@class='h1']")
     WebElement title;

    @FindBy(xpath = "//a[contains(text(),'Отправить заявку')]")
     WebElement sendApplicationBtn;

    public WebElement getSendApplicationBtn() {

        return sendApplicationBtn;
    }

    public WebElement getTitleButton() {
        return title;
    }
}
