def hotpo(n):
    result = n
    count = 0
    if n == 1:
        return 0
    while result > 1:
        if result % 2 == 0:
            result = result /2
        else :
            result = 3 * result + 1
        count += 1
    return count