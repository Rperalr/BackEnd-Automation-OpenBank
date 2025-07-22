package modelJunit;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import org.junit.jupiter.api.Assertions;
import util.Constant;

import static org.junit.Assert.assertEquals;
import static util.Constant.*;

public class apiGetPageControllerOpenBank {

    private Response openBnkRequest() {
        Response response = RestAssured
                    .given()
                    .when().get(API_OPENBANK)
                    .then().extract().response();
        return response;
    }

    private void openBnkGetRequestMethod(){
        Response response = openBnkRequest();
        assertEquals("El código respuesta es:"
                 + response.getStatusCode() ,Response200, response.getStatusCode());
        System.out.println("El código respuesta es:"
                 + response.getStatusCode());
    }
    public void openBnkGetRequestFunction(){
       this.openBnkGetRequestMethod();
    }

private Response openBnkRequestFail() {
        Response response = RestAssured
                .given()
                .when().get(API_OPENBANK_Fail)
                .then().extract().response();
        return response;

    }
    public void openBnkGetRequestFail(){
        Response response = openBnkRequestFail();
        assertEquals("El código respuesta es:"
                + response.getStatusCode() ,Response404, response.getStatusCode());
        System.out.println("El código respuesta es:"
                + response.getStatusCode());
    }
}