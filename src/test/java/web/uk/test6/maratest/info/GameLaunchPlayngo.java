package web.uk.test6.maratest.info;

import org.testng.annotations.Test;


public class GameLaunchPlayngo extends BaseTestForCasinoRegistred {


    @Test
    //
    public void launch_Playngo_in_search() {


        casinoPage.enterSymbolsToSearch("olegPlayngoAutotest");

        casinoPage.clickIfElementIsClickable(casinoPage.getGameTitle());

    }
}

