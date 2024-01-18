package Level01;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Lv1Running {
    public static void main(String[] args) {
        //달리기경주
        String[] callings = {"kai", "kai", "mine", "mine"};
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] answer = {};
        //맵?
        int numPlayers = players.length;
        Map<String, Integer> ranking = new HashMap<>();

        for (int i = 0; i < numPlayers; i++) {
            ranking.put(players[i],i);
        }

        for(String player : callings){
            int playerRanking = ranking.get(player);
            String front = players[playerRanking-1];
            ranking.replace(front, playerRanking);
            players[playerRanking]=front;
            ranking.replace(player, playerRanking-1);
            players[playerRanking-1]=player;
        }
        System.out.println(Arrays.toString(players));


    }
}
