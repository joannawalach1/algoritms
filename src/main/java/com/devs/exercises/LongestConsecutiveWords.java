package com.devs.exercises;

public class LongestConsecutiveWords {

    public String returnLongestConsecutive(String[] strrar, int k) {
        String longestWord = "";

        for (int i = 0; i <= strrar.length - k; i++) {
            StringBuilder combinedWords = new StringBuilder();
            for (int j = i; j < i + k; j++) {
                combinedWords.append(strrar[j]);
            }
            String currentCombined = combinedWords.toString();
            if (currentCombined.length() >= k && currentCombined.length() > longestWord.length()) {
                longestWord = currentCombined;
            }
        }

        System.out.println("The longest word in the array is: " + longestWord);
        return longestWord;
    }
}
