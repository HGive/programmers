class Solution {
    public String solution(String a, String b) {
        StringBuilder result = new StringBuilder();
        int carry = 0;

        int lengthA = a.length();
        int lengthB = b.length();
        int maxLength = Math.max(lengthA, lengthB);

        for (int i = 0; i < maxLength; i++) {
            int digitA = (i < lengthA) ? Character.getNumericValue(a.charAt(lengthA - i - 1)) : 0;
            int digitB = (i < lengthB) ? Character.getNumericValue(b.charAt(lengthB - i - 1)) : 0;

            int sum = digitA + digitB + carry;
            carry = sum / 10;
            result.insert(0, sum % 10);
        }

        if (carry > 0) {
            result.insert(0, carry);
        }

        return result.toString();
    }
}