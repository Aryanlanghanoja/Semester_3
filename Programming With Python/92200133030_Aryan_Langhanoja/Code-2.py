input = "Cell-free massive MIMO major goal is to virtually assemble a massive MIMO system from a set of geographically."

words = []
substring = ''
for i in range(0, len(input)):
    if (input[i] != ' '):
        substring = substring + input[i]
    elif (input[i] == ' '):
        words.append(substring)
        substring = ''

uniquewords = list(set(words))

frequentlyusedwords = []

for i in range(0, len(uniquewords)):
    if (words.count(uniquewords[i]) >= 2):
        frequentlyusedwords.append(uniquewords[i])


print(f"Frequently Used Worlds In Strings Are :- {frequentlyusedwords}")
