import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AnagramCounter {

    public static void main(String[] args) {
        String string1 = "please dear agree to take kids outside";
        String string2 = "if you are eager read and skid";

        String[] words1 = string1.split("\\s+");
        String[] words2 = string2.split("\\s+");

        int anagramCount = countAnagramPairs(words1, words2);
        System.out.println("Number of anagram pairs: " + anagramCount);
    }

    public static int countAnagramPairs(String[] words1, String[] words2) {
        Map<String, Integer> wordCountMap = new HashMap<>();
        int anagramCount = 0;

        for (String word : words1) {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);

            wordCountMap.put(sortedWord, wordCountMap.getOrDefault(sortedWord, 0) + 1);
        }

        for (String word : words2) {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);

            if (wordCountMap.containsKey(sortedWord) && wordCountMap.get(sortedWord) > 0) {
                anagramCount++;
                wordCountMap.put(sortedWord, Math.min(wordCountMap.get(sortedWord) - 1, 0));
            }
        }

        return anagramCount;
    }
}
