package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;

public class CustomerLoginPage extends Utility {

    String  Fullname;
    By YourName= By.xpath("//select[@id='userSelect']");
    By SearchCustomer= By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/input[1]");
    By loginbutton =By.xpath("//button[contains(text(),'Login')]");
    By DisplayedName=By.xpath("//span[@class='fontBig ng-binding']");
    By logOut =By.xpath("//button[contains(text(),'Logout')]");
    public void selectnameFromList() {
        selectByValueFromDropDown(YourName, Fullname);
    }
    public void loginclick(){
        clickOnElement(loginbutton);
    }
    public void VerifyLogout(){
        String actual =getTextFromElement(logOut);
        Assert.assertEquals(actual,"Logout");
    }
    public void VerifyName(){
        String name=getTextFromElement(DisplayedName);

    }
    public void clickOnLogOut(){
        clickOnElement(logOut);
    }

}
