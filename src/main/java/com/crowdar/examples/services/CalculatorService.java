package com.crowdar.examples.services;

import org.testng.Assert;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.examples.constants.CalculatorConstants;

public class CalculatorService {

	private CalculatorService() {}

    public static void multiply() {
        ActionManager.click(CalculatorConstants.TWO);
        ActionManager.click(CalculatorConstants.MULTIPLY);
        ActionManager.click(CalculatorConstants.FOUR);
        ActionManager.click(CalculatorConstants.EQUAL);
    }

    public static void minus() {
        ActionManager.click(CalculatorConstants.THREE);
        ActionManager.click(CalculatorConstants.MINUS);
        ActionManager.click(CalculatorConstants.ONE);
        ActionManager.click(CalculatorConstants.EQUAL);
    }

    public static void divide() {
        ActionManager.click(CalculatorConstants.SIX);
        ActionManager.click(CalculatorConstants.DIVIDE);
        ActionManager.click(CalculatorConstants.TWO);
        ActionManager.click(CalculatorConstants.EQUAL);
    }

	public static void plus() {
    	ActionManager.click(CalculatorConstants.SEVEN);
    	ActionManager.click(CalculatorConstants.PLUS);
        ActionManager.click(CalculatorConstants.EIGHT);
        ActionManager.click(CalculatorConstants.EQUAL);
    }
    
    public static void resultPlus() {
    	Assert.assertEquals(getResult(),"15");
    }

    public static void resultMinus() {
        Assert.assertEquals(getResult(),"2");
    }

    public static void resultDivide() {
        Assert.assertEquals(getResult(),"3");
    }

    public static void resultMultiply() {
        Assert.assertEquals(getResult(),"8");
    }
    
    public static String getResult() {
		return ActionManager.getText(CalculatorConstants.CALCULATOR_RESULTS).replaceAll("\\D+", "").trim();
    }

}
