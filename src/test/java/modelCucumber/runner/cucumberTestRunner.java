package modelCucumber.runner;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.*;

@Suite
@SelectClasspathResource("src/test/java/modelCucumber/features")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "src/test/java/modelCucumber/steps")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty, html:target/cucumber-report.html")
public class cucumberTestRunner {
}
