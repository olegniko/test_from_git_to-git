package web.maratest.info;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.CasinoPage;

import static helper.factory.Browser.exampleBundle;
import static helper.factory.Browser.exampleBundleServer;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class LoginHeaderLogged {

    CasinoPage casinoPage;

    @BeforeClass

    public void setUp() throws Exception {


        casinoPage = new CasinoPage();
        casinoPage.correctLogin(exampleBundleServer.getString("correct_login"), exampleBundleServer.getString("correct_password"));

    }


    @AfterClass(alwaysRun = true)
    public void tearDown() {
        casinoPage.clickIfElementIsClickable(casinoPage.getLogoutButtonHeaderElement());
        casinoPage.close();
    }



    @Test
    //
    public void myAccountButtonEnabledTest() {

        assertTrue(casinoPage.getMyAccountButtonHeaderElement().isDisplayed());
        assertTrue(casinoPage.getMyAccountButtonHeaderElement().isEnabled());

    }

    @Test
    //
    public void depositButtonEnabledTest() {

        assertTrue(casinoPage.getDepositButtonHeaderElement().isDisplayed());
        assertTrue(casinoPage.getDepositButtonHeaderElement().isEnabled());

    }

    @Test
    //
    public void loginButtonEnabledTest() {

        assertTrue(casinoPage.getLogoutButtonHeaderElement().isDisplayed());
        assertTrue(casinoPage.getLogoutButtonHeaderElement().isEnabled());

    }

}

