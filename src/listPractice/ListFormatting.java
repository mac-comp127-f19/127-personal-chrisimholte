package listPractice;

import java.util.ArrayList;
import java.util.List;

/**
 * Assorted List formatting utilities.
 *
 * YOUR TASK: Implement each method and make sure the tests pass.
 */
@SuppressWarnings({"StringConcatenationInLoop", "WeakerAccess"})
public class ListFormatting {
    /**
     * Returns a new list with each item prefixed with the strings "1. ", "2. ", etc.
     * <p>
     * HINT: Use a for-each loop, and create a variable outside the loop to keep
     * track of which item number you’re on. (Think: why does the variable
     * have to be declared and initialized _outside_ the loop? What
     * happens if you move it inside?)
     */
    public static List<String> numberEachItem(List<String> items) {
        List<String> mutableList = new ArrayList<>();

        int number = 1;

        for (String word : items) {
            mutableList.add(number + ". " + word);
            number++;


        }
        return mutableList;
    }

    /**
     * Formats the items in the given list separated by commas and spaces, e.g.
     * "one, two, three".
     * <p>
     * HINT: You can declare a String variable outside the loop, much like you
     * declared an into outside the loop in the previous example.
     * Initialize it to an empty string, repeatedly add to it inside the
     * loop, then return it when you're done.
     */
    public static String formatWithCommas(List<String> items) {
        String stableText = ", ";
        String delimiter = "";

        for (int i = 0; i < items.size(); i++) {
            if (i == items.size() - 1) {
                delimiter = delimiter + items.get(i);
            } else {
                delimiter = (delimiter + items.get(i) + stableText);
            }

        }
        return delimiter;
    }


    /**
     * Formats the given items separated by commas and the word “and” so that
     * they could be used in an English sentence. Examples:
     * <p>
     * "one"
     * "one and two"
     * "one, two and three"
     * <p>
     * HINT: There is no way to do this without using several conditionals.
     * Use the test to help you. After you have it working, see if you
     * can simplify your solution at all.
     */
    public static String formatGrammatically(List<String> items) {
        String delimiter = "";

        for (int i = 0; i < items.size(); i++) {
            if (i == items.size() - 2) {
                delimiter = delimiter + items.get(i) + " and ";
            } else if (i == items.size() - 1) {
                delimiter = delimiter + items.get(i);
            } else {
                delimiter = delimiter + items.get(i) + ", ";
            }

        }

        return delimiter;
    }

    /**
     * Same as formatGrammatically(), except placing a comma before “and” if
     * there are three or more elements in the list. Examples:
     * <p>
     * "one"
     * "one and two"
     * "one, two, and three"   // Oxford comma after "two"
     * <p>
     * HINT: It is tricky to get all the cases right! Again, use the test to
     * help you.
     */
    public static String formatGrammaticallyWithOxfordComma(List<String> items) {
        String delimiter = "";
        int size = items.size();

        for (int i = 0; i < size; i++) {

            if (size > 2) {
                if (i == size - 2) {
                    delimiter = delimiter + items.get(i) + ", and ";
                } else if (i == size - 1) {
                    delimiter = delimiter + items.get(i);
                } else {
                    delimiter = delimiter + items.get(i) + ", ";
                }
            } else {
                if (i == items.size() - 2) {
                    delimiter = delimiter + items.get(i) + " and ";
                } else if (i == items.size() - 1) {
                    delimiter = delimiter + items.get(i);
                } else {
                    delimiter = delimiter + items.get(i) + ", ";
                }
            }
        }
        return delimiter;
        }


        /*
         * Special challenge, if you are looking for something extra:
         *
         * Create the following method that can either use the Oxford comma or not,
         * depending on its second parameter:
         *
         *     public static String formatGrammatically(List<String> items, boolean oxfordComma) {
         *         ???
         *     }
         *
         * Don't implement it by using the two methods above. Instead, do it the
         * other way around. Change the methods above so they both use your new one,
         * like this:
         *
         *     public static String formatGrammatically(List<String> items) {
         *         formatGrammatically(items, false);
         *     }
         *
         *     public static String formatGrammaticallyWithOxfordComma(List<String> items) {
         *         formatGrammatically(items, true);
         *     }
         *
         * ...and see if all the tests still pass!
         */

    }
