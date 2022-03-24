package com.techfios.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestPage {
    
    private WebDriver driver;
    
    public TestPage(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy (how=How.CSS, using = "button[onclick='myFunctionSky()']") WebElement skyBlueButton;
    @FindBy (how=How.CSS, using = "button[onclick='myFunctionWhite()']") WebElement whiteButton;
    @FindBy (how=How.TAG_NAME, using = "body") WebElement body;

    public void blueButtonExists(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(skyBlueButton));

    }

    public void whiteButtonExists(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(whiteButton));

    }

    public void clickBlueButton(){
        skyBlueButton.click();
    
    }

    public void clickWhiteButton(){
        whiteButton.click();
    
    }

    public void verifyBlue(){

        // JavascriptExecutor jse = (JavascriptExecutor) driver;
        // jse.executeScript("var color = document.body.style.backgroundColor; console.log(color);");

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.attributeContains(body, "style", "background-color: skyblue;"));

        

    }

    public void verifyWhite(){

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.attributeContains(body, "style", "background-color: white;"));

    }



}
