package runnerClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksForTest {

    @Before
    public void setUp(){
        System.out.println("This is from Before TAG");
    }

    @After
    public void tearDown(){
        System.out.println("This is from After TAG");
    }
}
