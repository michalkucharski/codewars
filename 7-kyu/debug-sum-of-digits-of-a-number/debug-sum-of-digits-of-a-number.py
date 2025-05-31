def get_sum_of_digits(num):
    sum = 0
    digits = list(map(int, str(num)))
    for x in digits:
        sum = sum +  x
    return sum