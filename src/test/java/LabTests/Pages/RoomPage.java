package LabTests.Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class RoomPage {
    private static final SelenideElement title = $(".navbar-brand");
    private static final SelenideElement room = $x("//*[@id=\"root-container\"]/div/div/div/div[1]/div[1]/p");
    private static final SelenideElement type = $x("//*[@id=\"root-container\"]/div/div/div/div[1]/div[2]/p");
    private static final SelenideElement accessible = $x("//*[@id=\"root-container\"]/div/div/div/div[1]/div[3]/p");
    private static final SelenideElement price = $x("//*[@id=\"root-container\"]/div/div/div/div[1]/div[4]/p");
    private static final SelenideElement roomDetails = $x("//*[@id=\"root-container\"]/div/div/div/div[1]/div[5]/p");

    private static final SelenideElement createButton = $("#createRoom");


    public static void waitForRoomPageIsLoaded() {
        title.shouldBe(visible).shouldHave(text("Restful Booker Platform Demo"));
    }

    public static void checkRoom() {
        room.shouldBe(visible).shouldHave(text("Room"));
    }

    public static void checkType() {
        type.shouldBe(visible).shouldHave(text("Type"));
    }

    public static void checkAccessible() {
        accessible.shouldBe(visible).shouldHave(text("Accessible"));
    }

    public static void checkPrice() {
        price.shouldBe(visible).shouldHave(text("Price"));
    }

    public static void checkRoomDetails() {
        roomDetails.shouldBe(visible).shouldHave(text("Room details"));
    }

    public static void enterRoom(String value) {
        room.setValue(value);
    }

    public static void enterType(String value) {
        type.setValue(value);
    }

    public static void enterAccessible(String value) {
        accessible.setValue(value);
    }

    public static void enterPrice(String value) {
        price.setValue(value);
    }

    public static void enterRoomDetails(String value) {
        roomDetails.setValue(value);
    }

    public static void clickCreateButton() {
        createButton.click();
    }

}
