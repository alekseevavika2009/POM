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
        LoginPage page = new LoginPage();
        page.waitForPageIsLoaded();

        page.enterUserName(userLogin);
        page.enterPassword(password);
        page.clickLoginButton();

        page.waitForPageIsLoaded();
    }

    @Test
    public void CreateRoomTest() {
        LoginPage page = new LoginPage();
    
        page.waitForPageIsLoaded();

        page.enterUserName(userLogin);
        page.enterPassword(password);
        page.clickLoginButton();

        page.waitForPageIsLoaded();
        
        RoomPage roomPage = new RoomPage();

        roomPage.waitForPageIsLoaded();

        roomPage.enterRoom(room);
        roomPage.enterType(type);
        roomPage.enterAccessible(accessible);
        roomPage.enterPrice(price);
        roomPage.enterRoomDetails(roomDetails);

        roomPage.clickCreateButton();

        roomPage.waitForRoomPageIsLoaded();
    }


