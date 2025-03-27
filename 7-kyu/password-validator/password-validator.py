import re
def password(st):
    if len(st) < 8:
        return False
    p = re.compile(r'(?=.*\d)(?=.*[a-z])(?=.*[A-Z])')
    return bool(p.match(st))