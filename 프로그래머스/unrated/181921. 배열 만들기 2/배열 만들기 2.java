import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = l; i<=r ; i++){
            boolean b = true;
            int cnt = 0;
            String s = ""+ i; //505
            for(int j = 0;j<s.length();j++){
                if(s.charAt(j)!='0'&&s.charAt(j)!='5'){
                    b= false;
                }
            }
            if(b){
                arr.add(i);    
            }
          }
        int arrSize = arr.size();
        
        if(arrSize!=0){
            int[] answer = new int[arrSize];
        for(int i = 0; i<arrSize;i++){
            answer[i]=arr.get(i);
        }
            return answer;
        }else{
            int[] answer = {-1};
            return answer;
        }
        
}
}