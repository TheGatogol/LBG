package org.selenide.examples.steps;

import io.cucumber.java.en.Given;
import org.selenide.examples.methods.LoginPage;

import java.util.List;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class LoginPageSteps {
    @Given("Ingresamos a OrangeHRM")
    public void ingresamosAOrangeHRM() {
        LoginPage.abrimosUlr();
    }

    @Given("Hacemos login")
    public void hacemosLogin(List<List<String>> loginList) {
        LoginPage.username(loginList.get(0).get(0));
        LoginPage.password(loginList.get(0).get(1));
        LoginPage.login();
    }
    @Given("Esperamos cinco segundos")
    public void esperamosCincoSegundos() {
        sleep(5000);
    }
}
