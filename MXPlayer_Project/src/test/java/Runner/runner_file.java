package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/MXPlayer/MXPlayer.feature"},glue= {"Definition"},plugin= {"html:tushar2/sharma.html"})
public class runner_file{

	
}
