package com.emerline.ijl01_9.utils;

import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Dima on 16.04.2017.
 */
public class StringFilter {
    private HashSet<String> arguments = new HashSet<String>();

    public void addArgument(String argument) {
        if ((argument != "") & (argument != null)) {
            if (!arguments.contains(argument)) {
                arguments.add(argument);
            }
        }
    }

    public boolean checkStringOnArguments(String analyzedString) {
        Pattern p;
        Matcher m;
        boolean availability = false;
        for (String s : arguments) {
            p = Pattern.compile(s, Pattern.CASE_INSENSITIVE);
            m = p.matcher(analyzedString);
            if (m.find()) {
                availability = true;
                break;
            }
        }
        return availability;
    }

}
