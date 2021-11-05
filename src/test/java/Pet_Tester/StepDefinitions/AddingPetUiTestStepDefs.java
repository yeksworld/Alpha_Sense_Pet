package Pet_Tester.StepDefinitions;

import Pet_Tester.POJOs.addingPetBody.RequestPetBody;
import Pet_Tester.POJOs.addingPetBody.TagsItem;
import Pet_Tester.Page.MainPage;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.util.Collections;

public class AddingPetUiTestStepDefs {

    RequestPetBody requestPetBody = new RequestPetBody();
    TagsItem tagsItem =new TagsItem();
    MainPage mainPage = new MainPage();
    @Given("User should be able to see main page")
    public void userShouldBeAbleToSeeMainPage() {
        mainPage.launchTheApp();


    }
    @When("User should be able to create pet by {string} and by {string} in the store")
    public void userShouldBeAbleToCreatePetByIdAndByInTheStore(String id,String name) throws JsonProcessingException {
        mainPage.clickPutButton();
        mainPage.try_it_outButton();
        requestPetBody.setId(Integer.parseInt(id));
        requestPetBody.setName(name);

        //convert pojo to jsonstring
        String jsonString = mainPage.convertJson(requestPetBody);

        mainPage.send_path_body(jsonString);
        mainPage.executeButton();

    }

}
