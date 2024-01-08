package Basic;

public class Basic10 {
    public static void main(String[] args) {
        //부분 문자열
        String str1 = "abc";
        String str2 = "aabcc";
        //contains() 를 이용
        if(str2.contains(str1)) {
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
