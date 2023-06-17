class Solution {
    public boolean solution(int x) {
        int sum =0;
        int mo = x;
        while(x!=0){
            sum+=x%10;
            x/=10;
        }
       
        
        return (mo%sum==0)?true:false;
    }
}