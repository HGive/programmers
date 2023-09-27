import java.util.*;
class Solution {
    public int[] solution(int[] numlist, int n) {
        Map<Integer,Integer> hm = new HashMap<>();
        for(int i = 0; i<numlist.length;i++){
            hm.put(numlist[i],Math.abs(n-numlist[i]));
        }
        List<Map.Entry<Integer,Integer>> entryList = new ArrayList<>(hm.entrySet());
        Collections.sort(entryList,new Comparator<Map.Entry<Integer,Integer>>(){
            public int compare(Map.Entry<Integer, Integer> a, Map.Entry<Integer, Integer> b) {
    if (!a.getValue().equals(b.getValue())) {
        return a.getValue().compareTo(b.getValue());
    } else {
        return b.getKey().compareTo(a.getKey());
    }
}
        });
        return entryList.stream().mapToInt(Map.Entry::getKey).toArray();
    }
}