package ru.aplana.autotests.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import ru.aplana.autotests.pages.ServicePage;

import static org.junit.Assert.assertEquals;

/**
 * Created by Maria on 29.04.2017.
 */
public class ServicePageSteps extends ScenarioSteps {

    ServicePage servicePage;

    @Step("заголовок страницы равен {0}")
    public void checkPageTitle(String expectedTitle){
        String actualTitle = servicePage.getTitleButton().getText();
        assertEquals(String.format("Заголовок равен [%s]. Ожидалось - [%s]",
                actualTitle, expectedTitle), expectedTitle, actualTitle);
    }

    @Step("выполнена отправка заявки")
    public void goToCheckOutPage(){
        servicePage.getSendApplicationBtn().click();
    }
}
