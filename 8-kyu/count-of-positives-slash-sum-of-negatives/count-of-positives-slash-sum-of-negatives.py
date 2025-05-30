def count_positives_sum_negatives(arr):
    count = 0
    sum = 0
    if not arr:
        return []
    else:
        for num in arr:
            if num <0:
                sum += num
            else:
                if num > 0:
                    count += 1
                
        return [count, sum]