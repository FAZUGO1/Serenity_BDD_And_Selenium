package serenityswag.cart;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;

public class ShoppingCartBadge extends PageObject {
    public String count() {
       // return $(".shopping_cart_badge").getText() ;
        if ($(".shopping_cart_badge").isPresent()) {
            return $(".shopping_cart_badge").getText();
        }
        return "";
    }
}
