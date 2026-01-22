package serenityswag.inventory;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Steps;
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
    //ProductsListPageObject productsList;
   //***** cambiamos ProductsListPageObject XProductList
    ProductList productsList;
    ProductsDitails productDetails;

    @Test
    public void shouldDisplayHighLightedProductsOnWelcomePage(){
        login.as(Users.STANDARD_USER);
        List<String> productsOnDisplay = productsList.titles();
        assertThat(productsOnDisplay).hasSize(6)
                .contains("Sauce Labs Backpack");
    }

    @Test
    public void hightLightedProductsShouldDisplayTheCorrespondingImages(){
        login.as(Users.STANDARD_USER);
        List<String> productsOnDisplay = productsList.titles();
        SoftAssertions softly = new SoftAssertions();
        productsOnDisplay.forEach(
                 productName -> softly.assertThat(productsList.imageTextForProducts(productName)).isEqualTo(productName)
                                 );
        softly.assertAll();
    }
    @Test
    public void shouldDisplayCorrectProductDetailsPage(){
        login.as(Users.STANDARD_USER);
        String firstItemName = productsList.titles().get(0);
       // productsList.openProductDetailsFor(firstItemName);
        viewProductDetails.forProductWithName(firstItemName);

        assertThat(productDetails.productName()).isEqualTo(firstItemName);
        productDetails.productImageWithAltValueOf(firstItemName).shouldBeVisible();
    }


}
