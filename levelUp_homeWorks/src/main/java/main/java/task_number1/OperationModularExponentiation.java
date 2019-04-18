package ru.levelup.firstname.lastname.qa.homework_number.task_number1;

public class OperationModularExponentiation {

    static double modularExponentiation(double num1, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        if (exponent == 1) {
            return num1;
        }
        double result = num1;
        for (int i = 0; i < exponent - 1; i++) {
            result = result * num1;

        }
        return result;
    }

    static double modularExponentiation(int num1, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        if (exponent == 1) {
            return num1;
        }
        double result = num1;
        for (int i = 0; i < exponent - 1; i++) {
            result = result * num1;

        }
        return result;
    }

    static double modularExponentiation(long num1, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        if (exponent == 1) {
            return num1;
        }
        double result = num1;
        for (int i = 0; i < exponent - 1; i++) {
            result = result * num1;

        }
        return result;
    }
}
