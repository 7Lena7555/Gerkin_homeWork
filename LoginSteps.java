package atqc.stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginSteps {
        private static final String USER_NAME = "User1";
        private static final String USER_PASSWORD = "123DFG";{
        ChromeDriver driver=new ChromeDriver;
        WebDriverWait wait=new WebDriverWait(driver,6);
        driver.manage().window().maximize();

        }




@Given(" home_page \"(https://lms.itca.if.ua\"is opened")
public void verifyPageIsOpened(String pageName){
        driver.manage().window().maximize();
        driver.get(pageName);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath()));

        Assert.assertEquals(driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/h2[1]")).getText(),pageName,"Page is opened");

        }


@When("user writes \"User1\" and \"cvbDFG\"")
public void typeLoginCredentials(String login,String password){
        driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[2])).sendKeys(login)";
        driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[3])).sendKeys(password)";
        }

@Then("verify user is logged in")
public void verifyUserIsLoggedIn(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/button[1]")));
        Assert.assertEquals();
        }
}
