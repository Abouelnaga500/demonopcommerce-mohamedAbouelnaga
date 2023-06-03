package org.example.pages;

import org.example.stepDef.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P01_login {

    // Element
    By usernameField = By.id("user-name");
    By passwordField = By.id("password");

    // Action
    public WebElement userName (){
        return Hooks.driver.findElement(usernameField);
    }

    public WebElement passWord (){
        return  Hooks.driver.findElement(passwordField);
    }

}
