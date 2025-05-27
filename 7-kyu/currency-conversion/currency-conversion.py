​
import re
def convert_my_dollars(usd, currency):
    pass # use CONVERSION_RATES dictionary
    print(CONVERSION_RATES)
    print(usd)
    money = 0
    conversion = CONVERSION_RATES.get(currency)
    
    if conversion == 10000:
        money =  CONVERSION_RATES.get(currency) * usd
    else:
        if re.match("^[01]+$", str(conversion)):
            money = int(str(conversion), 2) * usd
        else:
            money =  CONVERSION_RATES.get(currency) * usd
    return "You now have " + str(money) + " of " + currency + "."