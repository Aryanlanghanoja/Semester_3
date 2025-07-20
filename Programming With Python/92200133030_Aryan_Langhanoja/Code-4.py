import math


def isAp(inputlist):
    power = math.log2(inputlist[1])
    if (inputlist[1] % 2 != 0):
        return False

    for i in range(1, len(inputlist)):
        if ((math.log10(inputlist[i]) / math.log10(i + 1)) != power):
            return False
    return True


print(
    f"Answer For [1, 8, 27, 64] :- {isAp([1, 8, 27, 64])}\nAnswer For [1, 3, 7, 2] :- {isAp([1,3,7,2])}")
