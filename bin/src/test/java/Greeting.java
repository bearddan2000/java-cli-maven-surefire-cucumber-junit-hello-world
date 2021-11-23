import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.jupiter.api.Assertions;

//import static org.hamcrest.MatcherAssert.assertThat;
//import static org.hamcrest.core.IsEqual.equalTo;

public class Greeting {

  String name, res;

  @Given("^Set variable (.*)$")
  public void createName(String val) {
     name = val;
  }

  @When("^Pass name (.*) to function$")
  public void passName(String val) {
     res = example.Greeting.greeting(val);
  }

  @Then("^Response should be hello world (.*)$")
  public void checkMessage(String val) {
     Assertions.assertEquals(res, val);
  }
}
