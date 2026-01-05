package serenityswag.authentication;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.thucydides.core.annotations.findby.By;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SerenityJUnit5Extension.class)
public class WhenLoggingOn extends UIInteractionSteps {

    @Managed
    WebDriver driver;
    @Test
    public void usuarioPuedeLoguearseenHomePage(){
    //   driver.get("https://www.saucedemo.com/");
         openUrl("https://www.saucedemo.com/");

       // iniciar sesion con usuario específico
         $("[data-test='username']").sendKeys("standard_user");
         $("[data-test='password']").sendKeys("secret_sauce");
         $("[data-test='login-button']").click();



         // entrar a ver los productos
         assertThat($(".title").getText()).isEqualToIgnoringCase("Products");

    }

}
