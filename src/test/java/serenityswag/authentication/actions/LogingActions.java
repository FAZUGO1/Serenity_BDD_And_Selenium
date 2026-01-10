package serenityswag.authentication.actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.findby.By;
import serenityswag.authentication.Users;

public class LogingActions extends UIInteractionSteps {

    @Step("login con usuario {0}")
   /* public void asStandarUser() {
        openUrl("https://www.saucedemo.com/");
        // iniciar sesion con usuario standar
        $("[data-test='username']").sendKeys("standard_user");
        $("[data-test='password']").sendKeys("secret_sauce");
        $("[data-test='login-button']").click();
    }
//*******************Usando parámetros************
   public void usingCredendtials(String user, String password) {
        openUrl("https://www.saucedemo.com/");
        // iniciar sesion con usuario standar
        $("[data-test='username']").sendKeys(user);
        $("[data-test='password']").sendKeys(password);
        $("[data-test='login-button']").click();
    }
 //*****Refactoring Using credentials********

   */
    public void as(Users user)  {

        openUrl("https://www.saucedemo.com/");
        // iniciar sesion con usuario standar
        //$("[data-test='username']").sendKeys(user.getUsername());
        find(By.id("user-name")).sendKeys(user.getUsername());
        $("[data-test='password']").sendKeys(user.getPassword());
        find("#password").sendKeys(user.getPassword());
        $("[data-test='login-button']").click();
    }
}
