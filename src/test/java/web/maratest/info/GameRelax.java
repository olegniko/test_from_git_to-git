package web.maratest.info;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.CasinoPage;

import static helper.factory.Browser.exampleBundle;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;


public class GameRelax {

    CasinoPage casinoPage;

    @BeforeClass

    public void setUp() throws Exception {


        casinoPage = new CasinoPage();
        casinoPage.search(exampleBundle.getString("relax_game"));

    }


    @AfterClass
    public void tearDown() {
        casinoPage.close();
    }


    @Test
    //
    public void playButtonEnabledTest() {

        assertFalse(casinoPage.getRelaxGamePlayElement().isDisplayed());
        assertTrue(casinoPage.getRelaxGamePlayElement().isEnabled());

    }

    @Test
    //
    public void demoButtonEnabledTest() {

        assertFalse(casinoPage.getRelaxGameDemoElement().isDisplayed());
        assertTrue(casinoPage.getRelaxGameDemoElement().isEnabled());

    }

    @Test
    //
    public void favouritesEnabledTest() {

        assertTrue(casinoPage.getRelaxGameFavouriteElement().isDisplayed());
        assertTrue(casinoPage.getRelaxGameFavouriteElement().isEnabled());

    }

}

