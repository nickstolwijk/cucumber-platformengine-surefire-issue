package nl.blue4it.stolwijk.sandbox.cucumber5.feature1;

import io.cucumber.java8.En;
import io.cucumber.junit.platform.engine.Cucumber;

import nl.blue4it.stolwijk.sandbox.cucumber5.model.Version;

@Cucumber
public class VersionCheckSteps implements En {

    public VersionCheckSteps() {
        When("The user wants a {} version.", (String version) -> {
            System.out.println("We wants a version: " + version);
        });

        Then("The user gets an {} version.", (Version version) -> {
            System.out.println("We gets a version: " + version);
        });
    }


}
