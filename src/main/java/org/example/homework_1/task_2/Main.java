package org.example.homework_1.task_2;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String... args) {

        ArrayList<String> comments = new ArrayList<>();

        comments.add("""
                Such a #charming capture.
                Well I think this is often my #favorite #posture of #yours.
                Hello, you #seem truly #charming in this as #always .
                Just #divinely #gorgeous .
                You have got such an excellent #smile !
                You’re so #charming, I can`t deal
                All-time #favorite
                You are the #light in the #darkness !
                You`ve got so #charming and #lovely #grin that indeed #God gives you each #chance to #smile .
                Most #favorite wali #picture
                Keep grinning continuously expensive, you see so charming and lovely after you #smile
                Your #smile is fair enchanted and magnificent
                Your #picture made my morning Special
                """);
        System.out.println(comments);

        foundHashTagsWords(comments);
    }

    public static Map<String, Long> foundHashTagsWords(ArrayList<String> comments){

        HashTag hashTag = HashTag.getHashTag(comments.toString());

        ArrayList<String> copyHashWords = new ArrayList<>(hashTag.getHashTags());

        Map<String, Long> popHashTags = copyHashWords
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));



        Map<String, Long> sortedHashtags = new LinkedHashMap<>();
        popHashTags.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .limit(5)
                .forEach(entry -> sortedHashtags.put(entry.getKey(), entry.getValue()));

        System.out.println(sortedHashtags);

        return sortedHashtags;
    }
}