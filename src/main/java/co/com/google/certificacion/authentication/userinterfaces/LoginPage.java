package co.com.google.certificacion.authentication.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    public static final Target USERNAME_INPUT = Target.the("Username field input").located(By.id("user-name"));
    public static final Target PASSWORD_INPUT = Target.the("Password field input").located(By.id("password"));
    public static final Target LOGIN_BUTTON = Target.the("Authentication Button").located(By.id("login-button"));

}
