package com.bank.pages;

import com.bank.utilities.Utility;
import jdk.nashorn.internal.AssertsEnabled;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class OpenAccountPage extends Utility {
    By Customer= By.xpath("//select[@id='userSelect']");
    By Currency=By.xpath("//select[@id='currency']");
    By Process =By.xpath("//button[contains(text(),'Process')]");
    public  void findCustomer() {
        selectByVisibleTextFromDropDown(Customer,"Harry Potter");
    }
    public void findCurrency(){
        clickOnElement(Currency);
        selectByValueFromDropDown(Currency,"Pound");}
        public void ClickOnProcess(){clickOnElement(Process);
    }
    public void handlePopUp(){
        String popUp= getTextFromAlert();
        switchToAlert();
        acceptAlert();
    }
    public void verifyMessage(){
        Assert.assertEquals("Account created successfully with account Number :1016",getTextFromAlert());
    }
}
