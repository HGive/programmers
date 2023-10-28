class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        for(int i = 0 ; i<targets.length; i++){
            int sum = 0;
            for(int j = 0 ; j<targets[i].length();j++){
                int cnt = 1000;
                for(String str : keymap){
                    int idx = str.indexOf(targets[i].charAt(j))+1;
                    if(idx==0){
                        continue;
                    }else if(idx<=cnt){
                        cnt = idx;
                    }
                }
                sum+=cnt;
            }
            if(sum>=1000){
                answer[i]=-1;
            }else{
                answer[i]=sum;    
            }
        }
        return answer;
    }
}