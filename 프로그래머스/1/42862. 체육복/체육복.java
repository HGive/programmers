import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        
        int[] people = new int[n];
        int answer = n;

        for (int l : lost) 
            people[l-1]--;
        for (int r : reserve) 
            people[r-1]++;

        for (int i = 0; i < people.length; i++) {
            if(people[i] == -1) {
                if(i-1>=0 && people[i-1] == 1) {
                    people[i]++;
                    people[i-1]--;
                }else if(i+1< people.length && people[i+1] == 1) {
                    people[i]++;
                    people[i+1]--;
                }else 
                    answer--;
            }
        }
        return answer;
//         int answer = n-lost.length;
//         int cnt = 0 ;
        
//         // 리스트로 변환하는 과정
//         ArrayList<Integer> reserveList = new ArrayList<>();
//         for(int a : reserve){
//             reserveList.add(a);
//         }
//         ArrayList<Integer> lostList = new ArrayList<>();
//         for(int a : lost){
//             lostList.add(a);
//         }
//         Collections.sort(reserveList);
//         Collections.sort(lostList);
        
//         //여분의 옷을 가졌지만 본인이 잃어버렸을 때
//         Iterator<Integer> iter = reserveList.iterator();
//         while(iter.hasNext()){
//             int currentReserve = iter.next();
//             if(lostList.contains(currentReserve)){
//                 cnt++;
//                 lostList.remove(Integer.valueOf(currentReserve));
//                 iter.remove();
//             }
//         }
        
//         Iterator<Integer> iter2 = reserveList.iterator();
//         while(iter2.hasNext()){
//             int currentReserve = iter2.next();
//             if(lostList.contains(currentReserve-1)){
//                 cnt++;
//                 lostList.remove(Integer.valueOf(currentReserve-1));
//                 iter2.remove();
//             }else if(lostList.contains(currentReserve+1)){
//                 cnt++;
//                 lostList.remove(Integer.valueOf(currentReserve+1));
//                 iter2.remove();
//             }
//         }
//         return answer+cnt;
    }
}