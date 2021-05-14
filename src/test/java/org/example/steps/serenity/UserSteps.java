package org.example.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.example.pages.loginpage;
import org.openqa.selenium.WebDriver;

public class UserSteps {
    loginpage loginpage;
    WebDriver webDriver;


    @Step
    public void enters_credentials(String username,String password) {
        loginpage.enter_credentials(username,password);
    }
    @Step
    public void press_sign_in(){
        loginpage.click_login();
    }
    @Step
    public void is_the_login_page() {

    }
    @Step
    public void login(String username,String password){
        enters_credentials(username, password);
        press_sign_in();
    }
}
