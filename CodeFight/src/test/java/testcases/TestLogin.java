package testcases;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageobjects.LoginPage;

public class TestLogin extends CommonAPI {

    @Test
    public void loginCodeFight() {

        LoginPage codeLogin = PageFactory.initElements(driver, LoginPage.class);
        codeLogin.loginCodeFight("sujondpi@yahoo.com","0191");


    }
}
