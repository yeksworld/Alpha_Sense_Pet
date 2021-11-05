package Pet_Tester.StepDefinitions;

import Pet_Tester.Utilities.PetTesterUtilities;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class RemovingThePetStepDefs {
    Response response;
    int petId;
    @Given("When user removes for pet by {string}")
    public void whenUserRemovesForPetBy(String petId) {
        this.petId = Integer.parseInt(petId);
        response = given().spec(PetTesterUtilities.makeRequestReady())
                .when().delete("v2/pet/" + petId);
        response.then().log().all();
    }

    @Then("Delete Response should be {int}")
    public void deleteResponseShouldBe(int petId) {
        response.then().statusCode(200);
    }
}
