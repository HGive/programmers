import java.util.*;
class Solution {
    public long solution(String numbers) {
         Map<String, Long> wordToNum = new HashMap<>();
        wordToNum.put("zero", 0L);
        wordToNum.put("one", 1L);
        wordToNum.put("two", 2L);
        wordToNum.put("three", 3L);
        wordToNum.put("four", 4L);
        wordToNum.put("five", 5L);
        wordToNum.put("six", 6L);
        wordToNum.put("seven", 7L);
        wordToNum.put("eight", 8L);
        wordToNum.put("nine", 9L);
        for(String key : wordToNum.keySet()){
            numbers=numbers.replace(key,String.valueOf(wordToNum.get(key)));
        }
        return Long.parseLong(numbers);
    }
}