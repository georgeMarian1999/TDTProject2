package org.example.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class loginpage extends PageObject {

    @FindBy(name="username")
    private WebElementFacade usernameInput;

    @FindBy(name="password")
    private WebElementFacade passwordInput;

    @FindBy(className = "MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-fullWidth")
    private WebElementFacade sign_in_button;

    public void enter_credentials(String username,String password){
        usernameInput.type(username);
        passwordInput.type(password);
    }
    public void click_login(){
        sign_in_button.click();
    }
}
