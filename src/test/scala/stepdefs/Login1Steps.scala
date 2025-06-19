package stepdefs

import io.cucumber.scala.{EN, PendingException, ScalaDsl}
import org.openqa.selenium.{By, WebDriver, WebElement}
import org.openqa.selenium.chrome.ChromeDriver

class Login1Steps extends ScalaDsl with EN {

  val driver: WebDriver = new ChromeDriver()

  Given("""the user is on the login page""") { () =>
    // Write code here that turns the phrase above into concrete actions
    driver.get("https://parabank.parasoft.com/parabank/index.htm")
  }

  When("""the user enters valid username and password""") { () =>
    val username: WebElement = driver.findElement(By.name("username"))
    val password: WebElement = driver.findElement(By.name("password"))
    username.sendKeys("john")
    password.sendKeys("demo")
  }

  And("""the user clicks the login button""") { () =>
    val submit: WebElement = driver.findElement(By.cssSelector("input[type='submit']"))
    submit.click()
    Thread.sleep(2000)
  }

  Then("""the user should be logged in successfully""") { () =>
    val overview = driver.findElement(By.tagName("h1"))

    if(overview.getText == "Accounts Overview"){
      println("Login Successful")
    }else{
      println("Failed to Login")
    }

//    val overview1 = if(driver.findElement(By.xpath("//*[@id=\"showOverview\"]/h1")).getText == "Accounts Overview"){
//      println("Login Successful")
//    }else{
//      println("Failed to Login")
//    }
//
//    overview1

  }


}