package com.ant.page_objects.elementsPage.textBoxPage;

import com.ant.webdriver_manager.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextBoxPage {
    private final String fullNameTextBox = "//input[@id='userName']";

    @FindBy(id = "userName")
    public WebElement fullName;

    @FindBy(id = "userEmail")
    public WebElement email;

    @FindBy(id = "currentAddress")
    public WebElement currentAddress;

    @FindBy(id = "permanentAddress")
    public WebElement permanentAddress;

    @FindBy(id = "submit")
    public WebElement submitBtn;

    public TextBoxPage(){
        WebDriver driver = DriverManager.getDriver();
        new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(By.id("userName")));
        PageFactory.initElements(driver,this);
    }
}
