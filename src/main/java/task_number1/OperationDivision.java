package ru.levelup.firstname.lastname.qa.homework_number.task_number1;

public class OperationDivision {

    static double division(double num1, double num2){
        return num1 / num2;
    }
    static double division(int num1, int num2){
        int result = num1 / num2;
        return (double) result;
    }
    static double division(long num1, long num2){
        long result = num1 / num2;
        return (double) result;
    }
}
