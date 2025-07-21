## Validación API WebUp / OpenBank)

Este proyecto nos sirve para poder validar la API de la landing de OpenBank y ver si esta disponible en la web:

- JUnit (Unit Testing)
- RestAssured 
- Cucumber (BDD Gherkin)

## Getting Started

1. Clone the repository:

bash
(https://github.com/Rperalr/BackEnd-Automation-OpenBank/tree/QA_DEV)
cd BackEnd-Automation-OpenBank

2. Run tests with Maven:

bash
mvn clean install

mvn test

##  Project Structure

Arquitectura Java API RestAssured With Cucumber 
Api-OpenBank/
├── logs/
├── src/
│   └── main/
│       └── java/
│           ├── ExtentRepor/
│           ├── implementsIntsnces/
│           ├── uitl/
│           ├── videoRecorder/
│           └── Base/
│               ├── modelCucumber/
│               ├── runner/
│               ├── steps/
│               └── modelJunit/
└── resources/
    ├── .XML
    ├── .pom
    ├── .log4j
    ├── .readme
    └── .gitignosre
  
##  Ejemplo de Test Java POO (RestAssured)

JSONObject jsonObject  = new JSONObject();
        //GIVEN
        RestAssured.given()
                .contentType(ContentType.JSON)
                .body(jsonObject)
                .log().all()
         // WHEN
                .when()
                .get()
         // THEN
                .then()
                .log().all()
                .extract().response();
        return jsonObject;

## Gherkin Feature with Dynamic Data

Gherkin
Feature: Validar url OpenBank

  Scenario Outline: Validar que pueda llegar al enpoint
    Given que el usuario pueda tener acceso a la url "<web>"
    Then la respuesta que se espera es un codigo de "<status>"

    Examples:
      | web                                   | status |
      | https://www.openbank.es               | 200    |
      | https://www.openbank.es/nohaynada     | 403    |


## Cucumber Report

Test reports generado por Maven Cucumber:

plaintext
target/cucumber-report.html
