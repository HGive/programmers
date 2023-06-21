class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        StringBuilder sb = new StringBuilder();
        String[] arr1binary = new String[n];
        String[] arr2binary = new String[n];

        for(int j = 0 ; j<n ;j++){
                sb.setLength(0);
                int cnt = 0;
                while(cnt<n) {
                    if (arr1[j] % 2 == 1) {
                        sb.append("#");
                        arr1[j] /= 2;
                    }else if(arr1[j] % 2==0){
                        sb.append(" ");
                        arr1[j] /= 2;
                    }else{
                        sb.append(" ");
                    }
                    cnt++;
                }
                sb.reverse();
                arr1binary[j]=sb.toString();
            }

        for(int j = 0 ; j<n ;j++){
            sb.setLength(0);
            int cnt =0;
            while(cnt<n) {
                if (arr2[j] % 2 == 1) {
                    sb.append("#");
                    arr2[j] /= 2;
                } else if(arr2[j] % 2 == 0){
                    sb.append(" ");
                    arr2[j] /= 2;
                }else{
                    sb.append(" ");
                }
                cnt++;
            }
            sb.reverse();
            arr2binary[j]=sb.toString();
        }
        for(int i =0; i<n;i++){
            answer[i]="";
            for(int j =0;j<n;j++){
                if(arr1binary[i].charAt(j)=='#'||arr2binary[i].charAt(j)=='#'){
                    answer[i]+="#";
                }else{
                    answer[i]+=" ";
                }
            }
        }
        System.out.println(answer.toString());
        return answer;
    }
}