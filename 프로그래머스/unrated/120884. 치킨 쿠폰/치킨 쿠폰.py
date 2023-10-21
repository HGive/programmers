def solution(chicken):
    service = 0
    coupon = chicken
    while coupon>=10 :
        additional  = coupon//10
        service += additional
        coupon = coupon%10 + additional
    return service