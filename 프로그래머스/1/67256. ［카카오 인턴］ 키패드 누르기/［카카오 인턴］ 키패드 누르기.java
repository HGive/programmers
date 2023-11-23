class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        int l = 10;
        int r = 12;
        
        for(int number : numbers){
            if(number==1 || number==4 || number==7){
                sb.append("L");
                l=number;
            }else if(number==3 || number==6 || number==9){
                sb.append("R");
                r=number;
            }else{
                if(number==0) number=11;
                char closeHand = getCloseHand(number,l,r,hand);
                sb.append(closeHand);
                if(closeHand=='R'){
                    r=number;
                }else{
                    l=number;
                }
            }
        }
        return sb.toString();
        
    }
    
    private char getCloseHand(int number, int l ,int r, String hand){

        int lDistance=Math.abs(number-l)/3+Math.abs(number-l)%3;
        int rDistance=Math.abs(number-r)/3+Math.abs(number-r)%3;
        if(lDistance>rDistance){
            return 'R';
        }else if(lDistance<rDistance){
            return 'L';
        }else{
            if(hand.equals("right")){
                return 'R';
            } else{
                return 'L';
            } 
        }
    }
    
}