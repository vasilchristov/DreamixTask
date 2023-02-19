package com.company;

import java.util.ArrayList;
import java.util.List;

public class StringUtility {

    public static String[] getAllWordsFromAStringContainingASubstring(String inputText, String substring) {
        String[] words = inputText.split("[ \n\t]+");
        List<String> result = new ArrayList<>();
        for (String word : words) {
            if (word.contains(substring)) {
                result.add(word);
            }
        }
        return result.toArray(new String[0]);
    }
}
