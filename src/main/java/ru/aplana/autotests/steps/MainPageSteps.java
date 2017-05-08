package ru.aplana.autotests.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import ru.aplana.autotests.pages.MainPage;

/**
 * Created by Maria on 29.04.2017.
 */
public class MainPageSteps extends ScenarioSteps {

    MainPage mainPage;

    @Step("выбран пункт меню {0}")
    public void selectMenuItem(String menuItem){

        mainPage.selectMenuItem(menuItem);
    }

    @Step("выбран продукт с наименованием {0}")
    public void selectProductItem(String productName){
        mainPage.selectProduct(productName);
    }
}
