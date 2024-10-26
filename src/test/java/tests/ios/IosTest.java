package tests.ios;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import tests.TestBase;

import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;
import static screens.SampleApp.querySearch;

public class IosTest extends TestBase {
    String result;

    @Tag("ios")
    @CsvFileSource(resources = "/data.csv", numLinesToSkip = 1)
    @ParameterizedTest
    void searchTest(String searchQuery) {

        step("Type search", () ->
                result = querySearch(searchQuery));

        step("Verify result", () ->
                assertThat(result).isEqualTo(searchQuery));
    }
}
