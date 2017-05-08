package ru.aplana.autotests.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Maria on 29.04.2017.
 */
public class CheckOutPage extends PageObject {

    @FindBy(xpath = "//h4[@class='modal-title']/b")
     WebElement title;

    @FindBy(name = "FirstName")
     WebElement firstName;

    @FindBy(name = "MiddleName")
     WebElement middleName;

    @FindBy(name = "LastName")
     WebElement lastName;

    @FindBy(name = "Region")
     WebElement region;

    @FindBy(xpath = "//label[contains(.,'Телефон')]/parent::div/input")
    WebElement phone;

    @FindBy(name = "Email")
     WebElement email;

    @FindBy(name = "ContactDate")
     WebElement contactDate;

    @FindBy(name = "Comment")
     WebElement comment;

    @FindBy(xpath = "//span[contains(text(),'Введите корректный email')]")
    WebElement textError;

    public CheckOutPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }


    public WebElement getTitleButton() {
        return title;
    }

    public CheckOutPage fillField(String field, String value) {
        switch (field) {
            case "Имя":
                fillField(firstName, value);
                break;
            case "Фамилия":
                fillField(lastName, value);
                break;
            case "Отчество":
                fillField(middleName, value);
                break;
            case "Регион":
                region.sendKeys(value);
                //fillField(region, value);
                break;
            case "Телефон":
                fillField(phone, value);
                break;
            case "Эл. почта":
                fillField(email, value);
                break;
            case "Дата контакта":
                contactDate.sendKeys(value);
               // fillField(contactDate, value);
                break;
            case "Комментарии":
                fillField(comment, value);
                break;

        }
        return this;
    }

    public String getFillField(String field){
        switch (field) {
            case "Имя":
                return getFillField(firstName);
            case "Фамилия":
                return getFillField(lastName);
            case "Отчество":
                return getFillField(middleName);
            case "Регион":
                return getFillField(region);
            case "Телефон":
                return getFillField(phone);
            case "Эл. почта":
                return getFillField(email);
            case "Дата контакта":
                return getFillField(contactDate);
            case "Комментарии":
                return getFillField(comment);

        }
        throw new AssertionError("Поле " + field + "не объявлено на странице");
    }

    private void fillField(WebElement element, String value){
        element.clear();
        element.sendKeys(value);
    }

    private String getFillField(WebElement element){
        return element.getAttribute("value");
    }

    public boolean getTextError()
    {
        return textError.isEnabled();
    }
}
