import java.lang.Integer.max
import java.lang.Integer.min
import java.lang.Math.abs


object Solution {

    fun maxArea(height: IntArray): Int {
        var maxArea = 0

        // settings
        val indexOfValueMap = mutableMapOf<Int, ArrayList<Int>>()
        for (i in height.indices) {
            if (indexOfValueMap[height[i]] != null) {
                var mutableList = indexOfValueMap[height[i]]!!
                mutableList.add(i)
                indexOfValueMap[height[i]] = mutableList
            }
            else {
                indexOfValueMap[height[i]] = arrayListOf(i)
            }
        }


        val newIndex = height.sortedArrayDescending()
        var previousArray = indexOfValueMap[newIndex[0]]
        var tempArea = 0
        if (previousArray!!.size > 1) {
            maxArea = newIndex[0] * (abs(previousArray[previousArray.size-1] - previousArray[0]))
        }


        for (i in 1 until newIndex.size) {
            val currentArray = indexOfValueMap[newIndex[i]]!!

            // height -> newIndex[i]
            // base -> (max of previoius/current array) - (min of previous/current array)
            tempArea = newIndex[i] * (max(previousArray!![previousArray.size-1], currentArray[currentArray.size-1]) - min(previousArray[0], currentArray[0]))
            if (tempArea > maxArea)
                maxArea = tempArea


            previousArray = currentArray
        }



        return maxArea
    }

    // area (diff of x-axis) * min of height
}