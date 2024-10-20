package tests.ios;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import tests.TestBase;

import static data.TestData.QUERY;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;
import static pages.SampleApp.querySearch;

public class IosTest extends TestBase {
    String result;

    @Tag("ios")
    @Test
    void searchTest() {

        step("Type search", () ->
                result = querySearch(QUERY));

        step("Verify result", () ->
                assertThat(result).isEqualTo(QUERY));
    }
}
