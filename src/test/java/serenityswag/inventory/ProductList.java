package serenityswag.inventory;

import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;
import org.assertj.core.api.AbstractBigDecimalAssert;
import java.util.List;

public class ProductList extends PageObject {

    public List<String> titles() {
       return findAll(".inventory_item_name").textContents();
    }
    public String imageTextForProducts(String productName) {
        return $("//div[@class='inventory_item'][contains(.,'"+productName+"')]//img").getAttribute("alt");

    }

    public static By prodctDetailsLinkFor(String itemName){
        return By.linkText(itemName);

    }
}
