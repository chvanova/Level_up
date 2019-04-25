package task_number2;

import java.util.Scanner;

public class GetCommand {

    static Integer getCountParams(){
        Integer countParams = 0;
        Scanner scan = new Scanner(System.in);
        try {
            countParams =  Integer.valueOf(scan.next());
        }
        catch (NumberFormatException e) {
            System.err.println("Invalid value");
        }
        return countParams;
    }

    static String getParamName() {
        String nameParameter = "";
        Scanner scan = new Scanner(System.in);
        try {
            nameParameter = String.valueOf(scan.next());
        }
        catch (NumberFormatException e) {
            System.err.println("Invalid value");
        }
        if (nameParameter.equals("paymentMethod") | nameParameter.equals("conductor") |nameParameter.equals("typePower") | nameParameter.equals("nubmer")
                | nameParameter.equals("capacity") | nameParameter.equals("expenditure")  | nameParameter.equals("personsWithDisabilities")
                | nameParameter.equals("tripPrice")) {
            String message = String.format("Поиск будет выполнен по  %s", nameParameter);
            System.out.println(message);
            return nameParameter;
        }
        System.out.println(String.format("Неизвестный параметр %s ", nameParameter));
        return nameParameter;

    }

    static Float getValueNumber() {
        Float value = null;
        Scanner scan = new Scanner(System.in);
        try {
            value = Float.valueOf(scan.next());
        } catch (NumberFormatException e) {
            System.err.println("Invalid value");
        }
        return value;
    }

    static String getValueString() {
        Scanner scan = new Scanner(System.in);
        return scan.next();
    }

    static Boolean getValueBool() {
        Boolean value = null;
        Scanner scan = new Scanner(System.in);
        try {
            value = Boolean.valueOf(scan.next());
        } catch (NumberFormatException e) {
            System.err.println("Invalid value");
        }
        return value;
    }
}
