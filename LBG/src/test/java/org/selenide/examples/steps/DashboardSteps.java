package org.selenide.examples.steps;

import io.cucumber.java.en.Given;
import org.selenide.examples.methods.DashboardPage;

public class DashboardSteps {
    @Given("Seleccionamos Admin en Dashboard")
    public void hacemosLogin() {
        DashboardPage.optionAdmin();
    }
    @Given("Cerramos Sesion")
    public void cerramosSesion() {
        DashboardPage.perfil();
        DashboardPage.cerrarSesion();
    }
}
