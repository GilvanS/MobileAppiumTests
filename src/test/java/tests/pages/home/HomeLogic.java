package tests.pages.home;

import lombok.extern.slf4j.Slf4j;
import tests.pages.profile.ProfilePage;
import tests.utils.Actions;
import tests.utils.PageMaker;

@Slf4j
public class HomeLogic {

    private HomePage homePage;
    static Actions actions = new Actions();

    public static void clicarBtnProfile() throws Exception {
        log.info ("Clico no botão 'Proile'");
        HomePage homePage = PageMaker.getPage(HomePage.class);
        actions.clickElement(String.valueOf(homePage.getClicarBtnProfile()));

    }
}
