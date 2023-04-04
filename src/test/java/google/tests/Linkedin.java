package google.tests;


import com.codeborne.selenide.CollectionCondition;
import google.pages.GoogleSearchPage;
import google.pages.LinkedinSearchPage;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.sleep;

public class Linkedin extends TestBase {


    private final LinkedinSearchPage linkedinSearchPage = new LinkedinSearchPage();
    String testData = "Selenide";

    @Test
    public void searchTest() {

        linkedinSearchPage.openLinkedinPage();


//        $$(".g")
//                .shouldHave(CollectionCondition.sizeGreaterThan(0))
//                .first()
//                .shouldHave(text(testData));
    }
}
