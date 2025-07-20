sentence = "@Python is a computer programming language."
noofwords = 1
noofcapital = 0
noofsmall = 0
noofsymbols = 0
for i in range(0, len(sentence)):
    if (sentence[i] == ' '):
        noofwords = noofwords + 1
    elif (sentence[i].islower()):
        noofsmall = noofsmall + 1
    elif (sentence[i].isupper()):
        noofcapital = noofcapital + 1
    elif ((not sentence[i].isalnum()) and (sentence[i] != ' ') and sentence[i] != '.'):
        noofsymbols = noofsymbols + 1

print(f"Sentence = {sentence}\nNumber Of Words = {noofwords}\nNumber Of Capital Letter = {noofcapital}\nNumber Of Small Letter = {noofsmall}\nNumber Of Special Symbols = {noofsymbols}")
