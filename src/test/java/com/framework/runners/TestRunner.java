package com.framework.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = { "html:target/cucumber-reports.html",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "rerun:target/rerun.txt",
                "pretty"

        },
        features = "src/test/resources/features",
        glue = "com/framework/step_definitions",
        dryRun = false,
        tags="",
        publish = true

)

public class TestRunner {
}
