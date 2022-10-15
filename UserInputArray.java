package com.sparta.sr;

import java.util.Scanner;

public class UserInputArray {
    public static int[] getArrayOfNumbers() {
        return getUsersArray();
    }

    private static int[] getUsersArray() {
        Scanner myObj = new Scanner(System.in);
        int userNumber = getArrayLength(myObj);
        int[] arrayOfNumbers = getArrayElements(myObj, userNumber);
        return arrayOfNumbers;
    }

    public static int[] getArrayElements(Scanner myObj, int userNumber) {
        int[] arrayOfNumbers = new int[userNumber];
        System.out.println("Enter the integers you want in the array:");
        for(int i = 0; i < userNumber; i++) {
            arrayOfNumbers[i] = myObj.nextInt();
        }
        return arrayOfNumbers;
    }

    public static int getArrayLength(Scanner myObj) {
        System.out.println("Enter how many integers should be in the array:");
        int userNumber = myObj.nextInt();
        userNumber = checkValidArrayLength(myObj, userNumber);
        return userNumber;
    }

    public static int checkValidArrayLength(Scanner myObj, int userNumber) {
        while(userNumber <= 0) {
            System.out.println("Invalid value; please retry with integer over 0");
            userNumber = myObj.nextInt();
        }
        return userNumber;
    }
}

