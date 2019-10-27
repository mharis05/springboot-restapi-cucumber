package com.haris.spring.boilerplate.rest.stepDefinitions;
import com.haris.spring.boilerplate.rest.model.Employee;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.springframework.beans.factory.annotation.Value;

public class firstSteps extends CucumberStepDefinitions{

    private static RequestSpecification request = RestAssured.with();
    private Response response;
    private String requestUrl;

    @Value("${thisValue}")
    private String value;

    @Value("${test.baseUri}")
    private String baseUri;

    @Then("^the client receives status code of (\\d+)$")
    public void the_client_receives_status_code_of(int expectedStatusCode) {
        response.then().statusCode(expectedStatusCode);
    }

    @Given("^\"([^\"]*)\" endpoint$")
    public void endpointIsRunning(String endpoint) throws Throwable {
        request.port(serverPort);
        requestUrl = baseUri +  "/" +  endpoint ;
        request.baseUri(requestUrl);
    }

    @When("^employee is created$")
    public void employeeIsCreated() {
        Employee employee = new Employee();
        employee.setName("Chicken");
        employee.setAge(15);
        response = request.contentType(ContentType.JSON).when().body(employee).post("/add");
        System.out.println(response.asString());
    }
}
