import re
def alphabet_position(text):
    letters = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z']
    numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26]
    
    dictionary = {}
    
    for i in range(0, len(numbers)):
        dictionary[letters[i]] = numbers[i]
        
    
    text2 = re.sub(r'[^a-zA-Z]', '', text)
    print(text2)
    text_arr = text2.split(" ")
    output = []
    for word in text_arr:
        for letter in word.lower():
            output.append(str(dictionary.get(letter)))
            
    return " ".join(output)
            
    