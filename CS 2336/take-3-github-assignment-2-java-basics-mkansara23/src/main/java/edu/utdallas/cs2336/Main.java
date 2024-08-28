package edu.utdallas.cs2336;

public class Main {
    public static double divide(int numerator, int denominator) {
        // TODO: divide, keeping the fractional part (if any)
        return 0;
    }

    public static StringBuilder forwardAndReverseBuilder(String[] entries) {
        // TODO: use a loop to add each entry in entries to a StringBuilder
        //  (no need for a delimiter) and then add all the entries
        //  in in reverse order
        return new StringBuilder();
    }

    public enum Comparison {
        LESS_THAN,
        EQUAL_TO,
        GREATER_THAN
    }

    public static Comparison checkValues(int value1, int value2) {
        // TODO: use < and > in ifs to return the proper value
        return Comparison.LESS_THAN;
    }

    public static Comparison checkValues(String value1, String value2) {
        // TODO: use String's compareTo method to return the right thing
        //  See https://www.w3schools.com/java/ref_string_compareto.asp
        return Comparison.LESS_THAN;
    }

    public static boolean isEqual(double first, double second) {
        // TODO: use the range .0001 to check for equality
        //  (that is, the two are equal if they are within
        //  .0001 of each other
        return true;
    }

    public static char returnNumberAsCharacter(int number) {
        // TODO: use a switch to turn 1 into 'a', 2 into 'b'...through
        //  10 into 'j', and z for anything else
        return 'k';
    }

    private static final String IS_A_TEST = "This is a test";

    public static String getPrivateString() {
        // TODO: return IS_A_TEST (private, so unavailable)
        return "";
    }

    public static int amountInUse(int[] arrayToCheck) {
        // TODO: return the number of elements in the array
        //  that are non-0 (and assummed to be in use)
        return 0;
    }

    public static void numLowerUpperCase(String stringToCheck, int[] results) {
        // TODO: put the number of lowercase characters in results[0],
        //  and the number of uppercase characters in results[1]

    }
}