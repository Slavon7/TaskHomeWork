package org.example.homework_1.task_2;

import java.util.*;

/**
 * @author Omenyuk Vyacheslav .
 */

public class HashTag {
    private final List<String> HashTag = new ArrayList<>();

    private String text;

    private HashTag() {}

    public static HashTag getHashTag(String comments) {
        HashTag hashTag = new HashTag();
        hashTag.text = comments;
        hashTag.parse();
        return hashTag;
    }

    /* Search method for the < # > sign */
    private void parse() {
        StringTokenizer tokens = new StringTokenizer(this.text);
        while (tokens.hasMoreTokens()) {
            String token = tokens.nextToken();
            if (token.startsWith("#")) {
                HashTag.add(token);
            }
        }
    }
    /* Takes an arraylist and returns words with # */
    public ArrayList<String> getHashTags() {
        ArrayList<String> unique = new ArrayList<>();
        unique.addAll(HashTag);
        return unique;
    }

}