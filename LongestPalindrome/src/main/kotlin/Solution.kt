object Solution {

    fun longestPalindrome(s: String): String {

        var longestPalindrome =""

        for (i in s.indices) {

            var index = 0
            while ( i-index >= 0 && i+index < s.length) {

                if (s[i-index] == s[i+index]) {

                    // checking the odd number of palindrome
                    val tempString = s.substring(i-index, i+index+1)
                    if (tempString.length > longestPalindrome.length) {
                        longestPalindrome = tempString
                    }
                    index++
                }
                else {
                    if (s[i-index] == s[i+index+1]) {

                        // checking the even number of palindrome
                        val tempString = s.substring(i-index, i+index+1)
                        if (tempString.length > longestPalindrome.length) {
                            longestPalindrome = tempString
                        }
                        index++
                    }
                    else {
                        break
                    }


                }
            }
        }

        return longestPalindrome
    }
}