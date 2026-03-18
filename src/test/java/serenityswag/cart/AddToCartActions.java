package serenityswag.cart;

import net.serenitybdd.annotations.Step;
import org.openqa.selenium.By;
import net.serenitybdd.core.steps.UIInteractionSteps;
import serenityswag.inventory.ProductList;

public class AddToCartActions extends UIInteractionSteps
{
    @Step("Add to cart the product '{0}'")
    public void item(String itemName) {
       // return By.xpath("//div[@data-test='shopping_cart_link' and text()='" + itemName + "']").click();
      $(ProductList.addToCartButtonFor(itemName)).click();
       }


}
