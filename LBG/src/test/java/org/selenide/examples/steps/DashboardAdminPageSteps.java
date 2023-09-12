package org.selenide.examples.steps;

import io.cucumber.java.en.Given;
import org.selenide.examples.methods.DashboardAdminPage;
import org.selenide.examples.methods.DashboardPage;

import static com.codeborne.selenide.Selenide.sleep;

import java.util.List;

public class DashboardAdminPageSteps {
    @Given("Registro un usuario")
    public void registroUnUsuario(List<List<String>> userAddList) {
        DashboardAdminPage.Add();
        DashboardAdminPage.userRoleAdd();
        DashboardAdminPage.statusAdd(userAddList.get(0).get(0));
        DashboardAdminPage.passwordAdd(userAddList.get(0).get(1));
        DashboardAdminPage.confirmPasswordAdd(userAddList.get(0).get(2));
        DashboardAdminPage.usernameAdd(userAddList.get(0).get(3));
        DashboardAdminPage.employeeNameAdd(userAddList.get(0).get(4));
        DashboardAdminPage.SaveAdd();
    }

    @Given("Buscar un usuario")
    public void registroUnUsuarioAdmin(List<List<String>> userSearchList) {
        DashboardAdminPage.usernameSearch(userSearchList.get(0).get(0));
        DashboardAdminPage.Search();
    }
    @Given("Validamos Record Found")
    public void validamosRecordFound(List<List<String>> recordFoundList) {
        DashboardAdminPage.recordFound(recordFoundList.get(0).get(0));
        DashboardAdminPage.Search();
    }
    @Given("Borramos Usuario")
    public void borramosUsuario() {
        DashboardAdminPage.BorrarUsuario();
    }
}
