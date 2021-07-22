package com.mycompany.calculatorproject.main;

import com.mycompany.calculatorproject.model.Calculator;

public class Main {
    
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        float resultAddition = calculator.addition(3, 4);
        float resultMultiply = calculator.multiply(2, 8);
        float resultDivision = calculator.division(10, 5);
        float resultSubstract = calculator.substract(7, 3);
        
        System.out.println("Result Addition: " + resultAddition 
                         + "\nResult Multiply: " + resultMultiply
                         + "\nResult Division: " + resultDivision
                         + "\nResult Substract: " + resultSubstract  
                          );
    }
    
}
