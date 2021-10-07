package com.ant.step_definitions;

import com.ant.constants.Constants;
import com.ant.page_objects.elementsPage.ElementsPanel;
import com.ant.page_objects.elementsPage.SubTabNames;
import com.ant.page_objects.elementsPage.TabNames;
import com.ant.page_objects.elementsPage.textBoxPage.TextBoxPage;
import com.ant.page_objects.homePage.HomePage;
import com.ant.webdriver_manager.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.util.concurrent.TimeUnit;

public class Verify_CEO_Name {
    public static final Logger LOGGER = LogManager.getLogger(Verify_CEO_Name.class);
    @Given("Open URL Application")
    public void Open_URL_Application() {
        DriverManager.getDriver().get(Constants.APP_URL);
        LOGGER.info("Application Opened Successfully");
        DriverManager.getDriver().manage().window().maximize();
        DriverManager.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Given("logged in to home page")
    public void logged_in_to_home_page() {
        new HomePage().elementTab.click();
        LOGGER.info("Elements Tab Selected Successfully");
    }

    @When("click on menu bar")
    public void click_on_menu_bar() {
        new ElementsPanel().selectTab(TabNames.ELEMENT, SubTabNames.TEXT_BOX);
        LOGGER.info("Tab Name Selected Successfully");
    }

    @When("select name {string}")
    public void select(String username) {
        TextBoxPage textBoxPage = new TextBoxPage();
        textBoxPage.fullName.sendKeys(username);
        LOGGER.info("Successfully entered username = "+username);
        textBoxPage.email.sendKeys(username+"@mail.com");
        LOGGER.info("Successfully entered mailid = "+username);
        textBoxPage.currentAddress.sendKeys("pudukkottai");
        LOGGER.info("Successfully entered Current Address = "+username);
        textBoxPage.permanentAddress.sendKeys("Kulamangalam");
        LOGGER.info("Successfully entered Permanent Address = "+username);

    }

    @When("click on search")
    public void click_on_search(){
        new TextBoxPage().submitBtn.click();
        LOGGER.info("Successfully clicked on submit button");
    }

    @Then("user should see the CEO name as {string}")
    public void user_should_see_the_ceo_name_as(String string) {
        DriverManager.getDriver().quit();
        LOGGER.info("Browser closed Successfully");
    }
}
