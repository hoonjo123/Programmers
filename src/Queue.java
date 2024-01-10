import java.util.*;

public class Queue {
    public static void main(String[] args) {
        String[] operations = {"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"};
        // | : 큐에 주어진 숫자 삽입
        // d 1 : 최댓값 삭제
        // d -1 : 최솟값 삭제

        //1. 최댓값과 최솟값을 구하는문제
        //시간 복잡도는 log n( 이진 힙을 기반으로 구현)

        int[] answer = new int[2];
        //최소힙으로 구성된 우선순위 큐
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        //최대힙으로 구성된 우선순위 큐
        PriorityQueue<Integer> maxPq = new PriorityQueue<>(Collections.reverseOrder());

        for( String x : operations) {
            //스트링 토크나이저를 사용하여 연산의 종류와 값을 분리
            StringTokenizer ST = new StringTokenizer(x);
            String judge = ST.nextToken();
            int value = Integer.parseInt(ST.nextToken());

            //최소힙으로 구성된 큐가 비어있거나 현재연산이 삭제연산인 "D"인지 확인해줄것.
            //NoSuchElementException 예외가 발생한다.
            //큐가 비어있을때 삭제연산이면 -> 생략!
            if (pq.size() == 0 && judge.equals("D"))
                continue;

            if(judge.equals("I")){
                pq.offer(value);//작은숫자가 우선순위를 갖는다.
                maxPq.offer(value); //큰 숫자가 우선순위를 갖는다.
                continue;
            }
            if(value < 0){
                //value가 음수일경우 -> D연산에서 최솟값을 삭제해야 하는 경우
                int min = pq.poll();
                maxPq.remove(min);
                continue;
                //큐의 상태를 유지하기 위해 최소힙에서 뽑은 값을 min에 저장해두고
//                최대힙에서 최소값을 지워줌
            }
            int max = maxPq.poll();
            pq.remove(max);
        }
        if(pq.size() > 0){
            //0보다 크다는건 큐가 비어있지 않을경우
            answer[0] = maxPq.poll();
            answer[1] = pq.poll();
        }
        System.out.println(Arrays.toString(answer));

        String s = "1234";
        int n = 12;
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if( n % i == 0){
                list.add(i);
            }
        }
        System.out.println(list);
    }
}
