package com.emerline.ijl01_9.exception;

/**
 * Created by dzmitry.karayedau on 17-Apr-17.
 */
public class EmptyArgumentException extends Exception {
    public EmptyArgumentException() {
    }

    public EmptyArgumentException(String s) {
        super(s);
    }
}
