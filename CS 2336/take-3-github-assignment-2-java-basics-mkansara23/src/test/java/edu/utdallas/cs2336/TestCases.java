package edu.utdallas.cs2336;

import org.junit.jupiter.api.Test;

public class TestCases {

    @Test
    public void testDivide() {
        assert (Main.divide(2, 1) == 2.0);
        assert (Main.divide(2, 2) == 1.0);
        assert (Math.abs(Main.divide(1, 2))-.5 < 0.0001);
    }

    @Test
    public void testStringBuilder() {
        String[] entries = {"Hi", "There", "Students"};
        StringBuilder result = Main.forwardAndReverseBuilder(entries);
        assert(result.toString().equals("HiThereStudentsStudentsThereHi"));

        String[] entries2 = {"Another", "Test", "Set"};
        result = Main.forwardAndReverseBuilder(entries2);
        assert(result.toString().equals("AnotherTestSetSetTestAnother"));
    }

    @Test
    public void testCheckValues() {
        assert(Main.checkValues(2, 2).equals(Main.Comparison.EQUAL_TO));
        assert(Main.checkValues(1, 2).equals(Main.Comparison.LESS_THAN));
        assert(Main.checkValues(2, 1).equals(Main.Comparison.GREATER_THAN));

        assert(Main.checkValues("Hi", "Hi").equals(Main.Comparison.EQUAL_TO));
        assert(Main.checkValues("Hi", "Ho").equals(Main.Comparison.LESS_THAN));
        assert(Main.checkValues("Ho", "Hi").equals(Main.Comparison.GREATER_THAN));
    }

    @Test
    public void testIsEqual() {
        assert(Main.isEqual(2.0, 2.0));
        assert(Main.isEqual(2.0, 2.0000001));
        assert(Main.isEqual(2.000001, 2.0));
        assert(!Main.isEqual(2.0, 2.01));
        assert(!Main.isEqual(2.01, 2.0));
    }

    @Test
    public void testReturnAsCharacter() {
        assert (Main.returnNumberAsCharacter(1) == 'a');
        assert (Main.returnNumberAsCharacter(2) == 'b');
        assert (Main.returnNumberAsCharacter(3) == 'c');
        assert (Main.returnNumberAsCharacter(4) == 'd');
        assert (Main.returnNumberAsCharacter(5) == 'e');
        assert (Main.returnNumberAsCharacter(6) == 'f');
        assert (Main.returnNumberAsCharacter(7) == 'g');
        assert (Main.returnNumberAsCharacter(8) == 'h');
        assert (Main.returnNumberAsCharacter(9) == 'i');
        assert (Main.returnNumberAsCharacter(10) == 'j');
        assert (Main.returnNumberAsCharacter(0) == 'z');
        assert (Main.returnNumberAsCharacter(11) == 'z');
    }

    @Test
    public void testGetPrivateString() {
        assert(Main.getPrivateString().equals("This is a test"));
    }

    @Test
    public void testAmountInUse() {
        assert(Main.amountInUse(new int[] {0, 0}) == 0);
        assert(Main.amountInUse(new int[] {1}) == 1);
        assert(Main.amountInUse(new int[] {3, 60, 22}) == 3);
        assert(Main.amountInUse(new int[] {3, 60, 0, 343, 0, 33}) == 4);
    }

    @Test
    public void testLowerUpperCase() {
        int[] results = new int[2];
        Main.numLowerUpperCase("HeLlO", results);
        assert(results[0] == 2);
        assert(results[1] == 3);

        results = new int[2];
        Main.numLowerUpperCase("thisIsCamelCased", results);
        assert(results[0] == 13);
        assert(results[1] == 3);
    }
}
