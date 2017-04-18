package com.emerline.ijl01_9.utils;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by dzmitry.karayedau on 18-Apr-17.
 */
public class ConsoleHelperUtil {

    private static final String YES = "Y";
    private static final String NO = "N";


    public static String inputString() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input analyzing string: ");
        return in.nextLine();
    }


    public static HashSet<String> arguments() {
        HashSet<String> arguments = new HashSet<String>();
        String inputString;
        Scanner in = new Scanner(System.in);
        boolean isArgumentIntroduceEnded;
        do {
            System.out.print("Input searching string: ");
            inputString = in.nextLine();
            arguments.add(inputString);
            isArgumentIntroduceEnded = isNextStringNeeded();
        }
        while (!isArgumentIntroduceEnded);
        return arguments;
    }

    private static boolean isNextStringNeeded() {
        Scanner in = new Scanner(System.in);
        String inputString;
        boolean isCommandAdopted;
        boolean isNextStringNeeded;
        do {
            System.out.print("Input more one string? (Y/N)");
            inputString = in.nextLine();
            switch (inputString.toUpperCase()) {
                case YES: {
                    isNextStringNeeded = false;
                    isCommandAdopted = true;
                    break;
                }
                case NO: {
                    isNextStringNeeded = true;
                    isCommandAdopted = true;
                    break;
                }
                default: {
                    System.out.println("Wrong command added.");
                    isNextStringNeeded = false;
                    isCommandAdopted = false;
                }
            }
        } while (!isCommandAdopted);
        return isNextStringNeeded;
    }
}
