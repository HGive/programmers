class Solution {
    
    boolean solution(String s) {
        int cnt=0;
        String[] a = s.toLowerCase().split("");
        for(int i =0;i<a.length;i++){
            if(a[i].equals("p")){
                cnt++;
            }else if(a[i].equals("y")){
                cnt--;
            }
        }
        return cnt==0;
    }
}