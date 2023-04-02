package google.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GoogleSearchPage {

    private final SelenideElement searchInput = $("input[name='q']");

    public GoogleSearchPage openPage() {
        open("https://www.google.com");
        return this;
    }

    public GoogleSearchPage searchFor(String searchTerm) {
        searchInput.setValue(searchTerm).pressEnter();
        return this;
    }
}
