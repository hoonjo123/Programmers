package Basic;

import java.util.ArrayList;
import java.util.List;

public class Basic13 {
    public static void main(String[] args) {
        int start_num = 3;
        int end_num = 10;

        List<Integer> answer = new ArrayList<>();
        for( int i = start_num; i<end_num+1; i++)
            answer.add(i);
        System.out.println(answer);
    }

}
