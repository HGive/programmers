import java.util.*;

class Solution {
    class Fail{
        int stage;
        double failRate;
        Fail(int stage, double failRate){
            this.stage=stage;
            this.failRate = failRate;
        }
    }
    Comparator<Fail> comp = new Comparator<>(){
        public int compare(Fail a, Fail b){
            if(a.failRate < b.failRate) {return 1;}
            else if (a.failRate > b.failRate) {return -1;}
            else {
                if(a.stage > b.stage) {return 1;}
                else if(a.stage < b.stage) {return -1;}
                else{
                    return 0;
                }
            }
        }
    };
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        List<Fail> fails = new ArrayList<>();
        int total = stages.length;
        
        int[] users = new int[N+1];
        for(int s : stages){
            users[s-1]++;
        }
        
        for(int i = 0; i<N; i++){
            if(users[i] == 0){
                fails.add(new Fail(i+1,0));
            }else{
                fails.add(new Fail(i+1,(double)users[i]/total));
                total-=users[i];
            }
        }
    
        Collections.sort(fails,comp);
        for(int i = 0 ; i<N; i++){
            answer[i] = fails.get(i).stage;
        }
        return answer;
    }
}