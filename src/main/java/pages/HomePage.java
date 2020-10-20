package pages;

import wrappers.EventsWrapper;

public class HomePage extends EventsWrapper {

    public HomePage verifyTitleOfThePage(String data){
        verifyTitle(data);
        return this;
    }

    public AuthenticationPage clickSignInButton(){
        clickById(prop.getProperty("HomePage_ClickSigninBtnBy_ClassName"));
        return new AuthenticationPage();
    }
}
