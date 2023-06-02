package org.example.stepDef;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;


import org.testng.Assert;


public class T01_Login {


    @When("Enter Valid username at username Field")
    public void enterValidUsernameAtUsernameField() {
        Hooks.driver.findElement(By.id("user-name")).sendKeys("standard_user");

    }

    @And("Enter Valid password at password Field")
    public void enterValidPasswordAtPasswordField() {
        Hooks.driver.findElement(By.id("password")).sendKeys("secret_sauce");
    }

    @And("Click on Login button")
    public void clickOnLoginButton() {
        Hooks.driver.findElement(By.id("login-button")).click();
    }

    @Then("I will be able to login successfully")
    public void iWillBeAbleToLoginSuccessfully() {
        Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("inventory.html"));
    }

    @When("Enter inValid username at username Field")
    public void enterInValidUsernameAtUsernameField() {
        Hooks.driver.findElement(By.id("user-name")).sendKeys("standard_users");
    }

    @Then("An error message will be displayed")
    public void anErrorMessageWillBeDisplayed() {
        Assert.assertEquals(Hooks.driver.findElement(By.cssSelector("h3[data-test='error']")).getText(),"Epic sadface: Username and password do not match any user in this service");
    }


}
