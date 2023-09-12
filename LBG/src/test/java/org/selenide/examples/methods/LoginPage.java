package org.selenide.examples.methods;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

import java.time.Duration;

public class LoginPage {
    public static final SelenideElement inputUsername = $(byName("username"));
    public static final SelenideElement inputPassword = $(byName("password"));
    public static final SelenideElement buttonLogin = $(byXpath("//button[@type='submit'][contains(.,'Login')]"));

    public static void abrimosUlr(){
        open("https://opensource-demo.orangehrmlive.com/");
    }
    public static void username(String userNameValue){
        inputUsername.shouldBe(Condition.visible, Duration.ofSeconds(10));
        inputUsername.setValue(userNameValue);
    }
    public static void password(String passwordValue){
        inputPassword.shouldBe(Condition.visible, Duration.ofSeconds(10));
        inputPassword.setValue(passwordValue);
    }
    public static void login(){
        buttonLogin.shouldBe(Condition.visible, Duration.ofSeconds(10));
        buttonLogin.click();
    }
}
