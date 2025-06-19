package runner

import io.cucumber.junit.{Cucumber, CucumberOptions}
import org.junit.runner.RunWith

@RunWith(classOf[Cucumber])
@CucumberOptions(
  features   = Array("classpath:features"),            // src/test/resources/features
  glue       = Array("stepdefs", "support"),           // src/test/scala
  plugin     = Array("pretty",
    "html:target/cucumber-report.html"),
  monochrome = true,
  tags = {"@smoke, @regression, ~@wip"}
)
class runner // an empty class body is OK