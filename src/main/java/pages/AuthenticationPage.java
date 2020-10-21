package pages;

import wrappers.EventsWrapper;

public class AuthenticationPage extends EventsWrapper {

    public AuthenticationPage verifyTitleOfThePage(String data){
        verifyTitle(data);
        return this;
    }

    public AuthenticationPage enterEmailId(String data){
        enterById(prop.getProperty("AuthenticationPage_EnterEmailIdBy_Id"), data);
        return this;
    }

    public CreateAccountPage clickCreateAccountBtn(){
        clickById(prop.getProperty("AuthenticationPage_ClickCreateAnAccountBtnBy_Id"));
        return new CreateAccountPage();
    }

}
