
package com.example;

public class App {
    public static void main(String[] args) {

        if (args.length == 0 || args[0].trim().isEmpty()) {
            System.err.println("ERROR: Empty input not allowed");
            System.exit(1);
        }

        String input = args[0];

        if (!input.matches("[a-zA-Z]+")) {
            System.err.println("ERROR: Only letters allowed");
            System.exit(1);
        }

        String reversed = new StringBuilder(input)
                .reverse().toString();

        System.out.println("POSITIVE TEST PASSED");
        System.out.println("Input: " + input);
        System.out.println("Output: " + reversed);
    }
}
