class Solution {
    
    boolean solution(String s) {
        int p=0;
        int y=0;
        String[] a = s.toLowerCase().split("");
        for(int i =0;i<a.length;i++){
            if(a[i].equals("p")){
                p++;
            }else if(a[i].equals("y")){
                y++;
            }
        }
        return (p==y?true:false);
    }
}