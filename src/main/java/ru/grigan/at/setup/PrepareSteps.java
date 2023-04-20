package ru.grigan.at.setup;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class PrepareSteps {

    @Before(order = 600)
    public void startBrowser(Scenario scenario) {

    }
}
