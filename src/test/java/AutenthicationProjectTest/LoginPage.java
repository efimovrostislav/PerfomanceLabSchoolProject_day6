package AutenthicationProjectTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public WebDriver driver;
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    @FindBy(id = "header-lk-button")
    private WebElement loginBtn;

    @FindBy(id = "mobileAvatar")
    private WebElement mobileAvatar;

    @FindBy(xpath = "//*[@id=\"login\"]")
    private WebElement loginField;

    @FindBy(xpath = "//*[@id=\"form_auth\"]/input[2]")
    private WebElement passwordField;
//    @FindBy(id = "login")
//    private WebElement loginFiled;              //поле для ввода логина при входе
//
//    @FindBy(css = "[type=password]")
//    private WebElement passwordField;           //поле для ввода пароля

    @FindBy(xpath = "//*[@id=\"form_auth\"]/button")
    private WebElement loginBtnInField;

    public void inputLogin(String login) {
        loginField.click();
        loginField.sendKeys(login); }

    public void inputPasswd(String passwd) {
        passwordField.click();
        passwordField.sendKeys(passwd); }

    public void clickLoginBtn(){
        if(loginBtn.isDisplayed()){
            loginBtn.click();
        }else mobileAvatar.click();
    }

    public void clickLoginBtnInFieldLogin(){
        loginBtnInField.click();
    }
}
