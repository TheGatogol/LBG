package org.selenide.examples.methods;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class DashboardPage {

    public static final SelenideElement optionAdmin = $(byXpath("(//span[contains(.,'Admin')])[1]"));

    public static final SelenideElement optionPerfil = $(byXpath("//p[contains(.,'Paul Collings')]"));
    public static final SelenideElement buttonCerrarSesion = $(byXpath("//a[contains(.,'Logout')]"));

    public static void optionAdmin (){
        optionAdmin.shouldBe(Condition.visible, Duration.ofSeconds(10));
        optionAdmin.click();
    }
    public static void perfil (){
        optionPerfil.shouldBe(Condition.visible, Duration.ofSeconds(10));
        optionPerfil.click();
    }
    public static void cerrarSesion (){
        buttonCerrarSesion.shouldBe(Condition.visible, Duration.ofSeconds(10));
        buttonCerrarSesion.click();
    }
}
