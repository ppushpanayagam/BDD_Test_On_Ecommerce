package pages;

public class AuthenticationPage {

    public AuthenticationPage verifyTitleOfThePage(){
        return this;
    }

    public AuthenticationPage enterEmailId(){
        return this;
    }

    public CreateAccountPage clickCreateAccountBtn(){
        return new CreateAccountPage();
    }
}
