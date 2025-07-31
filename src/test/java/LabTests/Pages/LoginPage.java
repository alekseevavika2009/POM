package LabTests.Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private static final SelenideElement title = $(".h2");
    private static final SelenideElement userName = $("#username");
    private static final SelenideElement password = $("#password");

    private static final SelenideElement loginButton = $("#doLogin");

    // проверяем корректно ли загрузился заголовок
    public void waitForPageIsLoaded() {
        title.shouldBe(visible).shouldHave(text("Login"));
    }

    // методы для заполнения поля userName, пароля. Далее, клик
    public void enterUserName(String value) {
        userName.setValue(value);
    }

    public void enterPassword(String value) {
        password.setValue(value);
    }

    public void clickLoginButton() {
        loginButton.click();
    }


}
