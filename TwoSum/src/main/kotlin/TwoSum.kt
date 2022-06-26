class TwoSum {

    companion object {
        fun twoSum(nums: IntArray, target: Int): IntArray {
            val setNum = mutableMapOf<Int, Int>()
            var answerSet = mutableSetOf<Int>()
            // create a map (value, index) so we can find the index easily
            nums.mapIndexed { it, value -> setNum.put(value, it) }
            nums.mapIndexed { it, value ->
                val diff = target - value
                if (setNum[diff] != null && setNum[diff] != it) {
                    answerSet.add(it)
                    answerSet.add(setNum[diff]!!)
                }

            }
            return answerSet.toIntArray()
        }
    }
}