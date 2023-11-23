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
                int lDistance=Math.abs(number-l)/3+Math.abs(number-l)%3;
                int rDistance=Math.abs(number-r)/3+Math.abs(number-r)%3;
                if(lDistance>rDistance){
                    sb.append("R");
                    r=number;
                }else if(lDistance<rDistance){
                    sb.append("L");
                    l=number;
                }else{
                    if(hand.equals("right")){r=number;
                                            sb.append("R");}
                    else{l=number;
                        sb.append("L");} 
                }
            }
        }
        return sb.toString();
    }
    
    
}