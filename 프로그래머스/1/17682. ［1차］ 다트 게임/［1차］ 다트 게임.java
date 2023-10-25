class Solution {
        public int solution(String dartResult) {
        StringBuilder sb = new StringBuilder();
        int answer = 0;
        String[] strArr = dartResult.split("");
        int[] dart = new int[3];
        int idx = 0;
        for(String str : strArr){
            if(str.matches("[0-9]")){
                sb.append(str);
            }else if(str.matches("[A-Z]")){
                int number = Integer.parseInt(sb.toString());
                if(str.equals("S")){
                    dart[idx++]= number;
                } else if (str.equals("D")) {
                    dart[idx++] = (int)Math.pow(number,2);
                }else{
                    dart[idx++] = (int)Math.pow(number,3);
                }
                sb.setLength(0);
            }else{
                if(str.equals("*")){
                    dart[idx-1]*=2;
                    if(idx-2>=0) dart[idx-2]*=2;
                }else{
                    dart[idx-1] *= -1;
                }
            }
        }
        return dart[0]+dart[1]+dart[2];
    }
}