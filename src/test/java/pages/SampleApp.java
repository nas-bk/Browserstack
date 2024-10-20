package pages;

import static data.TestData.*;

public class SampleApp {

    public static String querySearch(String query){
        TEXT_BUTTON.click();
        TEXT_INPUT.click();
        TEXT_INPUT.sendKeys(query);
        TEXT_INPUT.pressEnter();
        return TEXT_OUTPUT.getText();
    }
}
