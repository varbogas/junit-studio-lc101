package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsAssertEquals() {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertEquals(true, test_Class.hasBalancedBrackets("[]"));
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertTrue(test_Class.hasBalancedBrackets("[]"));
    }

    @Test
    public void onlyBracketsReturnsTrueTwo() {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertTrue(test_Class.hasBalancedBrackets("[{[ ]}]"));
    }

    @Test
    public void onlyBracketsReturnsTrueThree() {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertTrue(test_Class.hasBalancedBrackets(" [ ] "));
    }

    @Test
    public void onlyBracketsReturnsTrueFour() {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertTrue(test_Class.hasBalancedBrackets(" [[2 ]3] "));
    }

    @Test
    public void onlyBracketsReturnsFalse() {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertFalse(test_Class.hasBalancedBrackets("[]]"));
    }

    @Test
    public void onlyBracketsReturnsFalseTwo() {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertFalse(test_Class.hasBalancedBrackets("[}"));
    }

    @Test
    public void onlyBracketsReturnsFalseThree() {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertFalse(test_Class.hasBalancedBrackets("]"));
    }

    @Test
    public void onlyBracketsReturnsFalseFour() {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertFalse(test_Class.hasBalancedBrackets("{{ ]}}"));
    }


    @Test
    public void onlyBracketsReturnsNotNull() {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertNotNull(test_Class.hasBalancedBrackets("]"));
    }

    @Test
    public void onlyBracketsAssertSame() {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertSame(test_Class.hasBalancedBrackets("[]"), test_Class.hasBalancedBrackets("[[]]"));
    }

    @Test
    public void onlyBracketsAssertNotSame() {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertNotSame(test_Class.hasBalancedBrackets("[]]"), test_Class.hasBalancedBrackets("[[]]"));
    }




}
