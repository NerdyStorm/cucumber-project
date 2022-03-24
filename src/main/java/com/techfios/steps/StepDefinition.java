package com.techfios.steps;

import com.techfios.pages.TestPage;
import com.techfios.utils.BrowserFactory;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {

    private WebDriver driver;
    private TestPage testPage;

    @Before
    public void before(){

        driver = BrowserFactory.initDriver("https://techfios.com/test/101/");
        testPage = new TestPage(driver);


    }

    @Given("^Set \"([^\"]*)\" Background button exists$")
    public void set_background_button_exists(String arg0){
        if (arg0.equalsIgnoreCase("SkyBlue")){

            testPage.blueButtonExists();

        }
        else if (arg0.equalsIgnoreCase("SkyWhite")){
            testPage.whiteButtonExists();
        }

    }

    @When("^The \"([^\"]*)\" button is clicked$")
    public void set_button_is_clicked(String arg0){

        if (arg0.equalsIgnoreCase("SkyBlue")){
            
            testPage.clickBlueButton();

        }
        else if (arg0.equalsIgnoreCase("SkyWhite")){

            testPage.clickBlueButton();
            testPage.clickWhiteButton();

        }

    }

    @Then("^The background color will turn \"([^\"]*)\"$")
    public void the_background_color_will_turn(String arg0){

        if (arg0.equalsIgnoreCase("sky blue")){
            testPage.verifyBlue();
        }
        else if (arg0.equalsIgnoreCase("sky white")){
            testPage.verifyWhite();
        }

    }

}
