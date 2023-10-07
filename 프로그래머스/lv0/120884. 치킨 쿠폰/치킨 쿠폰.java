class Solution {
    public int solution(int chicken) {
        int totalChickens = chicken;
        int coupon = chicken;
        int serviceChicken = 0;
        while(coupon>=10){
            int additionalChicken = coupon/10;
            serviceChicken += additionalChicken;
            coupon %= 10;
            
            coupon += additionalChicken;
        }
        
        return serviceChicken;
    }
}






