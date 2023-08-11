class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] parts = binomial.split(" ");
       int num1 = Integer.parseInt(parts[0]); 
        String operator = parts[1];
        int num2 = Integer.parseInt(parts[2]);
        switch(operator){
            case "+":
                answer = num1 + num2;
                break;
                case "-":
                answer = num1 - num2;
                break;
                case "*":
                answer = num1 * num2;
                break;
        }
        return answer;
    }
}