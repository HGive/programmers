class Solution {
    public int[] solution(String[] wallpaper) {
        int lux= 50;
        int luy= 50;
        int rdx= 0;
        int rdy= 0;
        for(int i = 0 ; i<wallpaper.length;i++){
            String file = wallpaper[i];
            int start = file.indexOf("#");
            int end = file.lastIndexOf("#");
            if(start!=-1){
                if(i<=lux) lux = i;
                if(start<=luy) luy = start;
                if(end>=rdy) rdy = end;
                if(i>=rdx) rdx = i;
            }
        }
        int[] answer = new int[]{lux,luy,rdx+1,rdy+1};
        return answer;
    }
}