package serenityswag.authentication;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.thucydides.core.annotations.findby.By;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import serenityswag.authentication.actions.LogingActions;
import serenityswag.inventorypage.InventoryPage;

import static org.assertj.core.api.Assertions.assertThat;
import static serenityswag.authentication.Users.STANDARD_USER;

@ExtendWith(SerenityJUnit5Extension.class)
public class WhenLoggingOn {

    @Managed
    WebDriver driver;

    @Steps
    LogingActions login;
    InventoryPage inventoryPage;

    @Test
    public void usuarioPuedeLoguearseenHomePage(){
         login.as(STANDARD_USER);
         // entrar a ver los productos
         assertThat(inventoryPage.getHeading()).isEqualToIgnoringCase("Products");

    }

}
