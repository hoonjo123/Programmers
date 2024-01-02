import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Last_two {
    public static void main(String[] args) {
        int[] num_List = {2,1,6};
        List<Integer> answer = new ArrayList<>();
        int last = num_List[num_List.length-1];
        int beforeLast = num_List[num_List.length-2];
        for( int i = 0; i < num_List.length; i ++){
            answer.add(num_List[i]);
            if(last > beforeLast) {
                answer.add(last - beforeLast);
            }else{
                answer.add(last * 2);
            }
            System.out.println(answer);
        }

//        num_List.length 와 num_List.length -1의 값을 비교해서 계산하기


    }
}
