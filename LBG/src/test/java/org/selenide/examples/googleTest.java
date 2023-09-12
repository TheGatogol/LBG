package org.selenide.examples;

import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class googleTest {
    @Test
    public void busqueda() {
        open("https://google.com");
        $(By.name("q")).setValue("Selenide").pressEnter();
        sleep(10000);
    }
}
