import re
def ensure_question(s):
    # Code here
    if s == "":
        return "?"
    if s[-1] == "?":
        return s
    
    return s + "?"