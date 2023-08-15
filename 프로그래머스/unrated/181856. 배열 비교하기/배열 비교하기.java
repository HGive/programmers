class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer;
        int sum1=0;
        for(int item1 : arr1){
                sum1+=item1;
            }
        int sum2=0;
        for(int item2 : arr2){
                sum2+=item2;
            }
        answer = compareArr(arr1.length,arr2.length);
        if(answer == 0){
            answer = compareArr(sum1,sum2);
        }
        return answer;
    }
    public int compareArr(int a,int b){
        if(a>b){
            return 1;
        }else if(a<b){
            return -1;
        }else{
            return 0;
        }
    }
}