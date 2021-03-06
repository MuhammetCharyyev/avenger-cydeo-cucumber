package com.cydeo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber-report.html",
        //multiple time of reports, 'html' in this case,
        //'target' is our folder in project, then we name the 'html' report
        //when you run this class the 'cucumber-report.html'
        //when I right click on 'cucumber-report.html' file in library and then
        //choose 'open in' browser->Chrome then this will open login.feature as html page
        features = "src/test/resources/features",//chain to features package
        glue = "com/cydeo/step_definitions",//chain to step_definitions package
        dryRun = false,
        //dryRun turns of the running step_definitions
        //dryRun = true -> do not run my step_definitions(do not run browser)
                           // but only check if any step is missing snippet
        //dryRun = false -> turn off dryRun and our code will run as expected
        tags =  "@wip"               //"wip" -> wip means "work in progress"
                //"@Regression"//named it by custom, as you want, only make sense where you place it
        //can be @smoke, @librarian, @student or @admin which are in login.feature
        //you can even "@librarian or @student" will execute 2 scenarios
        //'or' here is like || in Java, if any true then execute
        //also '@Regression and not @student' will execute everything except @student
        //also '@employee and not @admin' will execute only @librarian
        //@Regression is placed at the top of login.feature to execute whole code
        //if we place @something at the top only one Scenario of login.feature
        // then it will execute only this Scenario

)

public class CucesRunner {
}
// we can check tags @wip for example to remove excess
//ctrl+shift+R