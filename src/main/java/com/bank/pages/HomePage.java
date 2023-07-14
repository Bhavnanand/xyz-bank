package com.bank.pages;

import com.bank.utilities.Utility;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By CustomerLogin =By.xpath("//button[contains(text(),'Customer Login')]");
    By bankManagerLogin =By.xpath("//button[contains(text(),'Bank Manager Login')]");
    public void clickOnCustomerLogintab(){
        clickOnElement(CustomerLogin);
    }
    public void clickOnBankManagerLoginTab(){
        clickOnElement(bankManagerLogin);
    }
}
