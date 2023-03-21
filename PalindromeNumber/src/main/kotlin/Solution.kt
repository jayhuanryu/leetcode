class Solution {

    fun isPalindrome(x : Int) : Boolean {
        val converted = x.toString()
        val index = converted.length / 2
        for (i in 0..index) {
            if (converted[i] != converted[converted.length-i-1])
                return false
        }
        return true
    }
}