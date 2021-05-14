package org.example.features.login;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.example.steps.serenity.UserSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

@RunWith(SerenityRunner.class)
//@UseTestDataFrom("src/test/resources/logindata.csv")
public class loginApp {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    UserSteps user;

    String username="george.marian@stud.ubbcluj.ro";
    String password="Aa#123456";

    @Issue("#LOGIN-1")
    @Test
    public void perform_login() throws InterruptedException {
        webdriver=new ChromeDriver();
        webdriver.get("https://" + "lhdemo" + ":" + "20LHdemo21!" + "@" +"lighthouse-demo.evozon.com/login");
//        user.is_the_login_page();

        Thread.sleep(3000);
        webdriver.findElement(By.ByName.name("username")).sendKeys(username);
        webdriver.findElement(By.name("password")).sendKeys(password);
        webdriver.findElement(By.tagName("button")).click();
        Thread.sleep(20000);
        //user.login(username,password);
        webdriver.quit();

    }

}
