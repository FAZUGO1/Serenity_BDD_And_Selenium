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
        // driver.findElement(By.cssSelector("[data-test='username']")).sendKeys("standard_user");
         //driver.findElement(By.cssSelector("[data-test='password']")).sendKeys("secret_sauce");
         //driver.findElement(By.cssSelector("[data-test='login-button']")).click();

         find("[data-test='username']").sendKeys("standard_user");
         find("[data-test='password']").sendKeys("secret_sauce");
         find("[data-test='login-button']").click();



         // entrar a ver los productos
       // assertThat(driver.findElement(By.cssSelector("[data-test='title']")).getText())
         //           .isEqualToIgnoringCase("Products");
       // assertThat(driver.findElement(By.cssSelector(".title")).getText())
       //         .isEqualToIgnoringCase("Products");

       assertThat(find(".title").getText()).isEqualToIgnoringCase("Products");

    }

}
