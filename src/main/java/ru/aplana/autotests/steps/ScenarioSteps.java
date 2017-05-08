package ru.aplana.autotests.steps;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

import java.util.Map;

/**
 * Created by Maria on 01.05.2017.
 */
public class ScenarioSteps {

    @Steps
    MainPageSteps mainPageSteps;

    @Steps
    ServicePageSteps servicePageSteps;

    @Steps
    CheckOutPageSteps checkOutPageSteps;

    @When("выбран пункт меню \"$menuName\"")
    public void selectMenuItem(String menuName){
        mainPageSteps.selectMenuItem(menuName);
    }

    @When("выбран продукт с наименованием \"$serviceName\"")
    public void selectProduct(String serviceName){
        mainPageSteps.selectProductItem(serviceName);
    }

    @Then("заголовок страницы - услуга равна \"$serviceTitle\"")
    public void checkTitleServicePage(String serviceTitle){
        servicePageSteps.checkPageTitle(serviceTitle);
    }

    @When("выполнено нажатие на кнопку - Отправить заявку")
    public void goToCheckOutPage(){
        servicePageSteps.goToCheckOutPage();
    }

    @Then("заголовок страницы платежа равен \"$title\"")
    public void checkTitleCheckOutPage(String title){
        checkOutPageSteps.checkPageTitle(title);
    }

    @When("заполняются поля: $fields")
    public void fillForm(ExamplesTable fields){
        for (Map<String, String> row : fields.getRows()) {
            String field = row.get("field");
            String value = row.get("value");
            checkOutPageSteps.fillField(field, value);
        }
    }


    @Then("значения полей равны: $fields")
    public void checkFillForm(ExamplesTable fields){
        for (Map<String, String> row : fields.getRows()) {

            String field = row.get("field");
            String value = row.get("value");
            checkOutPageSteps.checkFillField(field, value);
        }
    }

    @Then("у Поля - Эл. почта присутствует сообщение об ошибке - \"$textError\"")
    public void checkError(String textError)
    {
        checkOutPageSteps.checkError(textError);
    }

}
