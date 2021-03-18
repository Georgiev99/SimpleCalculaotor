package com.learnJava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner sc  =  new Scanner(System.in);
        System.out.println("Enter n1 ");
        double n1 = Double.parseDouble(sc.nextLine());
        System.out.println("Enter operator");
        String op = sc.nextLine();
        System.out.println("Enter n2 ");
        double n2 = Double.parseDouble(sc.nextLine());
        double calculation = Calculator(n1,op, n2);
        System.out.println(calculation);


    }
    public static double Calculator (double num1, String operator, double num2){
        double result = 0;
        if(operator.equals("+")){
             result = num1 + num2;

        } else if(operator.equals("-")){
             result = num1 - num2;

        } else if(operator.equals("*")){
             result = num1 * num2;
        } else if(operator.equals("/")){
            if(num2 == 0){
                return -1;
            }
             result = num1 / num2;
        } else {
            return  -1;
        }
        return  result;

    }
}
