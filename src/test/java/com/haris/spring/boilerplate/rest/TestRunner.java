package com.haris.spring.boilerplate.rest;

import com.haris.spring.boilerplate.rest.stepDefinitions.CucumberStepDefinitions;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", plugin = {"pretty"})
public class TestRunner extends CucumberStepDefinitions {

}
