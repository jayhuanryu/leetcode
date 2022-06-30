object Solution {

    fun isAnagram(s: String, t: String): Boolean {
        return if (s.length != t.length)
            false
        else {
            val sLetterCount = intArrayOf(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)
            val tLetterCount = intArrayOf(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)

            for (i in s.indices) {

                val index : Int = s[i].minus('a')

                sLetterCount[ s[i].minus('a') ] ++
                tLetterCount[ t[i].minus('a') ] ++
            }

            sLetterCount.contentEquals(tLetterCount)

        }
    }

}

// runtime : 264ms
// memory : 39mb