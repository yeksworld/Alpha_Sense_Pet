package Pet_Tester.Page;

import Pet_Tester.POJOs.addingPetBody.RequestPetBody;
import Pet_Tester.Utilities.BrowserUtils;
import Pet_Tester.Utilities.ConfigurationReader;
import Pet_Tester.Utilities.Driver;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    public MainPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    public void launchTheApp(){
        Driver.get().get(ConfigurationReader.get("url"));
        Driver.get().manage().window().maximize();
        BrowserUtils.waitForVisibility(putButton,10);
    }

    @FindBy(xpath = "//div[contains(text(),'Add a new pet to the store')]")
    public WebElement putButton;

    @FindBy(xpath = "//button[@class='btn try-out__btn']")
    public WebElement try_it_outButton;

    @FindBy(xpath = "//textarea[@class='body-param__text']")
    public WebElement text;

    @FindBy(xpath = "//button[@class='btn execute opblock-control__btn']")
    public WebElement executeButton;

    public void clickPutButton() {
        putButton.click();
        BrowserUtils.waitForVisibility(try_it_outButton,10);
    }

    public void try_it_outButton(){
        try_it_outButton.click();
        BrowserUtils.waitForVisibility(text,10);
    }

    public void send_path_body(String body){
        text.clear();
        text.sendKeys(body);
        BrowserUtils.waitForVisibility(executeButton,10);
    }

    public void executeButton(){
        executeButton.click();
    }

    public String convertJson(RequestPetBody requestPetBody) throws JsonProcessingException {
        //Creating the ObjectMapper object
        ObjectMapper mapper = new ObjectMapper();
        //Converting the Object to JSONString
        return mapper.writeValueAsString(requestPetBody);

    }


}
