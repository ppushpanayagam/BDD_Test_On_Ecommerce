package wrappers;

public interface EventsInterFace {

    public void launchBrowser();
    public void loadObjects();
    public void enterById(String idValue,String data);
    public void clickById(String idValue);
    public void VerifyTextValueById(String iDValue,String data);
    public void verifyTitle(String data);
    public void selectByIdWithValue(String cnameValue, String data) throws Throwable;
    public void quiteBrowser();

}
