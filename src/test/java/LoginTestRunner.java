import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class LoginTestRunner extends Setup {
    @Test
    public void doLogin(){
        LoginPage loginPage =new LoginPage(driver);
        loginPage.doLogin("genie.afsanaifat+0schl@gmail.com", "P@$$w0rd");

        WebElement actual =driver.findElement(By.className("page_title"));
         String expected = "Dashboard";
         Assert.assertEquals(expected, actual.getText());
    }
    public void doLoginWithWrongCred(){
        LoginPage loginPage =new LoginPage(driver);
        loginPage.doLogin("genie.afsanaifat+0schl@gmail.com", "P@$$wrd");

    }
}
