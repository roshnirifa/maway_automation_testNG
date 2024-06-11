import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClassroomTestRunner extends Setup{
    @BeforeTest
    public void login(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.doLogin("genie.afsanaifat+0schl@gmail.com", "P@$$w0rd");
    }
    @Test(priority = 1)
    public void createClassroom(){
        ClassroomPage classroomPage = new ClassroomPage(driver);
        classroomPage.createClassroom("test classroom", 10,"sector 10", "uttara", 1230 );

    }
}
