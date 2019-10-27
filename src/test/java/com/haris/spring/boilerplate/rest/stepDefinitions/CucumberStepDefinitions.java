package com.haris.spring.boilerplate.rest.stepDefinitions;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public abstract class CucumberStepDefinitions {
    @Value("${test.baseUri}")
    protected String baseUri;

    @Value(("${server.port}"))
    protected String serverPort;

//    protected String URL = baseUri + ":" + serverPort + "/";
}
