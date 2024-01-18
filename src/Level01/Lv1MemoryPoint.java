package Level01;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Lv1MemoryPoint {
    public static void main(String[] args) {
        //추억점수
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {
                {"may", "kein", "kain", "radi"},
                {"may", "kein", "brin", "deny"},
                {"kon", "kain", "may", "coni"}
        };

        int[] answer = new int[photo.length];
        Map<String,Integer> point = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            point.put(name[i], yearning[i]);
        }

        for (int i = 0; i < photo.length; i++) {
            String[] person = photo[i];
            int score = 0;
            for (int j = 0; j < person.length; j++) {
                String personName = person[j];
                if (point.containsKey(personName)) {
                    score += point.get(personName);
                }
            }
            answer[i] = score;
        }
        System.out.println(Arrays.toString(answer));
    }
}
