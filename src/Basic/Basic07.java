package Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Basic07 {
    public static void main(String[] args) {
        // 뒤에서 5등 위로
        int[] num_list = {12, 4, 15, 46, 38, 1, 14, 56, 32, 10};
        List<Integer> answer = new ArrayList<>();
        Arrays.sort(num_list);

        for(int i = 5; i<num_list.length; i++){
            answer.add(num_list[i]);
        }
        System.out.println(answer);
    }
}
