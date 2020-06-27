package AutenthicationProjectTest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

    public class ProfilePage {
        /**
         * конструктор класса, занимающийся инициализацией полей класса
         */
        public WebDriver driver;

        public ProfilePage(WebDriver driver) {
            PageFactory.initElements(driver, this);
            this.driver = driver;
        }
        @FindBy(xpath = "//*[@id=\"logout\"]")
        private WebElement logoutBtn;


        public void userLogout() {
            logoutBtn.click(); }
    }


