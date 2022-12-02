package leetCode

class Solution {
    fun subtractProductAndSum(n: Int): Int {
        var sum = 0
        var pro = 1

        var icn = n

        while (icn >0){
            val now = icn % 10
            sum+=now
            pro*=now
            icn /= 10
        }
        return pro - sum



    }
}





//class Solution:
//    def subtractProductAndSum(self, n: int) -> int:
//sum, product = 0, 1
//while n:
//digit = n % 10
//sum += digit
//product *= digit
//n //= 10
//return product -