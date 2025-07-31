package LabTests.Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import  static com.codeborne.selenide.Selenide.$x;

public class RoomPage {
    private  final SelenideElement title = $(".navbar-brand");
    private  final SelenideElement room = $("[data-testid = 'room-number']");
    private  final SelenideElement type =  $("[data-testid = 'type']");
    private final SelenideElement accessible =  $("[data-testid = 'accessible']");
    private final SelenideElement price = $("[data-testid = 'price']");
    private final SelenideElement roomDetails = $("[data-testid = 'room-details']");

    private final SelenideElement createButton = $("#createRoom");


    public void waitForPageIsLoaded() {
        title.shouldBe(visible);
    }


    public void checkRoom() {
        room.shouldBe(visible).shouldHave(text("Room"));
    }

    public void checkType() {
        type.shouldBe(visible).shouldHave(text("Type"));
    }

    public void checkAccessible() {
        accessible.shouldBe(visible).shouldHave(text("Accessible"));
    }

    public void checkPrice() {
        price.shouldBe(visible).shouldHave(text("Price"));
    }

    public void checkRoomDetails() {
        roomDetails.shouldBe(visible).shouldHave(text("Room details"));
    }

    public void enterRoom(String value) {
        room.setValue(value);
    }

    public void enterType(String value) {
        type.setValue(value);
    }

    public void enterAccessible(String value) {
        accessible.setValue(value);
    }

    public  void enterPrice(String value) {
        price.setValue(value);
    }

    public void enterRoomDetails(String value) {
        roomDetails.setValue(value);
    }

    public void clickCreateButton() {
        createButton.click();
    }
    public void createRoom(String number) {
        room.setValue(number);
        createButton.click();
    }

}
