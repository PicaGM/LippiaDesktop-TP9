package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.CalculatorService;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculatorSteps extends PageSteps {

    @When("Seven Plus Eight")
    public void plus() {
    	CalculatorService.plus();
    }
    
    @Then("Result is Fifteen")
    public void result() {
    	CalculatorService.resultPlus();
    }

    @When("Six Divide Two")
    public void sixDivideTwo() {
        CalculatorService.divide();
    }

    @When("Three Minus One")
    public void threeMinusOne() {
        CalculatorService.minus();
    }

    @Then("Result is Two")
    public void resultIsTwo() {
        CalculatorService.resultMinus();
    }

    @When("Two Multiply Four")
    public void twoMultiplyFour() {
        CalculatorService.multiply();
    }

    @Then("Result is Eight")
    public void resultIsEight() {
        CalculatorService.resultMultiply();
    }

    @Then("Result is Three")
    public void resultIsThree() {
        CalculatorService.resultDivide();
    }
}