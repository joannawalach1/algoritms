package com.devs.exercises;

public class Abbreviation {
    public String abbreviateSentences(String sentence) {
        StringBuilder result = new StringBuilder();
        String[] listOfWordsInGivenSentence = sentence.split(" ");

        for (String word : listOfWordsInGivenSentence) {
            String[] subWords = word.split("-");
            StringBuilder wordResult = new StringBuilder();

            for (String subWord : subWords) {
                if (subWord.length() >= 5 && !subWord.matches(".*[!].*")) {
                    String abbreviation = subWord.substring(0, 1) + (subWord.length() - 2) + subWord.substring(subWord.length() - 1);
                    wordResult.append(abbreviation);
                } else {
                    wordResult.append(subWord);
                }
                wordResult.append("-");
            }

            if (wordResult.charAt(wordResult.length() - 1) == '-') {
                wordResult.deleteCharAt(wordResult.length() - 1);
            }

            result.append(wordResult).append(" ");
        }

        return result.toString().trim();
    }
}
