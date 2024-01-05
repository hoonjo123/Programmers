import java.util.ArrayList;
import java.util.List;

public class su_jojak {
    public static void main(String[] args) {
        String control = "wsdawsdassw";
        int answer = 0;

        for(int i = 0; i < control.length(); i++){
            if(control.charAt(i) == 'w'){
                answer += 1;
            }else if(control.charAt(i) == 's'){
                answer -= 1;
            }else if(control.charAt(i) == 'd'){
                answer += 10;
            }else{
                answer -= 10;
            }
            System.out.println(answer);
        }
    }
}
