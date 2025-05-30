​
def sum_array(a):
    sum = 0
    if len(a) == 0:
        return 0
    else:
        [sum := sum + num for num in a]
        
    return sum