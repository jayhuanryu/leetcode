class Solution {

    fun longestCommonPrefix(strs: Array<String>): String {
        var prefix = strs[0]
        var curIndex = 1;

        while(prefix.length >= 0 && curIndex < strs.size ) {

            var curWord = strs[curIndex]
            val cap = if (prefix.length > curWord.length) curWord.length else prefix.length
            prefix = prefix.removeRange(cap, prefix.length)
            for (i in 0 until cap) {
                if (prefix[i] != curWord[i]) {
                    prefix = prefix.removeRange(i, prefix.length)
                    break
                }
            }

            curIndex++
        }

        return prefix
    }

}