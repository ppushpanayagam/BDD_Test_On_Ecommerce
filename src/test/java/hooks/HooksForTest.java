package hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import wrappers.EventsWrapper;

public class HooksForTest {

    EventsWrapper eventsWrapper = new EventsWrapper();

    @Before
    public void setUp(){
        eventsWrapper.loadObjects();
        eventsWrapper.launchApp();
    }

    @After
    public void tearDown(){
        eventsWrapper.quiteBrowser();
    }
}
