package serenityswag.inventory;


import net.serenitybdd.core.pages.PageObject;

import static org.assertj.core.api.Assertions.assertThat;

public class InventoryPage extends PageObject{

    public String getHeading() {
        return $(".title").getText();
    }
}
