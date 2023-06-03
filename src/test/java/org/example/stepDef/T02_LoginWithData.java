package org.example.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_login;
import org.openqa.selenium.By;
import org.testng.Assert;

public class T02_LoginWithData {
    P01_login login = new P01_login();
    @And("user Enter password")
    public void userEnterPassword (){
        login.passWord().sendKeys("secret_sauce");
    }

    @When("user Enter {string}")
    public void userEnter(String username) {
        login.userName().sendKeys(username);
    }

    @And("user click on Login button")
    public void userClickOnLoginButton() {
        Hooks.driver.findElement(By.id("login-button")).click();
    }

    @Then("i will be able to login successfully")
    public void iWillBeAbleToLoginSuccessfully() {
        Assert.assertTrue(login.currentURL().contains("inventory.html"));
    }

    @Then("i will not be able to login successfully")
    public void iWillNotBeAbleToLoginSuccessfully() {
        Assert.assertFalse(login.currentURL().contains("inventory.html"));

    }
}
