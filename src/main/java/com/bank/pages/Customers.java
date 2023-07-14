package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Customers extends Utility {
 By YourName= By.xpath("//select[@id='userSelect']");
 By Transactiontag= By.name("Transactions");
 By Depositetag =By.xpath("//button[@class='btn btn-lg tab'][@ng-click='deposit()']");
 By depositAmount= By.xpath("//input[@placeholder='amount']");
 By Deposite =By.xpath("//button[@fdprocessedid='7i745n']");
 By Withdrawal = By.xpath("//button[@fdprocessedid='z5tsfp']");
 By Withdrawmoney =By.xpath("//input[@fdprocessedid='0nx7nc']");
 By Withdraw =By.xpath("//button[@fdprocessedid='mqpwui']");
    public void Findcustomerlist(){
        List<WebElement>customer =driver.findElements(By.tagName("td"));
        for (WebElement customername:
             customer) {
            System.out.println(customername);
        }
    }
    public void SearchCustomer(){
        AddCustomerPage addcust= new AddCustomerPage();
        String  yourName=addcust.firstNameField+" "+addcust.lastNameField;
        clickOnElement(YourName);
        selectByContainsTextFromDropDown(YourName,"Nevill");
    }
    public  void clickOnDepositeTag(){
        clickOnElement(Depositetag);
    }
    public void EnterAmount(){
        sendTextToElement(depositAmount,"100");
    }
    public void clickOnDeposit(){
        clickOnElement(Deposite);
    }
    public void clickOnWithdrawal(){
        clickOnElement(Withdrawal);
    }
    public  void EnterWithdrawAmount(){
        sendTextToElement(Withdrawmoney,"50");
    }
    public  void clickOnWithdraw(){
        clickOnElement(Withdraw);
    }


}
