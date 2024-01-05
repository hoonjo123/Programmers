package Basic;

import java.util.ArrayList;
import java.util.List;

public class Basic05 {
    public static void main(String[] args) {
//        n번째 원소부터
        int[] num_list = {2, 1, 6};
        int n = 3;
        List<Integer> answer = new ArrayList<>();
        for(int i = n-1; i<num_list.length; i++){
            answer.add(num_list[i]);
        }
        System.out.println(answer);
    }
}
