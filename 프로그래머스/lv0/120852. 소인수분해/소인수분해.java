import java.util.*;
class Solution {
    public int[] solution(int n) {
        Set<Integer> hs = new LinkedHashSet<>();
        for(int i = 2 ; i<=n ; i++){
            while(n%i==0){
                hs.add(i);
                n/=i;
            }
        }
        List<Integer> arr = new ArrayList<>(hs);
        return arr.stream().mapToInt(i->i).toArray();
    }
}