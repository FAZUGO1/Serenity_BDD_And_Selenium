package serenityswag.inventory;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import serenityswag.authentication.Users;
import serenityswag.authentication.LogingActions;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

@ExtendWith(SerenityJUnit5Extension.class)
public class WhenViewHighligtedProducts {
    @Managed
    WebDriver driver;

    @Steps
    LogingActions login;

    @Steps
    ViewProductDetailsActions viewProductDetails;


    ProductList productList;

    ProductsDetails productDetails;


    @Test
    public void shouldDisplayHighLightedProductsOnWelcomePage(){
        login.as(Users.STANDARD_USER);
        List<String> productsOnDisplay = productList.titles();
        assertThat(productsOnDisplay).hasSize(6)
                .contains("Sauce Labs Backpack");
    }

    @Test
    public void hightLightedProductsShouldDisplayTheCorrespondingImages(){
        login.as(Users.STANDARD_USER);
        List<String> productsOnDisplay = productList.titles();
        SoftAssertions softly = new SoftAssertions();
        productsOnDisplay.forEach(
                 productName -> softly.assertThat(productList.imageTextForProducts(productName)).isEqualTo(productName)
                                 );
        softly.assertAll();
    }
    @Test
    public void shouldDisplayCorrectProductDetailsPage(){
        login.as(Users.STANDARD_USER);
        String ItemName = productList.titles().get(0); //se obtiene el nombre del primer articulo de la lista
        viewProductDetails.forProductWithName(ItemName);
        Serenity.reportThat("El detalle del producto seleccionado tiene el texto correcto",
                 () ->  assertThat(productDetails.productName()).isEqualTo(ItemName) //se verifica que el nombre del artículo sea igual al nombre del articulo que se seleccionó
                       );
        Serenity.reportThat("La imagen del Producto seleccionado tiene el texto Correcto",
                 () -> productDetails.productImageWithAltValueOf(ItemName).shouldBeVisible() //se verifica que la imagen del artículo se muestre correctamente, buscando la imagen con el atributo alt igual al nombre del artículo
                       );
    }


}   
