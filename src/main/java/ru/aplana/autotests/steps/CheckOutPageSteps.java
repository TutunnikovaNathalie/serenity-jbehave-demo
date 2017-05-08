package ru.aplana.autotests.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import ru.aplana.autotests.pages.CheckOutPage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Maria on 29.04.2017.
 */
public class CheckOutPageSteps extends ScenarioSteps {

    CheckOutPage checkOutPage;

    @Step("заголовок страницы равен {0}")
    public void checkPageTitle(String expectedTitle){
        String actualTitle = checkOutPage.getTitleButton().getText();
        assertEquals(String.format("Заголовок равен [%s]. Ожидалось - [%s]",
                actualTitle, expectedTitle), expectedTitle, actualTitle);
    }
    @Step("поле {0} заполняется значением {1}")
    public void fillField(String field, String value){
        checkOutPage.fillField(field, value);
    }

    @Step("поле {0} заполнено значением {1}")
    public void checkFillField(String field, String value){
        String actual = checkOutPage.getFillField(field);
        assertTrue(String.format("Значение поля [%s] равно [%s]. Ожидалось - [%s]", field, actual, value),
                actual.equals(value));

    }

    @Step("текст ошибки равен {0}")
    public void checkError(String textError){

        boolean actual = checkOutPage.getTextError();
        assertTrue(String.format("Текст ошибки эл. адреса присутствует на странице: [%s]", textError),
                actual);

    }
}
