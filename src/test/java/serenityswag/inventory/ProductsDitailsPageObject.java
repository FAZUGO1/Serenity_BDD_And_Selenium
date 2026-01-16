package serenityswag.inventory;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementState;
import org.openqa.selenium.By;

public class ProductsDitailsPageObject extends PageObject {
    public String productName() {
      return $(".inventory_details_name").getText();
    }

    public WebElementState productImageWithAltValueOf(String ItemName) {
       // return find(By.cssSelector(".inventory_details_container img[alt='"+ItemName+"']"));
       // return $(".inventory_details_container img[alt='"+ItemName+"']");
        return $("css:img[alt='"+ItemName+"']");
    }
}
