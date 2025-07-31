package LabTests.Tests;

import LabTests.Pages.LoginPage;
import LabTests.Pages.RoomPage;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class LabTests {
    String userLogin = "admin";
    String password = "password";

    String room = "104";
    String type = "Twin";
    String accessible = "true";
    String price = "500";
    String roomDetails = "TV";

    @BeforeAll
    public static void setUp() {
        open("https://automationintesting.online/admin");
    }

    @Test
    public void LoginTest() {
        LoginPage.waitForPageIsLoaded();

        LoginPage.enterUserName(userLogin);
        LoginPage.enterPassword(password);
        LoginPage.clickLoginButton();

        LoginPage.waitForPageIsLoaded();
    }

    @Test
    public void CreateRoomTest() {
        LoginPage.waitForPageIsLoaded();

        LoginPage.enterUserName(userLogin);
        LoginPage.enterPassword(password);
        LoginPage.clickLoginButton();

        LoginPage.waitForPageIsLoaded();

        RoomPage.waitForRoomPageIsLoaded();

        RoomPage.enterRoom(room);
        RoomPage.enterType(type);
        RoomPage.enterAccessible(accessible);
        RoomPage.enterPrice(price);
        RoomPage.enterRoomDetails(roomDetails);

        RoomPage.clickCreateButton();

        RoomPage.waitForRoomPageIsLoaded();
    }


}
