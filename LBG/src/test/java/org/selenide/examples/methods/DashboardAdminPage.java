package org.selenide.examples.methods;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.eo.Se;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class DashboardAdminPage {

    /*** INPUT ID ***/
    public static final SelenideElement inputPasswordAdd = $(byXpath("(//input[@type='password'])[1]"));
    public static final SelenideElement inputEmployeeNameAdd = $(byXpath("//input[@placeholder='Type for hints...']"));
    public static final SelenideElement inputUsernameAdd = $(byXpath("(//input[contains(@autocomplete,'off')])[1]"));
    public static final SelenideElement inputConfirmPasswordAdd = $(byXpath("(//input[@type='password'])[2]"));
    public static final SelenideElement inputUsername = $(byXpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]"));
    public static final SelenideElement inputEmployeeName = $(byXpath("//input[@placeholder='Type for hints...']"));

    /** SELECT ID **/
    public static final SelenideElement selectUserRoleAdd = $(byXpath("(//div[contains(.,'-- Select --')])[14]"));
    public static final SelenideElement selectStatusAdd = $(byXpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]"));
    public static final SelenideElement selectUserRole = $(byXpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]"));
    public static final SelenideElement selectStatus = $(byXpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[2]"));

    public static final SelenideElement optionAdmin = $(byXpath("(//span[contains(.,'Admin')])[3]"));
    /** BUTTON ID **/
    public static final SelenideElement buttonAdd = $(byXpath("//button[contains(.,'Add')]"));
    public static final SelenideElement buttonSave = $(byXpath("//button[contains(.,'Save')]"));
    public static final SelenideElement buttonSearch = $(byXpath("//button[contains(.,'Search')]"));
    public static final SelenideElement buttonTrash = $(byXpath("//i[@class='oxd-icon bi-trash']"));
    public static final SelenideElement confirmarDelete = $(byXpath("//button[contains(.,'Yes, Delete')]"));



    /** INPUT METHODS **/
    public static void employeeNameAdd(String employeeNameAddValue) {
        inputEmployeeNameAdd.shouldBe(Condition.visible, Duration.ofSeconds(10));
        inputEmployeeNameAdd.setValue(employeeNameAddValue);

        $(byXpath("//span[contains(.,'Odis  Adalwin')]")).shouldBe(Condition.visible, Duration.ofSeconds(10));
        $(byXpath("//span[contains(.,'Odis  Adalwin')]")).click();
    }
    public static void usernameAdd(String userNameAddValue) {
        inputUsernameAdd.shouldBe(Condition.visible, Duration.ofSeconds(10));
        inputUsernameAdd.setValue(userNameAddValue);
    }
    public static void passwordAdd(String passwordAddValue) {
        inputPasswordAdd.shouldBe(Condition.visible, Duration.ofSeconds(10));
        inputPasswordAdd.setValue(passwordAddValue);
    }
    public static void confirmPasswordAdd(String confirmPasswordAddValue) {
        inputConfirmPasswordAdd.shouldBe(Condition.visible, Duration.ofSeconds(10));
        inputConfirmPasswordAdd.setValue(confirmPasswordAddValue);
    }
    public static void usernameSearch(String userNameValue) {
        inputUsername.shouldBe(Condition.visible, Duration.ofSeconds(10));
        inputUsername.setValue(userNameValue);
    }
    public static void employeeNameSearch(String employeeNameValue) {
        inputEmployeeName.shouldBe(Condition.visible, Duration.ofSeconds(10));
        inputEmployeeName.setValue(employeeNameValue);

        $(byXpath("(//div[contains(.,'Odis  Adalwin')])[15]")).shouldBe(Condition.visible, Duration.ofSeconds(10));
        $(byXpath("(//div[contains(.,'Odis  Adalwin')])[15]")).click();
    }

    /** SELECT METHODS **/
    public static void userRoleAdd() {
        selectUserRoleAdd.shouldBe(Condition.visible, Duration.ofSeconds(10));
        selectUserRoleAdd.click();

        optionAdmin.shouldBe(Condition.visible, Duration.ofSeconds(10));
        optionAdmin.click();
    }
    public static void statusAdd(String statusAddValue) {
        selectStatusAdd.shouldBe(Condition.visible, Duration.ofSeconds(10));
        selectStatusAdd.click();

        $(byText(statusAddValue)).shouldBe(Condition.visible, Duration.ofSeconds(10));
        $(byText(statusAddValue)).click();
    }
    public static void userRoleSearch() {
        selectUserRole.shouldBe(Condition.visible, Duration.ofSeconds(20));
        selectUserRole.click();

        $(byXpath("//div[contains(.,'Admin')])[19]")).shouldBe(Condition.visible, Duration.ofSeconds(20));
        $(byXpath("//div[contains(.,'Admin')])[19]")).click();
    }
    public static void statusSearch(String statusValue) {
        selectStatus.shouldBe(Condition.visible, Duration.ofSeconds(10));
        selectStatus.click();

        $(byText(statusValue)).shouldBe(Condition.visible, Duration.ofSeconds(10));
        $(byText(statusValue)).click();
    }

    /** BUTTON METHODS **/
    public static void SaveAdd() {
        buttonSave.shouldBe(Condition.visible, Duration.ofSeconds(10));
        buttonSave.click();
    }
    public static void Add() {
        buttonAdd.shouldBe(Condition.visible, Duration.ofSeconds(10));
        buttonAdd.click();
    }
    public static void Search() {
        buttonSearch.shouldBe(Condition.visible, Duration.ofSeconds(10));
        buttonSearch.click();
    }
    public static void BorrarUsuario() {
        buttonTrash.shouldBe(Condition.visible, Duration.ofSeconds(10));
        buttonTrash.click();

        confirmarDelete.shouldBe(Condition.visible, Duration.ofSeconds(10));
        confirmarDelete.click();
    }

    /** MESSAGES METHODS **/
    public static void recordFound(String recordFoundValue) {
        $(byText(recordFoundValue)).shouldBe(Condition.visible, Duration.ofSeconds(10));
    }
}
