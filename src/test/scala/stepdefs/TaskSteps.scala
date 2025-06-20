package stepdefs

import io.cucumber.core.gherkin.Feature
import io.cucumber.scala.{EN, ScalaDsl}
import org.junit.{After, Before}

class TaskSteps extends ScalaDsl with EN {



  @Before("@smoke"){
    println("Before the Invalid Credentials Scenario")
  }

  @After("@wip"){
    println("After the successful registration scenario")
  }
}