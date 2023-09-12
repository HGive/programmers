import java.util.*;
class Solution {
    public String solution(String my_string) {
        String[] arr = my_string.split("");
        Set<String> hs = new LinkedHashSet<>(Arrays.asList(arr));
    return String.join("",hs);
    }
}