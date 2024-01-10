import java.util.HashMap;
import java.util.Map;

public class Kakao {
    public static void main(String[] args) {
        // 오픈채팅방
        // 김크루 -> 관리자창만들기로함
        // 들어오면 "[닉네임]님이 들어왔습니다." 나가면 "[닉네임]님이 나갔습니다."
        // 닉네임 변경 -> 나간 후 들어오기, 내부자체변경/ 변경 시 기존 메시지 닉네임 저눕 변경
        // record 매개변수 String[] record = 가 주어짐 {{들어오고 , 나가고, 닉네임 변경 기록}}
        // enter id nick // leave id // change id nick

        // 입출력 예시 - Muzi, prodo 입장 -> Muzi 퇴장 -> prodo로닉네임 바꿔서 다시 입장 -> prodo가 Ryan으로 닉네임변경
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};

        // 특정 아이디가 마지막으로 사용한 닉네임 파악 -> 아이디를 닉네임으로 바꾸는 방식
        // 아이디가 어떤 닉네임을 사용하는가를 저장해야하므로 Map 사용, 닉네임 변경 사항을 map에 저장

        Map<String, String> idMap = new HashMap<>(); // id - nick에 대한 map
        // 입장? 퇴장? 1. 행동 2. 아이디 3. 닉네임 세 가지로 분류한다.
        // 퇴장시 - continue를 사용해서 탐색 종료.
        // 입장 - 아이디, 닉네임 map 저장
        // 닉넴 변경 - 아이디, 닉넴 map 저장 -> 카운트? 값으로 메시지 표시 안되는 수만큼 증가 시켜주기
        int count = 0; // message에 표시가 안되는 수를 카운트(닉네임 변경시 메시지 표시 안됨)

        for (int i = 0; i < record.length; i++) {
            String[] info = record[i].split(" ");

            if (info[0].equals("Leave")) { // 나갈 때
                continue;
            } else if (info[0].equals("Enter")) {
                idMap.put(info[1], info[2]); // 들어올 때
            } else {
                idMap.put(info[1], info[2]); // 닉네임 변경
                count++;
            }
        }

        String[] answer = new String[record.length - count]; // 메시지 담을 배열 선언 후 제외시킬 count 초기화
        int idx = 0; // 배열의 인덱스 지정하는 변수

        // 공백 기준으로 split 후 들어오는 경우와 나가는 경우에 대한 메시지만 작성하여 저장
        // 닉네임 -> Key, idMap에서 value 가져오기
        for (int i = 0; i < record.length; i++) {
            String[] info = record[i].split(" ");
            String nick = idMap.get(info[1]);

            if (info[0].equals("Enter")) {
                answer[idx++] = nick + "님이 들어왔습니다.";
            } else if (info[0].equals("Leave")) {
                answer[idx++] = nick + "님이 나갔습니다.";
            }
        }

        // 결과 확인을 위해 출력
        for (String msg : answer) {
            System.out.println(msg);
        }
    }
}
