import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> rankMap = new HashMap<>();
        for(int i = 0 ; i<players.length ; i++){
            rankMap.put(players[i],i);
        }
        
        for(String player : callings){
            int curRank  = rankMap.get(player);
            String beforePlayer = players[curRank - 1];
            
            players[curRank - 1] = player;
            players[curRank] = beforePlayer;
            
            rankMap.put(player , curRank - 1);
            rankMap.put(beforePlayer , curRank);
        }
        return players;
    }
    
}
