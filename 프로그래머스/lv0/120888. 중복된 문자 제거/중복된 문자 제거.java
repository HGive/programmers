class Solution {
    public String solution(String my_string) {
        StringBuilder result = new StringBuilder(); 
    for (int i = 0; i < my_string.length(); i++) {
        char currentChar = my_string.charAt(i);
        if (!result.toString().contains(String.valueOf(currentChar))) { 
            result.append(currentChar);
        }
    }
    return result.toString();
    }
}