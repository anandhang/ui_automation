package com.ant.page_objects.homePage;

import com.ant.webdriver_manager.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    private final static String elementButtonXpath = "//h5[text()='Elements']";

    @FindBy(xpath = elementButtonXpath)
    public WebElement elementTab;

    public HomePage(){
        WebDriver driver = DriverManager.getDriver();
        new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(By.xpath(elementButtonXpath)));
        PageFactory.initElements(driver,this);
    }
}
