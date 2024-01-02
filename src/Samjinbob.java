public class Samjinbob {
    public static void main(String[] args) {
        //n을 3진법으로 변환한다.
        //앞뒤로 뒤집고
        //10진법으로 표현한다.
        int n = 45;
        String str = "";

        while( n != 0){
            str = str + ( n % 3 );
            n /= 3;
        }

        System.out.println(Integer.parseInt(str,3));
    }
}
