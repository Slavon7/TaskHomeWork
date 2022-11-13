package org.example.homework_1.task_2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class HashTags {

    @Test
    void main() {
    }

    @Test
    void foundHashTagsWords() {

        ArrayList<String> comments = new ArrayList<>(5);
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


        Map<String, Long> result = new LinkedHashMap<>();
        result.put("#smile", 4l);
        result.put("#favorite",3l);
        result.put("#charming",3l);
        result.put("#picture",2l);
        result.put("#gorgeous",1l);

        Map<String, Long> actual = Main.foundHashTagsWords(comments);
        assertEquals(result, actual);

    }
}