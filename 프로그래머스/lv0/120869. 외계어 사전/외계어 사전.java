class Solution {
    public int solution(String[] spell, String[] dic) {
        int len = spell.length;
        for(String str : dic){
            if(str.length()!=len){
                    continue;
                }
            boolean allCharExist = true;
            for(String a : spell){
                if(!str.contains(a)){
                    allCharExist = false;
                    break;
                }else{
                    str=str.replace(a,"");
                }
            }
            if(allCharExist && str.isEmpty()){
                return 1;
            }
        }
        return 2;
    }
}