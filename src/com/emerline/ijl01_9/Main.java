package com.emerline.ijl01_9;

import com.emerline.ijl01_9.exception.EmptyArgumentException;
import com.emerline.ijl01_9.utils.ConsoleHelperUtil;
import com.emerline.ijl01_9.utils.StringFilter;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws EmptyArgumentException {

        Scanner in = new Scanner(System.in);

        StringFilter stringFilter = new StringFilter(ConsoleHelperUtil.arguments());
        String inputString = ConsoleHelperUtil.inputString();

        if (stringFilter.checkStringOnArguments(inputString)) {
            System.out.println("String contain argument");
        } else {
            System.out.println("String do not contain argument");
        }
    }


}
