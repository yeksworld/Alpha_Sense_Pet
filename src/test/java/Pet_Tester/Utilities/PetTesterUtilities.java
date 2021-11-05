package Pet_Tester.Utilities;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class PetTesterUtilities {

    public static RequestSpecification makeRequestReady(){

        return new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .setAccept(ContentType.JSON)
                .addHeader("api_key","special-key")
                .setBaseUri(ConfigurationReader.get("url"))
                .build();

    }
}
