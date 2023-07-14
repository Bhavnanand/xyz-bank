package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BankManagerLoginPage extends Utility {
    By addCustomer = By.xpath("///button[@class='btnClass1']");
    By openAccount =By.xpath("//button[@ng-class='btnClass2']");
    By customers =By.xpath("//button[@ng-class='btnClass3']");
    public void clickOnAddCustomer() {
        driver.findElement(addCustomer).click();

    }
    public void clickOnOpenAccount(){
        clickOnElement(openAccount);
    }
    public void click0nCustomers(){
        clickOnElement(customers);

    }
}
