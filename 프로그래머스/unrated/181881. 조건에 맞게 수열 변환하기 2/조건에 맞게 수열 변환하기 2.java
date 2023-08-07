import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int answer = 1;
        int[] newArr= arr;
         if(Arrays.equals(newArr,makeArr(newArr))){
                return 0;
         }
        while(true){
            if(Arrays.equals(makeArr(newArr), makeArr(makeArr(newArr)))){
                break;
            }
            newArr=makeArr(newArr);
            answer++;
        }
        return answer;
    }

    public int[] makeArr(int[] arr){
        int[] answer = new int[arr.length];
        for(int i = 0 ;i<arr.length;i++){
            if(arr[i]>=50&&arr[i]%2==0){
                answer[i]=arr[i]/2;
            }else if(arr[i]<50&&arr[i]%2!=0){
                answer[i]=arr[i]*2+1;
            }else{
                answer[i]=arr[i];
            }
        }
        return answer;
    }

}