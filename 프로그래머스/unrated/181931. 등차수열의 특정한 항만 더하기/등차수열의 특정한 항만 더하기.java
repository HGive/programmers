class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int[] arr = new int[included.length];
        arr[0]=a;
        for(int i = 0 ; i<included.length-1; i++){
            arr[i+1]=arr[i]+d;
        }
        for(int i = 0 ; i<included.length; i++){
            if(included[i]==true){
                answer+=arr[i];
            }
        }
        return answer;
    }
}