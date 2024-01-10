import java.util.Arrays;

public class Lotto {
    public static void main(String[] args) {
        //로또의 최고 순위와 최저순위
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};
//        이때, 당첨 가능한 최고 순위와 최저 순위를 차례대로 배열에 담아서
        int[] rank = {6,6,5,4,3,2,1};
        int[] answer = new int[2];//최고순위와 최저순위


        for (int i = 0; i < lottos.length; i++) {
            if( lottos[i]==0){
                answer[0]++;
                continue;
            }
            for (int j = 0; j < win_nums.length; j++) {
                if (lottos[i] == win_nums[j]){
                    answer[0]++;
                    answer[1]++;
                }
            }
        }
        answer[0] = rank[answer[0]];
        answer[1] = rank[answer[1]];

        System.out.println(Arrays.toString(answer));
    }
}
