package Basic;

public class Basic02 {
    public static void main(String[] args) {
        //글자 이어 붙여 문자열 만들기
        String my_string = "cvsgiorszzzmrpaqpe";
        int[] index_list = {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};
        String answer = "";
        for(int i = 0; i< index_list.length; i++){
            answer += my_string.charAt(index_list[i]);
        }
        System.out.println(answer);
    }
}
