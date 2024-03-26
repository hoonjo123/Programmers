package Level01;

public class Lv1_05 {
    public static void main(String[] args) {

//        내적
        int[] a = {1,2,3,4};
        int[] b = {-3,-1,0,2};
        int answer = 0;

        //for문으로 a 배열 길이만큼 탁색
        //이중for문으로 b 배열 길이만큼 탐색
        //answer = a[0]b[0] + .... a[3]b[3]
        for (int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];

        }
        System.out.println(answer);
    }
}
