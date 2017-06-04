import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BusinessDef extends Config{

    public static void launchWebsite(){
        driver.get(envProp.getProperty("URL"));
    }

    public void enterText(String enterText, String userInput){
        WebElement et=driver.findElement(By.xpath(objProp.getProperty(enterText)));
        et.sendKeys(userInput);
    }
    public void click(String click){
        WebElement ck=driver.findElement(By.xpath(objProp.getProperty(click)));
        ck.click();
    }
}
