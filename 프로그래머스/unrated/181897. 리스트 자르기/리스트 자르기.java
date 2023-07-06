import java.util.*;
import java.util.stream.IntStream;
class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        switch(n){
            case 1:
            answer = Arrays.copyOf(num_list, slicer[1] + 1);
            break;
        case 2:
            answer = Arrays.copyOfRange(num_list, slicer[0], num_list.length);
            break;
        case 3:
            answer = Arrays.copyOfRange(num_list, slicer[0], slicer[1] + 1);
            break;
        case 4:
            answer = IntStream
                .range(0, (slicer[1] - slicer[0]) / slicer[2] + 1)
                .map(i -> num_list[slicer[0] + i * slicer[2]]).toArray();
            break;
        }
        return answer;
    }
}
// case 1:
//                 for(int i = 0 ; i<= slicer[1] ; i++){
//                     list.add(num_list[i]);
//                 }
//                 break;
//             case 2:
//                 for(int i = slicer[0] ; i< num_list.length ; i++){
//                     list.add(num_list[i]);
//                 }
//                 break;
//             case 3:
//                 for(int i = slicer[0] ; i<= slicer[1] ; i++){
//                     list.add(num_list[i]);
//                 }
//                 break;
//             case 4:
//                 for(int i = slicer[0] ; i<= slicer[1] ; i+=slicer[2]){
//                     list.add(num_list[i]);
//                 }
//                 break;
// 