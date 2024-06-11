import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    @FindBy( name = "email")
    WebElement txtEmail;
    @FindBy (name = "password")
    WebElement txtPassword;
    @FindBy  (tagName = "button")
    WebElement btnLogin;

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    public void doLogin(String email, String password){
        txtEmail.sendKeys(email);
        txtPassword.sendKeys(password);
        btnLogin.click();
    }
}
