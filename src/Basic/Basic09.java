package Basic;

import java.util.ArrayList;
import java.util.List;

public class Basic09 {
    public static void main(String[] args) {
        //홀수 vs 짝수

        int[] num_list = {4, 2, 6, 1, 7, 6};
        int even = 0; //짝수 원소들의 합을 저장할 변수
        int odd = 0; //홀수 원소들의 합을 저장할 변수


        for( int i = 0; i<num_list.length; i++){
            if( i % 2 != 0){
                odd += num_list[i];
            }else if( i % 2 ==0){
                even += num_list[i];
            }
        }
        System.out.println(Math.max(even,odd)); //// 두 합 중 큰 값을 반환
    }
}
