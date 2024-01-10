import java.util.*;

public class KakaoSeongKyeok {
    public static void main(String[] args) {
        // Example usage
        String[] survey = {"RT", "CF", "JM", "AN"};
        int[] choices = {1, 2, 3, 4};

        Solution solutionObject = new Solution(); // 오타 수정: new Solution()으로 변경
        String result = solutionObject.solution(survey, choices);

        System.out.println(result);
    }
}

class Solution {
    public String solution(String[] survey, int[] choices) {
        int n = survey.length;
        HashMap<Character, Integer> score = new HashMap<>();

        for (int i = 0; i < n; i++) {
            char c0 = survey[i].charAt(0);
            char c1 = survey[i].charAt(1);
            if (choices[i] <= 3)
                score.put(c0, score.getOrDefault(c0, 0) + 4 - choices[i]);
            else
                score.put(c1, score.getOrDefault(c1, 0) + choices[i] - 4);
        }

        String answer = "";
        if (score.getOrDefault('R', 0) >= score.getOrDefault('T', 0))
            answer += "R";
        else
            answer += "T";

        if (score.getOrDefault('C', 0) >= score.getOrDefault('F', 0))
            answer += "C";
        else
            answer += "F";

        if (score.getOrDefault('J', 0) >= score.getOrDefault('M', 0))
            answer += "J";
        else
            answer += "M";

        if (score.getOrDefault('A', 0) >= score.getOrDefault('N', 0))
            answer += "A";
        else
            answer += "N";

        return answer;
    }
}
