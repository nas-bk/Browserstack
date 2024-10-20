package pages;

import static com.codeborne.selenide.Selenide.$;
import static data.RandomNumber.getRandomNumber;
import static data.TestData.*;
import static io.appium.java_client.AppiumBy.accessibilityId;

public class Wikipedia {

    public static void searchQuery(String query) {

        $(accessibilityId("Search Wikipedia")).click();
        SEARCH_BAR_ELEMENT
                .sendKeys(query);
    }

    public static String openRandomArticle() {

        var numberArticles = getRandomNumber(TITLE_LIST.size());
        TITLE_LIST
                .get(numberArticles)
                .click();
        return TEXT_VIEW
                .get(0)
                .getAttribute("text");
    }

}
