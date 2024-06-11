import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Schedule {
    @FindBy(className = "pl-s12")
    List<WebElement> menuItems; // 7
    @FindBy(using="button")
    List<WebElement> createClassBtn; //2

    @FindBy(tagName="select")
    List<WebElement> categoryDropdown; // 0

   // @FindBy(="")
    List<WebElement> chooseCategory;

    public Schedule(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    public void createClass(){
        menuItems.get(7).click();
        createClassBtn.get(2).click();
        categoryDropdown.get(0).click();

    }

}
