package ru.levelup.firstname.lastname.qa.homework_number.task_number1;

public class OperationFactorial {

    static double calculate_factorial(int number) {
        int factorial = 1;
        for (int i = 1; i < number; i++) {
            factorial = factorial * (i + 1);
        }
        return factorial;
    }
}
