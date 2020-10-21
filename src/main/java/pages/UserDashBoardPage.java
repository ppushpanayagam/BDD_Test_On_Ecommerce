package pages;

import org.openqa.selenium.By;
import wrappers.EventsWrapper;

public class UserDashBoardPage extends EventsWrapper {

    public UserDashBoardPage verifyDashBoardTitle(String data){
        verifyTitle(data);
        return this;
    }

    public boolean verifyLoggedUserDetails(String data) throws Throwable {
        boolean flag = VerifyTextValueByXpath(prop.getProperty("UserDashBoardPage_VerifyLoggedUserBy_Xpath"), data);
        return flag;
    }
}
