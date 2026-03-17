package serenityswag.authentication;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.findby.By;

public class LogingActions extends UIInteractionSteps {

    @Step("login con usuario ->{0}")
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
    /*    // iniciar sesion con usuario standar
        //$("[data-test='username']").sendKeys(user.getUsername());
        find(By.id("user-name")).sendKeys(user.getUsername());
        //find(By.name("user-name")).sendKeys(user.getUsername());
       // $("[data-test='password']").sendKeys(user.getPassword());
     //   find("#password").sendKeys(user.getPassword()); // notación Abreviada Find By Id
       //$("[name=password]").sendKeys(user.getPassword());//notacion abrevianda Find By Name
        //$("[data-test='login-button']").click();
        find(By.id("user-name")).sendKeys(user.getUsername());
        find(By.id("password")).sendKeys(user.getPassword());
        find(By.name("login-button")).click();
*/

        // despues de refactorizar con login form ojo find=$


        $(LoginForm.USER_NAME).sendKeys(user.getUsername());
        $(LoginForm.PASSWORD).sendKeys(user.getPassword());//notacion abrevianda Find By Name
        $(LoginForm.LOGIN_BUTTON).click();

    }
}
