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

    public CreateAccountPage enterFirstName(String data){
        enterById(prop.getProperty("CreateAnAccountPage_EnterFirstNameBy_Id"), data);
        return this;
    }

    public CreateAccountPage enterLastName(String data){
        enterById(prop.getProperty("CreateAnAccountPage_EnterLastNameBy_Id"), data);
        return this;
    }

    public CreateAccountPage enterPassword(String data){
        enterById(prop.getProperty("CreateAnAccountPage_EnterPasswordBy_Id"), data);
        return this;
    }

    public CreateAccountPage enterDateOfBirth(String days, String months, String years){
        enterById(prop.getProperty("CreateAnAccountPage_EnterDaysBy_Id"), days);
        enterById(prop.getProperty("CreateAnAccountPage_EnterMonthBy_Id"), months);
        enterById(prop.getProperty("CreateAnAccountPage_EnterYearBy_Id"), years);
        return this;
    }

    public CreateAccountPage enterFirstNameForAddress(String data){
        enterById(prop.getProperty("CreateAnAccountPage_EnterAddressFirstNameBy_Id"), data);
        return this;
    }

    public CreateAccountPage enterLastNameForAddress(String data){
        enterById(prop.getProperty("CreateAnAccountPage_EnterAddressLastNameBy_Id"), data);
        return this;
    }

    public CreateAccountPage enterAddress(String data){
        enterById(prop.getProperty("CreateAnAccountPage_EnterAddressBy_Id"), data);
        return this;
    }

    public CreateAccountPage enterCity(String data){
        enterById(prop.getProperty("CreateAnAccountPage_EnterCityBy_Id"), data);
        return this;
    }

    public CreateAccountPage selectState(String data) throws Throwable {
        enterById(prop.getProperty("CreateAnAccountPage_EnterStateBy_Id"), data);
        return this;
    }

    public CreateAccountPage enterPostCode(String data){
        enterById(prop.getProperty("CreateAnAccountPage_EnterPostCodeBy_Id"), data);
        return this;
    }

    public CreateAccountPage selectCountry(String data) throws Throwable {
        enterById(prop.getProperty("CreateAnAccountPage_SelectCountryBy_Id"), data);
        return this;
    }

    public CreateAccountPage enterMobileNumber(String data){
        enterById(prop.getProperty("CreateAnAccountPage_EnterMobileNumberBy_Id"), data);
        return this;
    }

    public CreateAccountPage enterAddressAlias(String data){
        enterById(prop.getProperty("CreateAnAccountPage_EnterAddressAliasBy_Id"), data);
        return this;
    }

    public CreateAccountPage clickRegisterPageBtn(){
        clickById(prop.getProperty("CreateAnAccountPage_ClickRegisterBtnBy_Id"));
        return this;
    }
}
