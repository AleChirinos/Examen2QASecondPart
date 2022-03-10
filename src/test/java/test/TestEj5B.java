package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pagesTodoly.LeftSection;
import pagesTodoly.LoginModal;
import pagesTodoly.MainPage;
import pagesTodoly.MenuSection;
import singleton.Session;

public class TestEj5B {
    MainPage mainPage= new MainPage();
    LoginModal loginModal= new LoginModal();
    MenuSection menuSection = new MenuSection();
    LeftSection leftSection = new LeftSection();

    @Test
    public void verifyLoginTodoLy(){
        Session.getInstance().getDriver().get("http://todo.ly/");

        //Login
        mainPage.loginImage.click();
        loginModal.emailTxtBox.setText("alecita2702@gmail.com");
        loginModal.pwdTxtBox.setText("1234567");
        loginModal.loginButton.click();
        Assertions.assertTrue(menuSection.logoutButton.isControlDisplayed(),
                "ERROR no se pudo hacer el login");

        //Recycle
        leftSection.buttonRecycle.click();
        leftSection.optionsRecycleBin.click();
        leftSection.buttonEliminarRecycle.click();

        Assertions.assertTrue(leftSection.thereAreNoElementsLabel.isControlDisplayed(),
                "Error no se pudo eliminar el Recycle");
    }
}
