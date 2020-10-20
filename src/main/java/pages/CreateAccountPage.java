package pages;

import wrappers.EventsWrapper;

public class CreateAccountPage extends EventsWrapper {

    public CreateAccountPage verifyTitleOfThePage(String data){
        verifyTitle(data);
        return this;
    }

    public CreateAccountPage clickTitleRadioBtn(){
        clickById(prop.getProperty("CreateAnAccountPage_ClickGenderOptionBy_Id"));
        return this;
    }

}
