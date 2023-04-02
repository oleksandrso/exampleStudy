package google.tests;


import com.codeborne.selenide.CollectionCondition;
import google.pages.GoogleSearchPage;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$;

public class GoogleSearchTest extends TestBase {


    private final GoogleSearchPage googleSearchPage = new GoogleSearchPage();
    String testData = "Selenide";

    @Test
    public void searchTest() {

        googleSearchPage
                .openPage()
                .searchFor(testData);

        $$(".g")
                .shouldHave(CollectionCondition.sizeGreaterThan(0))
                .first()
                .shouldHave(text(testData));
    }
}
