package google.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class LinkedinSearchPage {

    private final SelenideElement searchInput = $("input[name='q']");
    public final String linkedinSearchPeoplePage ="https://www.linkedin.com/search/results/people/",
    secondRequestPart="?geoUrn=%5B\"101620260\"%2C\"101174742\"%2C\"102299470\"%2C\"102264497\"%2C\"103644278\"%5D&heroEntityKey=urn%3Ali%3Aautocomplete%3A402508361&keywords=it%20recruiter&origin=FACETED_SEARCH&position=1&searchId=2aa524fe-e509-496d-9600-97d642dff1ec&sid=MQS";

    private final SelenideElement firstSearchResult = $$(".search-result__wrapper").first();
    private final ElementsCollection connectButtons = $$("span.artdeco-button__text");

    public LinkedinSearchPage openLinkedinPage() {
        open(linkedinSearchPeoplePage);
        return this;
    }public LinkedinSearchPage openLinkedinSearchPage() {
        open(linkedinSearchPeoplePage +secondRequestPart);
        return this;
    }

    public ElementsCollection getConnectButtons() {
        return $$("span.artdeco-button__text").filterBy(text("Установить контакт"));
    }

    public ElementsCollection getSendButton() {
        return $$("span.artdeco-button__text").filterBy(text("Отправить"));
    }

    public void clickConnectButton(SelenideElement connectButton) {
        connectButton.click();
    }

    public void clickSendButton() {
        getSendButton().get(1).click();
    }
}
