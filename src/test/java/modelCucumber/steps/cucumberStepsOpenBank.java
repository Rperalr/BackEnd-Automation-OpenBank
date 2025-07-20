package modelCucumber.steps;

import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.junit.Assert;
import util.Constant;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class cucumberStepsOpenBank extends Constant {

    @Given("que el usuario pueda tener acceso a la url {string}")
    public Response que_el_usuario_pueda_tener_acceso_a_la_url(String string) {
        // Write code here that turns the phrase above into concrete actions
        Response response = RestAssured
                .given()
                .when().get(string)
                .then().extract().response();
        return response;

    }
    @Then("la respuesta que se espera es un codigo de {string}")
    public void la_respuesta_que_se_espera_es_un_codigo_de(String string) {
        // Write code here that turns the phrase above into concrete actions
        Response response = que_el_usuario_pueda_tener_acceso_a_la_url(string);
        Assert.assertEquals("El código respuesta es:"
                + response.getStatusCode() ,string, response.getStatusCode());
        System.out.println("El código respuesta es:"
                + response.getStatusCode());
        throw new io.cucumber.java.PendingException();
    }
}