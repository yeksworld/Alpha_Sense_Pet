package Pet_Tester.StepDefinitions;

import Pet_Tester.Utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Hooks {


    @Before
    public void setUp() {
        // we put a logic that should apply to every scenario
    }

    @After
    public void tearDown(Scenario scenario) throws InterruptedException {

        if (Driver.get() != null) {
            Thread.sleep(5000);
            Driver.closeDriver();
        }

    }


}