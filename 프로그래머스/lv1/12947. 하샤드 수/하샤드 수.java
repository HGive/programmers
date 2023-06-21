class Solution {
    public boolean solution(int x) {
        String[] str = String.valueOf(x).split("");
        int sum =0;
        for(String s: str){
            sum+=Integer.parseInt(s);
        }
        // int mo = x;
        // while(x!=0){
        //     sum+=x%10;
        //     x/=10;
        // }
       
        
        return (x%sum==0)?true:false;
    }
}