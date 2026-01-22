package serenityswag.inventory;


import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractionSteps;


public class ViewProductDetailsActions extends UIInteractionSteps {

    @Step("View Products Details for Product '{0}'")
    public void forProductWithName(String firstItemName) {
       $(ProductList.prodctDetailsLinkFor(firstItemName)).click();
    }
}
