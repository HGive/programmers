import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] aArr = a.toCharArray();
        for(int i =0;i<a.length();i++){
            if(Character.isUpperCase(aArr[i])){
                aArr[i]=Character.toLowerCase(aArr[i]);
            }else if(Character.isLowerCase(aArr[i])){
                aArr[i] = Character.toUpperCase(aArr[i]);
            }
        }
        System.out.print(aArr);
    }
}