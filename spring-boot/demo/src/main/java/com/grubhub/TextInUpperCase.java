package com.grubhub;

/**
 * Created by rene on 19/08/16.
 */
public class TextInUpperCase {

    private String message;

    public TextInUpperCase(String message) {
        this.message = message;
    }

    public String text() {
        return message.toUpperCase();
    }
}
