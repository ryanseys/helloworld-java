package com.ryanseys;

/**
 * A simple Hello World class for learning about Android dependencies.
 */
public class HelloWorld {

    private String message;

    // Base constructor.
    public void HelloWorld() {
        this.message = "Hello World!";
    }

    // Get the message.
    public String getMessage() {
        return this.message;
    }

    // Set the message.
    public void setMessage(String message) {
        this.message = message;
    }
}
