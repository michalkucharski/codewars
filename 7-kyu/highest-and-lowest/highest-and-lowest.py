def high_and_low(numbers):
    # ...
    
    numlst =list(map(int,  numbers.split()))
​
    
    numlstSort = sorted(numlst)
    print(numlstSort)
    max_el = numlstSort[-1]
    min_el = numlstSort[0]
    return str(max_el) + " " + str(min_el)
​