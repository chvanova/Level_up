package ru.levelup.firstname.lastname.qa.homework_number.task_number1;

public class CalculatorApplication {

    public static void main(String[] args) {
        double result = 0;
        String inputValue = GetUserData.getValue();
        int lenthValue1 = inputValue.length();
        String operation = GetUserData.getOperation();
        String separator = String.valueOf('.');

        if (operation.equals(String.valueOf('!'))) {
            try {
                int number = new Integer(inputValue);
                result = OperationFactorial.calculate_factorial(number);

            } catch (NumberFormatException e) {
                System.err.println("Invalid value");
            }

        }
        else {
            String inputValue1 = GetUserData.getValue();

            if (operation.equals(String.valueOf('^'))) {
                if (inputValue.contains(separator)) {
                    try {
                        int exp = Integer.parseInt(inputValue);
                        double number = Double.valueOf(inputValue1);
                        result = OperationModularExponentiation.modularExponentiation(number, exp);

                    } catch (NumberFormatException e) {
                        System.err.println("Invalid value");
                    }
                }
                    if (lenthValue1 < 10) {
                        try {
                            int exp = Integer.parseInt(inputValue);
                            int number = Integer.parseInt(inputValue1);
                            result = OperationModularExponentiation.modularExponentiation(number, exp);

                        } catch (NumberFormatException e) {
                            System.err.println("Invalid value");
                        }
                    }
                    if (lenthValue1 > 10) {
                        try {
                            int exp;
                            long number;
                            number = Long.valueOf(inputValue);
                            exp = Integer.parseInt(inputValue1);
                            result = OperationModularExponentiation.modularExponentiation(number, exp);

                        } catch (NumberFormatException e) {
                            System.err.println("Invalid value");
                        }
                    }
                }

            if (operation.equals(String.valueOf('+'))) {
                if (inputValue.contains(separator)) {
                    try {
                        result = OperationAddition.addition(Double.valueOf(inputValue), Double.valueOf(inputValue1));

                    } catch (NumberFormatException e) {
                        System.err.println("Invalid value");
                    }
                }
                else {
                if (lenthValue1 < 10) {
                    try {
                        result = OperationAddition.addition(Integer.parseInt(inputValue), Integer.parseInt(inputValue1));

                    } catch (NumberFormatException e) {
                        System.err.println("Invalid value");
                    }
                }
                if (lenthValue1 > 10) {
                    try {
                        result = OperationAddition.addition(Long.valueOf(inputValue), Long.valueOf(inputValue1));

                    } catch (NumberFormatException e) {
                        System.err.println("Invalid value");
                    }
                }
            }
            }
            if (operation.equals(String.valueOf('-'))) {
                if (inputValue.contains(separator)) {
                    try {
                        result = OperationSubtraction.subtraction(Double.valueOf(inputValue), Double.valueOf(inputValue1));

                    } catch (NumberFormatException e) {
                        System.err.println("Invalid value");
                    }
                }
                else {
                    if (lenthValue1 < 10) {
                        try {
                            result = OperationSubtraction.subtraction(Integer.parseInt(inputValue), Integer.parseInt(inputValue1));

                        } catch (NumberFormatException e) {
                            System.err.println("Invalid value");
                        }
                    }
                    if (lenthValue1 > 10) {
                        try {
                            result = OperationSubtraction.subtraction(Long.valueOf(inputValue), Long.valueOf(inputValue1));

                        } catch (NumberFormatException e) {
                            System.err.println("Invalid value");
                        }
                    }
                }
            }
            if (operation.equals(String.valueOf('/'))) {
                if (inputValue.contains(separator)) {
                    try {
                        result = OperationDivision.division(Double.valueOf(inputValue), Double.valueOf(inputValue1));

                    } catch (NumberFormatException e) {
                        System.err.println("Invalid value");
                    }
                }
                else {
                    if (lenthValue1 < 10) {
                        try {
                            result = OperationDivision.division(Integer.parseInt(inputValue), Integer.parseInt(inputValue1));

                        } catch (NumberFormatException e) {
                            System.err.println("Invalid value");
                        }
                    }
                    if (lenthValue1 > 10) {
                        try {
                            result = OperationDivision.division(Long.valueOf(inputValue), Long.valueOf(inputValue1));

                        } catch (NumberFormatException e) {
                            System.err.println("Invalid value");
                        }
                    }
                }
            }
            if (operation.equals(String.valueOf('/'))) {
                if (inputValue.contains(separator)) {
                    try {
                        result = OperationMultiplication.multiplication(Double.valueOf(inputValue), Double.valueOf(inputValue1));

                    } catch (NumberFormatException e) {
                        System.err.println("Invalid value");
                    }
                }
                else {
                    if (lenthValue1 < 10) {
                        try {
                            result = OperationMultiplication.multiplication(Integer.parseInt(inputValue), Integer.parseInt(inputValue1));

                        } catch (NumberFormatException e) {
                            System.err.println("Invalid value");
                        }
                    }
                    if (lenthValue1 > 10) {
                        try {
                            result = OperationMultiplication.multiplication(Long.valueOf(inputValue), Long.valueOf(inputValue1));

                        } catch (NumberFormatException e) {
                            System.err.println("Invalid value");
                        }
                    }
                }
            }

        }
        System.out.print("Result " + result);

    }
    private void startApplication() {

    }

}
