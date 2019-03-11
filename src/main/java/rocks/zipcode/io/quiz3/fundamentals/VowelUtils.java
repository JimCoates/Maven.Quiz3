package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {

    final static String vowels = "aeiou";

    public static Boolean hasVowels(String word) {
        if(word.contains("a") || word.contains("e") || word.contains("i") || word.contains("u") || word.contains("o")){
            return true;
        }
        return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        word = word.toLowerCase();

        for (int i = 0; i < word.length(); i++) {
            if(vowels.contains(String.valueOf(word.charAt(i)))){
                return i;
            }
        }
        return null;
    }


    public static Boolean startsWithVowel(String word) {
        word = word.toLowerCase();

        if (vowels.contains(Character.toString(word.charAt(0)))) {
            return true;
        }
        return false;
    }

    public static Boolean isVowel(Character character) {
        if(vowels.contains(Character.toString(character).toLowerCase())){
            return true;
        }
        return false;
    }
}
