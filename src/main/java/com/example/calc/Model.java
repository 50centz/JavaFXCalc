package com.example.calc;

public class Model {

    public  long calculation(long a, long b, String operator){

        switch (operator){
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                if (b == 0) return 0;
                return a / b;
        }
        System.out.printf("Unknown operator: " + operator);

        return 0;
    }
}
