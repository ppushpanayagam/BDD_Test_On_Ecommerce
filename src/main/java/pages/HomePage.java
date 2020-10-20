package pages;

import wrappers.EventsWrapper;

public class HomePage extends EventsWrapper {

    public HomePage verifyTitleOfThePage(String data){
        verifyTitle(data);
        return this;
    }

    public AuthenticationPage clickSignInButton() throws InterruptedException {
        Thread.sleep(5000);
        clickByXpath(prop.getProperty("HomePage_ClickSigninBtnBy_Xpath"));
        return new AuthenticationPage();
    }
}
