import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ClassroomPage {
    @FindBy(className = "pl-s12")
    List<WebElement> menuItems; // 8
    @FindBy(className="relative")
    List<WebElement> ClassroomBtn; //1
    @FindBy(tagName="input")
    List<WebElement> classRoomName; //1
    @FindBy(tagName="input")
    List<WebElement> writeCapacity; //2
    @FindBy(tagName="input")
    List<WebElement> writeAddress; //3
    @FindBy(tagName="input")
    List<WebElement> WriteCity; //4
    @FindBy(tagName="input")
    List<WebElement> writeZipcode; //5
    @FindBy(className="relative")
    List<WebElement> submit; //10

    @FindBy(className = "body_text")
    List<WebElement> addedClassroom; //0

    public ClassroomPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void createClassroom(String classroomName, int capacity, String address, String city, int zipcode){
        menuItems.get(8).click();
        ClassroomBtn.get(3).click();
        classRoomName.get(1).sendKeys(classroomName);
        writeCapacity.get(2).sendKeys(Integer.toString(capacity));
        writeAddress.get(3).sendKeys(address);
        WriteCity.get(4).sendKeys(city);
        writeZipcode.get(5).sendKeys(Integer.toString(zipcode));
        submit.get(10).click();

    }

}
