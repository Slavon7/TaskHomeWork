package org.example.homework_1.task_2;

import java.util.*;

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

    private void parse() {
        StringTokenizer tokens = new StringTokenizer(this.text);
        while (tokens.hasMoreTokens()) {
            String token = tokens.nextToken();
            if (token.startsWith("#")) {
                HashTag.add(token);
            }
        }
    }

    public ArrayList<String> getHashTags() {
        ArrayList<String> unique = new ArrayList<>();
        unique.addAll(HashTag);
        return unique;
    }

}