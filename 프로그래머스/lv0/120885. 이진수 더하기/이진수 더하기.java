import java.math.BigInteger;
class Solution {
    public String solution(String bin1, String bin2) {
        // 문자열로 표현된 이진수를 BigInteger로 변환
        BigInteger num1 = new BigInteger(bin1, 2);
        BigInteger num2 = new BigInteger(bin2, 2);

        // 두 수를 더한 결과를 이진수 문자열로 변환
        return num1.add(num2).toString(2);
    }
}