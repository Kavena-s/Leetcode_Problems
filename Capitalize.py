class Solution(object):
    def capitalizeTitle(self, title):
        arr = title.split()
        for i in range(len(arr)):
            if len(arr[i]) <=2:
                arr[i] = arr[i].lower()
            else:
                arr[i] = arr[i].lower()
                arr[i] = arr[i].title()
        temp = " ".join(arr)
        return temp
        
