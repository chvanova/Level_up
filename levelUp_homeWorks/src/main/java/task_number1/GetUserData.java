package ru.levelup.firstname.lastname.qa.homework_number.task_number1;

import java.util.Scanner;

public class GetUserData {

    static String getValue() {
        System.out.print("Enter number: ");
        Scanner scan = new Scanner(System.in);

        return  scan.next();
    }

    static String getOperation(){
        System.out.print("Enter operation: ");
        Scanner scan = new Scanner(System.in);
        return scan.next();
    }


}
