package serenityswag.inventory;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import java.util.List;

public class ProductList extends PageObject {

    public List<String> titles() {
       return findAll(".inventory_item_name").textContents();
     }

    public String imageTextForProducts(String productName) {
        return $("//div[@class='inventory_item'][contains(.,'" + productName + "')]//img").getAttribute("alt");
    }

    //metodo qeu retorna como localizar el enlace de un producto en particular, se le pasa el nombre del producto y retorna un By.linkText con ese nombre, para que luego se pueda usar en el click del enlace
    public static By productDetailsLinkFor(String itemName){
        System.out.println("se recibe en productDetailsLinkFor--> " + itemName);
        //return By.linkText(itemName);}
        //return By.xpath("//a[contains(., '"+ itemName +"')]");
        //return By.xpath("//div[@class='inventory_item_name' and text()='" + itemName + "']");
       // return By.xpath("//div[@class='inventory_item_name' and text()='" + itemName + "']/preceding-sibling::a");
        // funciona pero necesito nombrar el elemento interno (no debería)
        //return By.xpath("//div[@data-test='inventory-item-name' and text()='" + itemName + "']");
        return By.xpath("//*[normalize-space(text())='" + itemName + "']");


        // return "a.inventory_item_name";
    }
}
