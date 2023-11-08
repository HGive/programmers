import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> onBridge = new LinkedList<>();
        Queue<Integer> trucks = new LinkedList<>();
        int time = 0;
        int bridge_weight = 0;
        
        for(int truck : truck_weights){  //q에 트럭 넣어줌.
            trucks.offer(truck);
        }
        
        while(!trucks.isEmpty()){
            if(onBridge.isEmpty()){
                bridge_weight+=trucks.peek();
                onBridge.offer(trucks.poll());
                time++;
            }else if(onBridge.size()==bridge_length){
                bridge_weight-=onBridge.poll();
            }else{
                if(bridge_weight+trucks.peek()<=weight){
                    bridge_weight+=trucks.peek();
                    onBridge.offer(trucks.poll());
                    time++;
                }else{
                    onBridge.offer(0);
                    time++;
                }
            }
        }
        
        return time+bridge_length;
    }
}