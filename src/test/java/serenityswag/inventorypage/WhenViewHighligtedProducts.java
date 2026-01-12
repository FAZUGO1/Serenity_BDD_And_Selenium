package serenityswag.inventorypage;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import serenityswag.authentication.Users;
import serenityswag.authentication.actions.LogingActions;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

@ExtendWith(SerenityJUnit5Extension.class)
public class WhenViewHighligtedProducts {
    @Managed
    WebDriver driver;

    @Steps
    LogingActions login;

    ProductsListPageobject productsList;
    @Test
    public void shouldDisplayHighLightedProductsOnWelcomePage(){
        login.as(Users.STANDARD_USER);
        List<String> productsOnDisplay = productsList.titles();
        assertThat(productsOnDisplay).hasSize(6)
                .contains("Sauce Labs Backpack");

    }



}
