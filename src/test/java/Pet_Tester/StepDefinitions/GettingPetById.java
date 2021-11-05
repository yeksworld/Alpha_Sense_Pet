package Pet_Tester.StepDefinitions;

import Pet_Tester.POJOs.getPetResponse.GetPetResponse;
import Pet_Tester.Utilities.PetTesterUtilities;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.is;


public class GettingPetById {
    Response response;
    GetPetResponse as;
    int petId;
    int responseId;

    @Given("When user searches for pet by {string}")
    public void whenUserSearchesForPetBy(String petId) {
        this.petId = Integer.parseInt(petId);
        response = given().spec(PetTesterUtilities.makeRequestReady())
                .when().get("v2/pet/" + petId);
        response.then().log().all();
        if(response.path("id")!=null){
            responseId = response.path("id");
            System.out.println("responseId = " + responseId);
        }

    }

    @Then("Response should be {int}")
    public void userResponseShouldBe(int statusCode) {
        try {
            as = response.as(GetPetResponse.class);
            response.then().statusCode(statusCode);
        } catch (Exception e) {
            response.then().body("message",is("Pet not found"));
        }
    }
}
