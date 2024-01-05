package Basic;

import java.util.ArrayList;
import java.util.List;

public class Basic08 {
    public static void main(String[] args) {
        //n개 간격의 원소들
        int[] num_list = {4, 2, 6, 1, 7, 6};

        int n = 2;
        List<Integer> answer = new ArrayList<>();
        for(int i = 0; i< num_list.length; i += n){
//            각 반복에서 배열을 n 간격으로 건너뛰면서 원소를 가져오기 위한 것
            answer.add(num_list[i]);

        }
        System.out.println(answer);
    }
}
