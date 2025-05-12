def number_to_pwr(number, p): 
    # your code here
    if p == 0 :
        return 1
    
    return number*number_to_pwr(number, p-1)