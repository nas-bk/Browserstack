package tests.android;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import tests.TestBase;

import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;
import static screens.Wikipedia.*;


public class AndroidTest extends TestBase {
    String result;

    @Tag("android")
    @CsvFileSource(resources = "/data.csv", numLinesToSkip = 1)
    @ParameterizedTest
    void unsuccessfulOpenArticleTest(String searchQuery) {

        step("Type search", () ->
                searchQuery(searchQuery));

        step("Verify content found", () ->
                assertThat(TEXT_VIEW)
                        .hasSizeGreaterThan(0));

        step("Open a random article", () ->
                result = openRandomArticle());

        step("Check for errors", () ->
                assertThat(result)
                        .isEqualTo("An error occurred"));

    }
}
