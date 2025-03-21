def digital_root(n):
    result = 0;
    for elem in str(n):
        result = result + int(elem)
        
    if len(str(result)) > 1:
        return digital_root(result)
    else:
        return result