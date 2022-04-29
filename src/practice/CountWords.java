package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountWords {

    public static void main(String[] args){
        List<String> sentences = Arrays.asList(
                "A little memory work might be required",
                "I know we can count on your memory",
                "I will count to three",
                "Little by little however my difficulties began to disappear");


// Get the count of every word in the map, key should be the word in lower case, value should be the count of that word across all sentences.
        List<String> words = new ArrayList<>();

        for (String sentence: sentences) {
            String[] sentenceTokens = sentence.split(" ");
            words.addAll(Arrays.asList(sentenceTokens));
        }

        Map<String, Long> wordCounts = words.stream().collect(
                Collectors.groupingBy(
                        Function.identity(), Collectors.counting()
                )
        );


        System.out.println(wordCounts);
    }
}