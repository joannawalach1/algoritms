package com.devs.exercises;

public class Abbreviation {
    public String abbreviateSentences(String sentence) {
        StringBuilder result = new StringBuilder();
        String[] listOfWordsInGivenSentence = sentence.split("[\\s-]+");

        for (String word : listOfWordsInGivenSentence) {
            if (!word.contains("!") && !word.contains("-") && word.length() >= 5) {
                int indexOfHyphen = word.indexOf("-");
                String abbreviation = word.substring(0, 1) + (word.length() - 2) + word.substring(word.length() - 1);
                result.append(abbreviation).append(" ");
            } else {
                result.append(word).append(" ");

            }
        }
        return result.toString().trim();
    }
}
