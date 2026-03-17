package serenityswag.inventory;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementState;

public class ProductsDetails extends PageObject {

    public String productName() {
       // return $(".inventory_item_name").getText(); nombre de la clase cambió
       // return $("//*[@class='inventory_details_name large_size']").getText();
      // sin indicar el nombre específico de la clase, pero indicando que el texto no esté dentro de un script o style, y que contenga en su clase 'name' o 'title'
        return find(By.xpath("//*[normalize-space(text()) and not(self::script) and not(self::style)]"
                + "[contains(@class,'name') or contains(@class,'title')]")).getText();

    }

    public WebElementState productImageWithAltValueOf(String ItemName) {
        return find(By.cssSelector(".inventory_details_container img[alt='"+ItemName+"']"));
       // return $(".inventory_details_container img[alt='" + ItemName + "']");
       }
}
