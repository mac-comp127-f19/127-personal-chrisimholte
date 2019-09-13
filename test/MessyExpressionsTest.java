import expressionRefactoring.MessyExpressions;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MessyExpressionsTest {
    @Test
    void sumUpTo() {
        Assertions.assertEquals(0, MessyExpressions.sumUpTo(0));
        Assertions.assertEquals(1, MessyExpressions.sumUpTo(1));
        Assertions.assertEquals(6, MessyExpressions.sumUpTo(3));
        Assertions.assertEquals(45, MessyExpressions.sumUpTo(9));
    }

    @Test
    void isEmphatic() {
        Assertions.assertTrue(MessyExpressions.isEmphatic("Wow!"));
        Assertions.assertTrue(MessyExpressions.isEmphatic("Huh?!?"));
        Assertions.assertTrue(MessyExpressions.isEmphatic("!olleH"));
        Assertions.assertFalse(MessyExpressions.isEmphatic("Huh."));
        Assertions.assertFalse(MessyExpressions.isEmphatic(""));
    }

    @Test
    void trimParentheses() {
        Assertions.assertEquals("hi", MessyExpressions.trimParentheses("(hi)"));
        Assertions.assertEquals("(hi", MessyExpressions.trimParentheses("(hi"));
        Assertions.assertEquals("hi)", MessyExpressions.trimParentheses("hi)"));
        Assertions.assertEquals("(hi)", MessyExpressions.trimParentheses("((hi))"));
        Assertions.assertEquals("", MessyExpressions.trimParentheses(""));
        Assertions.assertEquals("", MessyExpressions.trimParentheses("()"));
    }

    @Test
    void isInBounds() {
        Assertions.assertTrue(MessyExpressions.isInBounds(2, 1, 3));
        Assertions.assertTrue(MessyExpressions.isInBounds(5, 5, 12));
        Assertions.assertTrue(MessyExpressions.isInBounds(7, -3, 7));
        Assertions.assertFalse(MessyExpressions.isInBounds(2, 3, 10));
        Assertions.assertFalse(MessyExpressions.isInBounds(11, 3, 10));
    }

    @Test
    void nextCollatz() {
        Assertions.assertEquals(3, MessyExpressions.nextCollatz(6));
        Assertions.assertEquals(22, MessyExpressions.nextCollatz(7));
        Assertions.assertEquals(0, MessyExpressions.nextCollatz(0));
        Assertions.assertEquals(-1, MessyExpressions.nextCollatz(-2));
        Assertions.assertEquals(-8, MessyExpressions.nextCollatz(-3));
    }

    @Test
    void isJustScreaming() {
        Assertions.assertTrue(MessyExpressions.isJustScreaming("AAAAAAA!!!!"));
        Assertions.assertTrue(MessyExpressions.isJustScreaming("aa!! aaa!! a! a! !!!!"));
        Assertions.assertTrue(MessyExpressions.isJustScreaming("AaAaAaA"));
        Assertions.assertFalse(MessyExpressions.isJustScreaming("aa!! eeek!!!"));
        Assertions.assertFalse(MessyExpressions.isJustScreaming("AAAA!!?!!!"));
        Assertions.assertFalse(MessyExpressions.isJustScreaming("Aaaa. AAAA."));
        Assertions.assertTrue(MessyExpressions.isJustScreaming("!"));
        Assertions.assertTrue(MessyExpressions.isJustScreaming(" "));
        Assertions.assertTrue(MessyExpressions.isJustScreaming(""));
    }

    @Test
    void removeAccents() {
        Assertions.assertEquals("cauliflower education",
            MessyExpressions.removeAccents("cáulíflower édúcatión"));
        Assertions.assertEquals(".ᦗe1$✾@aࢨoᎉ", MessyExpressions.removeAccents(".ᦗé1$✾@áࢨóᎉ"));
        Assertions.assertEquals("", MessyExpressions.removeAccents(""));
    }

    @Test
    void containsOwnLength() {
        Assertions.assertTrue(MessyExpressions.containsOwnLength("th15 one does!!"));
        Assertions.assertFalse(MessyExpressions.containsOwnLength("th15 one doesn’t"));
        Assertions.assertTrue(MessyExpressions.containsOwnLength("1234"));
        Assertions.assertTrue(MessyExpressions.containsOwnLength("321"));
        Assertions.assertTrue(MessyExpressions.containsOwnLength("1"));
        Assertions.assertFalse(MessyExpressions.containsOwnLength(""));
    }
}
