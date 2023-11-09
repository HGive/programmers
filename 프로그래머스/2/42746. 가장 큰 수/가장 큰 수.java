import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        StringBuilder sb = new StringBuilder();
        String[] strNums = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            strNums[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(strNums, new Comparator<String>(){
            @Override
            public int compare(String a, String b) {
                String order1 = a + b;
                String order2 = b + a;
                return order2.compareTo(order1);
            }
        });
        for (String num : strNums) {
            sb.append(num);
        }
        return sb.toString().startsWith("0")?"0":sb.toString();
    }
}