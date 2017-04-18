package com.emerline.ijl01_9.utils;

import com.emerline.ijl01_9.exception.EmptyArgumentException;

import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Dima on 16.04.2017.
 */
public class StringFilter {

    private HashSet<String> arguments = new HashSet<String>();

    public StringFilter(HashSet<String> arguments) throws EmptyArgumentException {
        for (String argument : arguments) {
            validateArgument(argument);
        }
        this.arguments = arguments;
    }

    private void validateArgument(String argument) throws EmptyArgumentException {
        if ((argument.equals("")) | (argument.equals(null))) {
            throw new EmptyArgumentException("Empty argument");
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
