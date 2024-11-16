package tests.pages.home;

import lombok.extern.slf4j.Slf4j;
import tests.utils.Actions;
import tests.utils.MasterPageFactory;

@Slf4j
public class HomeLogic {

    private static HomePage homePage;
    private static tests.utils.Actions Actions;

    public static HomePage homePage() {
        homePage = MasterPageFactory.getInstance(HomePage.class);
        return null;
    }

    public static void clicarBtnProfile() throws Exception {
        log.info ("Clico no botão 'Proile'");
        Actions.click(homePage().getClicarBtnProfile());
        Actions.sleep(2000);

    }
}
