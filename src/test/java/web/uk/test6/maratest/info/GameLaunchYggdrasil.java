package web.uk.test6.maratest.info;

import org.testng.annotations.Test;


public class GameLaunchYggdrasil extends BaseTestForCasinoRegistred {


    @Test
    //
    public void launch_Yggdrasil_in_search() {


        casinoPage.enterSymbolsToSearch("olegYggdrasilAutotest");

        casinoPage.clickIfElementIsClickable(casinoPage.getGameTitle());

    }
}

