import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MyStepdefs extends Config{

    BusinessDef bud=new BusinessDef();

    @cucumber.api.java.en.Given("^The configuration are loaded$")
    public void theConfigurationAreLoaded() throws Throwable {
        Config.callProperties();
        Config.launchBrowser();
    }

    @When("^I print the value$")
    public void iPrintTheValue() throws Throwable {
        System.out.println("I am successful to print the value");
    }

    @Then("^I see the output$")
    public void iSeeTheOutput() throws Throwable {
        System.out.println("I am able to see my the output !");

    }

    @When("^User navigate to the website$")
    public void userNavigateToTheWebsite() throws Throwable {
        //Launch the website from attribute ("URL") present in Environment.properties
        BusinessDef.launchWebsite();
//        Thread.sleep(5000);
    }

    @And("^User closes the webDriver$")
    public void userClosesTheWebDriver() throws Throwable {
        //Browser instance is closed
        driver.close();
    }

    @And("^User quits the webDriver$")
    public void userQuitsTheWebDriver() throws Throwable {
        // ALl the instances of the browser are closed
        driver.quit();
    }

    @Then("^User should see the title$")
    public void userShouldSeeTheTitle() throws Throwable {
        //Verify the page title
        String title=driver.getTitle();
        System.out.println(title + " - this is the webPage title");
        Assert.assertEquals("Google",title);

    }

    @And("^User input the text in (.*)")
    public void userInputTheTextInSearchbox(String userInput) throws Throwable {
        bud.enterText("google_search_text_box", userInput);
    }

    @And("^User clicks the (.*) button$")
    public void userClicksTheSearchButton(String searchButton) throws Throwable {
        bud.click("google_search_button");
        System.out.println("Currenlty no button to click");
    }

    @And("^To test the push and commit in Github$")
    public void toTestThePushAndCommitInGithub() throws Throwable {
        System.out.println("If you are able to see this code, means you have a successful gitHub pull :D");
    }
}
