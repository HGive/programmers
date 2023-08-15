class Solution {
    public int[] solution(int[] arr) {
        int leng = arr.length;
        int s = 1;
        while(true){
            if(s>=leng){
                break;
            }
            s*=2;
        }
        int[] answer = new int[s];
        for(int item : answer){
            item= 0;
        }
        for(int i =0; i<leng;i++){
            answer[i]=arr[i];
        }
        return answer;
    }
}