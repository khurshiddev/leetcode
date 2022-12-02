class Solution {
    // you need treat n as an unsigned value
    fun hammingWeight(n: Int): Int {
        // return Integer.bitCount(n) // Solution-1

        var num = n
        var count = 0

        while (num != 0) {
            if (num and 1 != 0) {
                count++
            }
            num = num shl 1
        }
        return count
    }
}




