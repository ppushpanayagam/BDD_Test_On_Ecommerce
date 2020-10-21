package wrappers;

public interface EventsInterFace {

    public void launchApp();
    public void loadObjects();
    public void enterById(String idValue,String data);
    public void clickById(String idValue);
    public boolean VerifyTextValueByXpath(String xpathValue,String data) throws Throwable;
    public void verifyTitle(String data);
    public void selectByIdWithValue(String cnameValue, String data) throws Throwable;
    public void quiteBrowser();

}
