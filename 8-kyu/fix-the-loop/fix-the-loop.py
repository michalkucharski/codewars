def list_animals(animals):
    lst = ""
    cnt = 0
    for elem in animals:
        lst += str(cnt + 1) + ". " + animals[cnt] + '\n'
        cnt += 1
    return lst