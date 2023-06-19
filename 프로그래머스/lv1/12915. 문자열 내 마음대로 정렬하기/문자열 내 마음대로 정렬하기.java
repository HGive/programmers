import java.util.*;

class Solution {
    static class MyString{
        String str;
        char strN;
        int idx;

        String getStr(){
            return str;
        }
        char getStrN(){
            return strN;
        }

        MyString(String str,char strN,int idx){
            this.str=str;
            this.strN=strN;
            this.idx=idx;

        }

    }
    public String[] solution(String[] strings, int n) {
        ArrayList<MyString> temp = new ArrayList<MyString>();
             for(int i = 0 ; i<strings.length;i++){
                 temp.add(new MyString(strings[i],strings[i].charAt(n),i));
             }
            Collections.sort(temp, new Comparator<MyString>() {
                @Override
                public int compare(MyString p1, MyString p2) {
                    if (p1.getStrN() != p2.getStrN()) {
                        return p1.getStrN() - p2.getStrN();
                    }
                    return p1.getStr().compareTo(p2.getStr());
                    
                }
            });
             String[] answer = new String[temp.size()];
             for(int i = 0 ;i<temp.size();i++){
                 answer[i]=temp.get(i).getStr();
             }
            return answer;
    }
}