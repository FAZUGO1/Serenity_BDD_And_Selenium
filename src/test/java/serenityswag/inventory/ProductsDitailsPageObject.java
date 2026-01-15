package serenityswag.inventory;

import net.serenitybdd.core.pages.PageObject;

public class ProductsDitailsPageObject extends PageObject {
    public String productName() {
      return $(".inventory_details_name").getText();
    }
}
