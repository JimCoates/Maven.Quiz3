package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {

    String vowels = "aeiou";

    public String translate(String str) {
    //    str = str.toLowerCase();

        if (startsWithVowel(str)) {
             str = addWayToEnd(str);
            return str;
        } else if (!containsVowels(str)) {
            str = addAYToEnd(str);
            return str;
        } else if (!startsWithVowel(str)) {
            str =shiftUntilConsonantIsFirst(str);
            str = addAYToEnd(str);
            return str;
        } else {
            return str;
        }
    }

    public Boolean startsWithVowel(String input) {
        if (vowels.contains(Character.toString(input.charAt(0)))) {
            return true;
        }
        return false;
    }

    public String addWayToEnd(String input) {
        StringBuilder temp = new StringBuilder(input);
        temp.append("way");
        return temp.toString();
    }

    public String shiftOnePosition(String input) {
        StringBuilder builder = new StringBuilder(input);
        String temp = Character.toString(builder.charAt(0));
        builder.deleteCharAt(0);
        builder.append(temp);

        return builder.toString();
    }

    public String shiftUntilConsonantIsFirst(String input) {

        while (!startsWithVowel(input)) {
            input = shiftOnePosition(input);
        }
        return input;
    }

    public Boolean containsVowels(String input) {
        if (input.contains("a") || input.contains("e") || input.contains("i") || input.contains("o") || input.contains("u")) {
            return true;
        }
        return false;
    }

    public String addAYToEnd(String input) {
        StringBuilder temp = new StringBuilder(input);
        temp.append("ay");
        return temp.toString();
    }


}
