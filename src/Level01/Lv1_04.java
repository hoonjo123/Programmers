package Level01;

import java.util.Arrays;

public class Lv1_04 {
    public static void main(String[] args) {
        //바탕화면 정리
        String[] wallpaper = {".#...", "..#..", "...#."};
        int[] answer = new int[4];

        answer[0] = wallpaper.length;
        answer[1] = wallpaper[0].length();
        answer[2] = 0;
        answer[3] = 0;
        for (int i = 0; i < wallpaper.length; i++) {
            String[] str = wallpaper[i].split(" ");
            for (int j = 0; j < str.length; j++) {
                if ("#".equals(str[j])) {
                    answer[0] = Math.min(answer[0], i);
                    answer[1] = Math.min(answer[1], j);
                    answer[2] = Math.max(answer[2], i);
                    answer[3] = Math.max(answer[3], j);
                }
            }
            answer[2] += 1;
            answer[3] += 1;

            System.out.println(Arrays.toString(answer));

        }


    }
}
