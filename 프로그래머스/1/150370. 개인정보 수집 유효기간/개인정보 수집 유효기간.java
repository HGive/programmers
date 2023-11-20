import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        int idx = 0;
        // 날짜 포맷 지정
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        LocalDate todayTime = LocalDate.parse(today, formatter);
        
        List<Integer> expired = new ArrayList<>();
        Map<String,Integer> termsList = new HashMap<>();
        //terms map에 담음
        for(String term : terms){
            String[] temp = term.split(" ");
            termsList.put(temp[0],Integer.parseInt(temp[1]));
        }
        for(String privacy : privacies){
            idx++;
            String[] privacyArr = privacy.split(" ");
            String privacyType = privacyArr[1];
            LocalDate privacyTime = LocalDate.parse(privacyArr[0],formatter);
            privacyTime = privacyTime.plusMonths(termsList.get(privacyType));
            if(!privacyTime.isAfter(todayTime)){
                expired.add(idx);
            }
        }
        
        int[] answer = new int[expired.size()];
        for(int i = 0 ;i<answer.length; i++){
            answer[i]= expired.get(i);
        }
        
        return answer;
    }
}