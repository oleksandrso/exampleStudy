package google.pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LinkedinLoginPage {
    private final SelenideElement emailInput = $("input#username");
    private final SelenideElement passwordInput = $("input#password");
    private final SelenideElement signInButton = $("button[type='submit']");

    public void openLoginPage() {
        open("https://www.linkedin.com/login");
    }

    public void enterCredentials(String email, String password) {
        emailInput.val(email);
        passwordInput.val(password);
    }

    public void clickSignInButton() {
        signInButton.click();
    }
}
