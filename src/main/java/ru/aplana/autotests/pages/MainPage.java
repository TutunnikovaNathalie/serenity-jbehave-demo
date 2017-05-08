package ru.aplana.autotests.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Maria on 29.04.2017.
 */
public class MainPage extends PageObject{

    @FindBy(xpath = "//*[@id='main-navbar-collapse']")
     WebElement menuItems;

    @FindBy(xpath = "//div[@class='grid rgs-main-menu-links']")
     WebElementFacade productCollection;

    public void selectMenuItem(String itemName){

        menuItems.findElement(By.xpath(".//a[@data-toggle='dropdown']")).click();
    }

    public void selectProduct(String productName){
        productCollection.findElement(By.xpath(".//a[contains(.,'"+ productName +"')]")).click();
    }
}
