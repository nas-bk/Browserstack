package data;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.appium.java_client.AppiumBy.*;

public class TestData {

    public static final String QUERY = "Appium";

    public static final SelenideElement SEARCH_BAR_ELEMENT = $(id("org.wikipedia.alpha:id/search_src_text"));
    public static final ElementsCollection TEXT_VIEW = $$(className("android.widget.TextView"));
    public static final ElementsCollection TITLE_LIST = $$(id("org.wikipedia.alpha:id/page_list_item_title"));

    public static final SelenideElement TEXT_BUTTON = $(accessibilityId("Text Button"));
    public static final SelenideElement TEXT_INPUT = $(accessibilityId("Text Input"));
    public static final SelenideElement TEXT_OUTPUT = $(accessibilityId("Text Output"));
}
