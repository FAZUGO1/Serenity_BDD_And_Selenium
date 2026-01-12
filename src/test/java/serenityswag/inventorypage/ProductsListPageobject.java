package serenityswag.inventorypage;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsListPageobject extends PageObject {
  public List<String> titles() {
      //return findAll(By.className("inventory_item_name")).textContents();
       // tembien se puede usar
      return findAll(".inventory_item_name").textContents();
    }

}
