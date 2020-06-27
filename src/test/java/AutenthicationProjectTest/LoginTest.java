package AutenthicationProjectTest;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Properties;
import java.util.concurrent.TimeUnit;
public class LoginTest {
    private static int globalTimeWait = Integer.parseInt(ConfProperties.getProperty("global.time.wait.second"));;
    public static LoginPage loginPage;
    public static ProfilePage profilePage;

    public static WebDriver driver;
    /**
     * осуществление первоначальной настройки
     */
    @BeforeClass
    public static void setup() {
        //определение пути до драйвера и его настройка
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
        //создание экземпляра драйвера
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        profilePage = new ProfilePage(driver);
        //окно разворачивается на полный экран
        driver.manage().window().maximize();
        //задержка на выполнение теста = 20 сек.
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait( globalTimeWait, TimeUnit.SECONDS);
        //получение ссылки на страницу входа из файла настроек
        driver.get(ConfProperties.getProperty("loginpage")); }

    @Test
    public void loginTest(){
        loginPage.clickLoginBtn();
        //Ввод логина
        loginPage.inputLogin("zr0qo@wimsg.com");
        //Ввод пароля
        loginPage.inputPasswd("KPV82r");
        loginPage.clickLoginBtnInFieldLogin();
    }
    @AfterClass
    public static void tearDown(){
        profilePage.userLogout();
        driver.quit();
    }
}