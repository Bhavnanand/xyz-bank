package com.bank.pages;

import com.bank.utilities.Utility;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class AddCustomerPage extends Utility {

    By firstNameField = By.xpath("//label[contains(text(),'First Name')]");
    By lastNameField = By.tagName("//input[@placeholder='Last Name']");
    By postCode = By.tagName("Post Code :");
   // By addCustomer= By.xpath("//button[text()='Add Customer']");
    By addcustomerend = By.xpath("//button[@class='btn btn-default']");

    public void addFirstname() {
        driver.findElement(firstNameField).sendKeys("Hima");
       // sendTextToElement(firstNameField, "Hina");
    }
    public void addLastnameField(){
        sendTextToElement(lastNameField, "Mehta");
    }
    public void addPostCode(){
        sendTextToElement(postCode, "Sw22 n324");
    }

    public void finalclickAddCustomer() {
        clickOnElement(addcustomerend);
    }
    public void handlePopUp(){
        switchToAlert();
        acceptAlert();
    }
    public void VerifyMessageFromPoup() {
        String popup = getTextFromAlert();
        Assert.assertEquals(popup, "Customer added successfully with customer id :6");
    }

}
