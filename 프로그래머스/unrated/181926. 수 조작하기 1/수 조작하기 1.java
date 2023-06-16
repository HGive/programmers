class Solution {
    public int solution(int n, String control) {
        int num = n;
        for(char c : control.toCharArray()){
            switch(c){
                case 'w':
                    num+=1;
                    break;
                case 's':
                    num-=1;
                    break;
                case 'd':
                    num+=10;
                    break;
                case 'a':
                    num-=10;
                    break;
                default:
                    break;
            }
        }
        return num;
    }
}