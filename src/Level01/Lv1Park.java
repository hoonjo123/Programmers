package Level01;

import java.util.Arrays;

public class Lv1Park {
    public static void main(String[] args) {
        //공원산책
        String[] park = {"SOO","OOO","OOO"};
        String[] routes = {"E 2","S 2","W 1"};

        int[] answer = new int[2];
        //시작지점
        int x = -1;
        int y = -1;
        int height = park.length;
        int width = park[0].length();

        for (int i = 0; i < park.length; i++) {
            if(park[i].indexOf('S') != -1){
                x = park[i].indexOf('S');
                y = i;
                break;
            }
        }
        for (int i = 0; i < routes.length; i++) {
            String[] temp = routes[i].split(" ");
            String v = temp[0];
            int distance = Integer.parseInt(temp[1]);
            int cX = x;
            int cY = y;

            if(v.equals("E")) {
                boolean flag = true;
                for (int j = 1; j <= distance; j++) {
                    cX++;
                    if (cX >= width) {
                        flag = false;
                        break;
                    }
                    else if (park[cY].charAt(cX) == 'X') {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    x = cX;
                }
            }else if(v.equals("W")){
                boolean flag = true;
                for (int j = 1; j <= distance; j++) {
                    cX--;
                    if(cX < 0){
                        flag = false;
                        break;
                    }
                    else if(park[cY].charAt(cX) == 'X'){
                        flag = false;
                        break;
                    }
                }
                if(flag) {
                    x = cX;
                }
            }else if(v.equals("S")){
                boolean flag = true;
                for (int j = 1; j <= distance; j++) {
                    cY++;
                    if(cY >= height){
                        flag = false;
                        break;
                    }else if(park[cY].charAt(cX) == 'X'){
                        flag = false;
                        break;
                    }
                }if(flag) {
                    y = cY;
                }
            }
            else if(v.equals("N")){
                boolean flag = true;
                for (int j = 1; j <= distance; j++) {
                    cY--;
                    if(cY < 0){
                        flag = false;
                        break;
                    }
                    else if(park[cY].charAt(cX) == 'X') {
                        flag = false;
                        break;
                    }
                }
                if(flag) {
                    y = cY;
                }
            }
        }
        answer[0] = y;
        answer[1] = x;
        System.out.println(Arrays.toString(answer));
    }
}
