package runnerClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import wrappers.EventsWrapper;

public class HooksForTest extends EventsWrapper {

    @Before
    public void setUp(){
        System.out.println("This is from Before TAG");
        launchBrowser();
    }

    @After
    public void tearDown(){
        System.out.println("This is from After TAG");
    }
}
