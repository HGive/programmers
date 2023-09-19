class Solution {
    public String[] solution(String[] quiz) {
        int leng = quiz.length;
        String[] answer = new String[leng];
        for(int i = 0 ;i <leng;i++){
            quiz[i]=quiz[i].replace("+ ","").replace("- ","-").replace("= ","").replace("--","+");
            String[] temp = quiz[i].split(" ");
            if(Integer.parseInt(temp[0])+Integer.parseInt(temp[1])==Integer.parseInt(temp[2])){
                answer[i]="O";
            }else{
                answer[i]="X";
            }
        }
        return answer;
    }
}