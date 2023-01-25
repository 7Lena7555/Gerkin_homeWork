import net.serenitybdd.core.annotations.findby.FindBy;

public class PublicPage {
@FindBy(xpath = "//h2")
    public WebElementFacade loginInput;

    public void typeLogin(String login) {
        loginInput.sendKeys(login)
}
