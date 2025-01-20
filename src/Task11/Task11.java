package Task11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task11 {
    public static void main(String[] args) {
        String message = "How are you? This is a test. What is your name? Hello world! Is this a question?";
        for(String i : findQuestion(message)) {
            System.out.println(i);
        }
    }

    public static List<String> findQuestion(String m) {
        List<String> list = new ArrayList<>();
        String[] sentences = m.split("[.!?]");
        for(String s : sentences) {
            String sentence = s.trim();
            if(m.contains(sentence + "?")) {
                list.add(sentence + "?");
            }
        }
        return list;
    }
}
