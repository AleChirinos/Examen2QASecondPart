package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pagesTodoist.OpcionesCuenta;
import pagesTodoist.PaginaInicio;
import pagesTodoist.PaginaLogin;
import pagesTodoist.PaginaPrincipal;
import singleton.Session;


public class TestEj6B {
    PaginaInicio paginaInicio = new PaginaInicio();
    PaginaLogin paginaLogin = new PaginaLogin();
    PaginaPrincipal paginaPrincipal = new PaginaPrincipal();
    OpcionesCuenta opcionesCuenta = new OpcionesCuenta();

    @Test
    public void verify_login_todoly() {

        Session.getInstance().getDriver().get("https://todoist.com/");

        //Login
        paginaInicio.buttonLogin.click();
        paginaLogin.emailTextBox.clearSetText("alecita2702@gmail.com");
        paginaLogin.passwordTextBox.clearSetText("Pass1234567Ale*");
        paginaLogin.botonIniciarSesion.click();
        paginaPrincipal.configurationButton.click();

        Assertions.assertTrue(opcionesCuenta.logoutButton.isControlDisplayed());

        //Logout
        opcionesCuenta.logoutButton.click();

        Assertions.assertTrue(paginaInicio.buttonLogin.isControlDisplayed());
    }
}
