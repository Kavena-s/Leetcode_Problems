class Solution(object):
    def numberOfSpecialChars(self, word):
        temp = set(word)
        temp = list(temp)
        count = 0
        for i in range(len(temp)):
            for j in range(i+1,len(temp),1):
                if (temp[i].isupper() and temp[j].islower()) or (temp[i].islower() and temp[j].isupper()):
                    if (temp[i] == temp[j].upper()) or (temp[i].upper() == temp[j]):
                        count += 1
                        break
        return count
