import random as r

text = input('Enter some text here: ')
output = ''

for i in text:
    w = r.randint(0, 9)
    if w<6:
        output += i.lower()
    else:
        output += i.upper()

print(output)