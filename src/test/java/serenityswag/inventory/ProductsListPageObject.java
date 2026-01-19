package serenityswag.inventory;

import net.serenitybdd.core.pages.PageObject;
import org.assertj.core.api.AbstractBigDecimalAssert;
import org.openqa.selenium.By;

import java.util.List;

public class ProductsListPageObject extends PageObject {
  public List<String> titles() {
      //return findAll(By.className("inventory_item_name")).textContents();
       // tembien se puede usar
      return findAll(".inventory_item_name").textContents();
    }

    public void openProductDetailsFor(String itemName) {
        find(By.linkText(itemName)).click();

    }

    public String imageTextForProducts(String productName) {
      //return find(By.xpath("//div[@class='inventory_item'][contains(.,'"+productName+"')]//img")).getAttribute("alt");
      return $("//div[@class='inventory_item'][contains(.,'"+productName+"')]//img").getAttribute("alt");

    }
}
