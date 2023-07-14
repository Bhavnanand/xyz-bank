package com.bank.testsuit;

import com.bank.pages.*;
import com.bank.testbase.BaseTest;
import org.checkerframework.checker.units.qual.A;
import org.testng.annotations.Test;

public class BankTest extends BaseTest {
    HomePage homepage = new HomePage();
    BankManagerLoginPage bankManagerLoginPage = new BankManagerLoginPage();
    AddCustomerPage addCustomerPage = new AddCustomerPage();
    OpenAccountPage openAccountPage = new OpenAccountPage();

    CustomerLoginPage customerLoginPage = new CustomerLoginPage();
    Customers customers = new Customers();

    @Test
    public void bankManagerShouldAddCustomerSuccessfully() throws InterruptedException {
        // click On "Bank Manager Login" Tab
        homepage.clickOnBankManagerLoginTab();
        Thread.sleep(700);
        //	click On "Add Customer" Tab
        bankManagerLoginPage.clickOnAddCustomer();
        Thread.sleep(700);
        // enter FirstName
        addCustomerPage.addFirstname();
        // enter LastName
        addCustomerPage.addLastnameField();
        //enter PostCode
        addCustomerPage.addPostCode();
        //	click On "Add Customer" Button
        addCustomerPage.finalclickAddCustomer();
        Thread.sleep(700);
        //	popup display//	click on "ok" button on popup.
        addCustomerPage.handlePopUp();
        Thread.sleep(700);
        //	verify message "Customer added successfully"
        addCustomerPage.VerifyMessageFromPoup();
        Thread.sleep(700);
        //	click On "Add Customer" Button
        addCustomerPage.finalclickAddCustomer();
        Thread.sleep(700);
        //	popup display//	click on "ok" button on popup.
        addCustomerPage.handlePopUp();
        Thread.sleep(700);

        //	verify message "Customer added successfully"
        addCustomerPage.VerifyMessageFromPoup();


//	enter FirstName
//	enter LastName
//	enter PostCode


        Thread.sleep(1000);
        //haandlePopUp();
    }

    @Test
    public void bankManagerShouldOpenAccountSuccessfully() {
        homepage.clickOnBankManagerLoginTab();
        bankManagerLoginPage.clickOnOpenAccount();
        openAccountPage.findCustomer();
        openAccountPage.findCurrency();
        openAccountPage.ClickOnProcess();
        openAccountPage.verifyMessage();
        openAccountPage.handlePopUp();
    }

    @Test
    public void customerShouldLoginAndLogoutSuceessfully() {
        homepage.clickOnCustomerLogintab();
        customerLoginPage.selectnameFromList();
        customerLoginPage.VerifyLogout();
        customerLoginPage.clickOnLogOut();
        customerLoginPage.VerifyName();
    }

    @Test

    public void customerShouldDepositMoneySuccessfully() throws InterruptedException {
        homepage.clickOnCustomerLogintab();
        customers.SearchCustomer();
        Thread.sleep(700);
        customerLoginPage.loginclick();
        customers.clickOnDepositeTag();
        customers.EnterAmount();
        customers.clickOnDeposit();
    }

    @Test
    public void customerShouldWithdrawMoneySuccessfully() {
        homepage.clickOnCustomerLogintab();
        customers.SearchCustomer();
        customerLoginPage.loginclick();
        customers.clickOnWithdrawal();
        customers.EnterWithdrawAmount();
        customers.clickOnWithdraw();
    }

}
