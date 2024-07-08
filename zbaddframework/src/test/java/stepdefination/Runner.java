package stepdefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\anujg\\eclipse-workspace\\zbaddframework\\src\\test\\resources\\Features\\amazonsearch.feature",glue= {"C:\\Users\\anujg\\eclipse-workspace\\zbaddframework\\src\\test\\java\\stepdefination"},
monochrome= true)


public class Runner {

}
