package google.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.junit5.ScreenShooterExtension;
import google.pages.LinkedinLoginPage;
import google.pages.LinkedinSearchPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import utils.ConfigReader;

@ExtendWith(ScreenShooterExtension.class)
public class LinkedinLoginTest extends TestBase {
    private final ConfigReader configReader = new ConfigReader();
    private final LinkedinLoginPage linkedinLoginPage = new LinkedinLoginPage();
    private final LinkedinSearchPage linkedinSearchPage = new LinkedinSearchPage();


    @BeforeEach
    public void setUp() {
        linkedinLoginPage.openLoginPage();
    }

    @Test
    public void loginTest() {
        String username = configReader.get("linkedin.username");
        String password = configReader.get("linkedin.password");

        linkedinLoginPage.enterCredentials(username, password);
        linkedinLoginPage.clickSignInButton();
    }

    @Test
    public void loginSearchPage() {
        String username = configReader.get("linkedin.username");
        String password = configReader.get("linkedin.password");

        linkedinLoginPage.enterCredentials(username, password);
        linkedinLoginPage.clickSignInButton();

        linkedinSearchPage.openLinkedinSearchPage();
            linkedinSearchPage.getConnectButtons().forEach(connectButton -> {
            linkedinSearchPage.clickConnectButton(connectButton);
            linkedinSearchPage.clickSendButton();
        });
    }
}
