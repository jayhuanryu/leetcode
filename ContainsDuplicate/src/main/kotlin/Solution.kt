class Solution {


    fun containsDuplicate(nums: IntArray): Boolean {
        val setOfInt = mutableSetOf<Int>()
        nums.map {
            setOfInt.add(it)
        }

        return setOfInt.size != nums.size
    }
}