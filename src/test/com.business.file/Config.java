import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

public class Config {

    static Properties envProp = new Properties();
    static Properties objProp = new Properties();
    static WebDriver driver;

    public static void callProperties() throws IOException {

        String environmentPropertyFileLocation = System.getProperty("user.dir")
                + "\\src\\main\\resources\\Environment.properties";
        String objectRepoFileLocation = System.getProperty("user.dir")
                + "\\src\\main\\resources\\ObjectRepo.properties";
        FileInputStream efis = new FileInputStream(environmentPropertyFileLocation);
        FileInputStream ofis = new FileInputStream(objectRepoFileLocation);
        System.out.println("\n" + environmentPropertyFileLocation + " - This is environment property file" + "\n");
        System.out.println("\n" + objectRepoFileLocation + " - This is objectRepo property file" + "\n");
        try {
            if (environmentPropertyFileLocation != null || objectRepoFileLocation != null) {
                envProp.load(efis);
                objProp.load(ofis);
            } else {
                throw new FileNotFoundException("property file " +
                        "not found in the mentioned classpath" +"\n");
            }
        } catch (FileNotFoundException fnfe) {
            System.out.println(fnfe + "\n");
        }
        Date time = new Date(System.currentTimeMillis());
        System.out.println(time + " - Executed at this time" + "\n");
    }

    public static void launchBrowser() throws Exception {
        try {
            String chromeDriverLocation = System.getProperty("user.dir")
                    + "\\src\\main\\resources\\chromedriver.exe";

            System.out.println(envProp.getProperty("BROWSERTYPE")
                    + " - This is your current selected browser" + "\n");

            if (envProp.getProperty("BROWSERTYPE").equalsIgnoreCase("Chrome")
                    && chromeDriverLocation != null) {
                System.setProperty("webdriver.chrome.driver",
                        chromeDriverLocation);
                driver = new ChromeDriver();
            } else {
                throw new IllegalStateException("The "
                        + chromeDriverLocation
                        + " not found in the mentioned classpath"
                        + "OR"
                        + "Incorrect name mentioned for BROWSERTYPE in Environment.properties file");

            }
        } catch (Exception ise) {
//            String st =ise.getMessage();
//            System.out.println(st);
            System.out.println(ise + "\n");
        }
    }
}
