package pages;

public class HomePage {

    public HomePage verifyTitleOfThePage(){
        return this;
    }

    public AuthenticationPage clickSignInButton(){

        return new AuthenticationPage();
    }
}
