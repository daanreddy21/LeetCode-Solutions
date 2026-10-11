class Solution:
    def addDigits(self, num: int) -> int:
        n=num
        while n>9:
            sum=0
            while n>0:
                digit=n%10
                sum=sum+digit
                n=n//10
            n=sum
        return n
        