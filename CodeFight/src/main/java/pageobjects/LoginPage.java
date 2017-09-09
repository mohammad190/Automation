package pageobjects;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends CommonAPI{
    @FindBy(how = How.XPATH,using = "html/body/div[7]/div/div/div[2]/div/div/div/div")
    public static WebElement loginBox;

    @FindBy(how = How.XPATH,using = "html/body/div[2]/div/div/div/div/div/div/div[3]/div/div[3]/div")
    public static WebElement login;

    @FindBy(how = How.NAME,using = "username")
    public static WebElement usernameBox;

    @FindBy(how = How.NAME,using = "password")
    public static WebElement passwordBox;

    public void loginCodeFight(String email, String password){
        loginBox.click();
        usernameBox.sendKeys(email);
        passwordBox.sendKeys(password);
        login.click();

    }


}
