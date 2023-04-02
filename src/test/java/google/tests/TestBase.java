package google.tests;

import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Configuration.browser;

public class TestBase {

    @BeforeAll()
    public static void beforeAll() {
    browser="Edge";
    }
}
