package com.bank.testbase;

import com.bank.utilities.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utility {
    static String browser="chrome";
    @BeforeMethod
    public void setUP(){
       selectBrowser (browser);
    }
    @AfterMethod
    public void teardown(){
        closeBrowser();

    }
}
