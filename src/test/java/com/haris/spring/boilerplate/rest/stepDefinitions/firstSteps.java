package com.haris.spring.boilerplate.rest.stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.springframework.beans.factory.annotation.Value;


public class firstSteps extends CucumberStepDefinitions{

    private RequestSpecification request = RestAssured.with();
    private Response response;


    @Value("${thisValue}")
    private String value;

    @Value("${server.port}")
    private String serverPort;


    @When("^the client calls /version$")
    public void the_client_calls_version() {
        System.out.println("This step was executed and found value: " + value);
        response = request.when().get("http://localhost:" + serverPort + "/employees");
        System.out.println(response.asString());
    }


    @Then("^the client receives status code of (\\d+)$")
    public void the_client_receives_status_code_of(int arg1) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^the client receives server version (\\d+)\\.(\\d+)$")
    public void the_client_receives_server_version(int arg1, int arg2) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}
