package com.ant.page_objects.elementsPage;

import com.ant.webdriver_manager.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ElementsPanel {

    public ElementsPanel(){
        new WebDriverWait(DriverManager.getDriver(), 5).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='header-text' and text()='Elements']")));
    }

    public void selectTab(TabNames tabName, SubTabNames selectItemName){
        WebDriver driver = DriverManager.getDriver();
        String headerText = "//div[@class='header-text' and text()='Elements']";
        String textBoxXpath = "//div[@class='element-list collapse show']//span[text()='Text Box']";
        List<WebElement> textBoxEle = driver.findElements(By.xpath(textBoxXpath));
        if (textBoxEle.size() > 0){
            textBoxEle.get(0).click();
        }else {
            new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(By.xpath(headerText)));
            driver.findElement(By.xpath(headerText)).click();
        }
    }
}
