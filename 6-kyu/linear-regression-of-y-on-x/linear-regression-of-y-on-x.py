import numpy as np
def regression_line(x, y):
    """ Return the a (intercept)
        and b (slope) of Regression Line 
        (Y on X).
    """
​
    m, b = np.polyfit(x, y, 1)
    
    return (round(b, 4), round(m, 4))
​