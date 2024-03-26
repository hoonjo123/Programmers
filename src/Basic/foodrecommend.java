package Basic;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class foodrecommend {
    public static void main(String[] args) {
        // 음식 리스트
        List<String> foodList = new ArrayList<>();
        foodList.add("국밥");
        foodList.add("포케");
        foodList.add("짬뽕");
        foodList.add("칼국수");
        foodList.add("쌀국수");
        foodList.add("라멘");
        foodList.add("김치찌개");
        foodList.add("햄버거");
        foodList.add("컵밥");
        foodList.add("생선구이");
        foodList.add("맛짱");
        foodList.add("부대찌개");
        foodList.add("짬뽕");

        Scanner scanner = new Scanner(System.in);
        System.out.println("무엇을 도와드릴까요? ('추천'을 입력하면 랜덤으로 음식을 추천해드립니다)");

        String input = scanner.nextLine();


        if ("추천".equals(input)) {
            Random random = new Random();
            int index = random.nextInt(foodList.size());
            System.out.println("오늘의 추천 음식은: " + foodList.get(index));
        } else {
            System.out.println("알 수 없는 명령어입니다. 프로그램을 종료합니다.");
        }


        scanner.close();
    }
}
