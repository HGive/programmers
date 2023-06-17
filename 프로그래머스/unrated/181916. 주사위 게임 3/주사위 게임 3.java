import java.util.*;
class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
            int[] arr = {a,b,c,d};
            Arrays.sort(arr);
            if(a==b&&b==c&&c==d){
                answer = 1111*a;
            }else if(a==b&&b==c&&c!=d){
                answer = (int) Math.pow(10*a+d,2);
            }else if(a!=b&&b==c&&c==d){
                answer = (int) Math.pow(10*d+a,2);
            }else if(a==d&&b!=c&&c==d){
                answer = (int) Math.pow(10*a+b,2);
            }else if(a==b&&b!=c&&a==d){
                answer = (int) Math.pow(10*a+c,2);
            }

            else if(a==b&&b!=c&&c==d){
                answer= (b+c)*Math.abs(b-c);
            }else if(a==c&&c!=d&&b==d){
                answer= (c+d)*Math.abs(d-c);
            }
            else if(a==d&&d!=c&&c==b){
                answer= (d+c)*Math.abs(d-c);
            }

            else if(a==b&&b!=c&&c!=d){
                answer= c*d;
            }else if(a==c&&c!=d&&d!=b){
                answer= b*d;
            }else if(a==d&&d!=c&&c!=b){
                answer= c*b;
            }else if(b==c&&c!=d&&d!=a){
                answer= a*d;
            }else if(c==d&&d!=a&&a!=b){
                answer= a*b;
            }else if(b==d&&d!=a&&a!=c){
                answer= a*c;
            }
            else if(a!=b&&b!=c&&c!=d){
                answer= arr[0];
            }


            return answer;
    }
}