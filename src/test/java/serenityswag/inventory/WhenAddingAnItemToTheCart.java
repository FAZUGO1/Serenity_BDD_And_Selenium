package serenityswag.inventory;

import net.serenitybdd.core.Serenity;
import org.junit.Before;
import org.junit.Test;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import serenityswag.authentication.LogingActions;
import serenityswag.cart.AddToCartActions;
import serenityswag.cart.ShoppingCartBadge;
import serenityswag.cart.AddToCartActions;

import static org.assertj.core.api.Assertions.assertThat;
import static serenityswag.authentication.Users.STANDARD_USER;

@RunWith(SerenityRunner.class)
public class WhenAddingAnItemToTheCart {

    @Managed(driver = "firefox")
    WebDriver driver;

    @Steps
    LogingActions login;

    @Before
    public void login() {
        login.as(STANDARD_USER);
    }

    ShoppingCartBadge shoppingCartBadge;

    @Steps
    AddToCartActions addTocart;

    @Test
    public void theCorrectItemCountShouldBeShown() {
        Serenity.reportThat("Verificar que el carro de campra está vacío",
                () -> assertThat(shoppingCartBadge.count()).isEmpty()
        );
        Serenity.reportThat("Agregar un) artículo al carro de compra",
                () -> addTocart.item("Sauce Labs Backpack")
        );
         Serenity.reportThat("Verificar que el número de artículos en el carro de compra es 1",
                () -> assertThat(shoppingCartBadge.count()).isEqualTo("1")
        );
    }

    @Test
    public void allTheItemsShouldAppearInTheCart() {
    }
}
