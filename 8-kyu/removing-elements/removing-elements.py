def remove_every_other(my_list):
    output_list = []
    if len(my_list) == 1:
        return my_list
    else:
        for i in range(0,len(my_list), 2):
            output_list.append(my_list[i])
        
    return output_list
​