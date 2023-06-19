import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] l1 = {1,2,3,4,5};
        int[] l2 = {2,1,2,3,2,4,2,5};
        int[] l3 = {3,3,1,1,2,2,4,4,5,5};
        int[] cnt = new int[3];
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0 ; i<answers.length;i++){
            if(answers[i]==l1[i%5])cnt[0]++;
            if(answers[i]==l2[i%8])cnt[1]++;
            if(answers[i]==l3[i%10])cnt[2]++;
        }
        int max = Math.max(cnt[0],Math.max(cnt[1],cnt[2]));
        
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(max==cnt[0])result.add(1);
        if(max==cnt[1])result.add(2);
        if(max==cnt[2])result.add(3);
        int[] answer = new int[result.size()];
        for(int i = 0; i<result.size();i++){
            answer[i]= result.get(i);
        }
        return answer;
    }
}


// ArrayList<Integer> answer = new ArrayList<Integer>();
//         Integer[] l1 = {1,2,3,4,5};
//         Integer[] l2 = {2,1,2,3,2,4,2,5};
//         Integer[] l3 = {3,3,1,1,2,2,4,4,5,5};
//         ArrayList<Integer> list1 = new ArrayList<Integer>();
//         for(int i = 0 ; i < l1.length;i++){
//             list1.add(l1[i]);
//         }
//         ArrayList<Integer> list2 = new ArrayList<Integer>();
//         for(int i = 0 ; i < l2.length;i++){
//             list2.add(l2[i]);
//         }
//         ArrayList<Integer> list3 = new ArrayList<Integer>();
//         for(int i = 0 ; i < l3.length;i++){
//             list3.add(l3[i]);
//         }
        
//         while(list1.size()<10000){list1.addAll(list1);}
//         while(list2.size()<10000){list2.addAll(list2);}
//         while(list3.size()<10000){list3.addAll(list3);}
//         int cnt1 = 0 ;
//         int cnt2 = 0 ;
//         int cnt3 = 0 ;
       
        
//         for(int i = 0 ; i<answers.length;i++){
//             if(list1.get(i)==answers[i])cnt1++;
//             if(list2.get(i)==answers[i])cnt2++;
//             if(list3.get(i)==answers[i])cnt3++;
//         }
//         int max = Math.max(cnt1,Math.max(cnt2,cnt3));
//         if(cnt1==max){
//             answer.add(1);
//         }
//         if(cnt2==max){
//             answer.add(2);
//         }
//         if(cnt3==max){
//             answer.add(3);
//         }
