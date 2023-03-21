class Solution {

    fun romanToInt(s: String): Int {
        var romanNum = 0

        val lastIndexOfM = s.lastIndexOf('M')
        val lastIndexOfD = s.lastIndexOf('D')
        val lastIndexOfC = s.lastIndexOf('C')
        val lastIndexOfL = s.lastIndexOf('L')
        val lastIndexOfX = s.lastIndexOf('X')
        val lastIndexOfV = s.lastIndexOf('V')

        s.mapIndexed { index, it ->
            if ( index <= lastIndexOfM ) {
                if (it == 'C')
                    romanNum -= 100
                else
                    romanNum += 1000
            } else if (index in (lastIndexOfM + 1)..lastIndexOfD) {
                if (it == 'C')
                    romanNum -= 100
                else
                    romanNum += 500
            } else if (index in (lastIndexOfD + 1)..lastIndexOfC) {
                if (it == 'X')
                    romanNum -= 10
                else
                    romanNum += 100
            } else if (index in (lastIndexOfC + 1) .. lastIndexOfL) {
                if (it == 'X')
                    romanNum -= 10
                else
                    romanNum += 50
            } else if (index in lastIndexOfL + 1 .. lastIndexOfX) {
                if (it == 'I')
                    romanNum -= 1
                else
                    romanNum += 10
            } else if (index in lastIndexOfX+1 .. lastIndexOfV) {
                if (it == 'I')
                    romanNum -= 1
                else
                    romanNum += 5
            }
            else {
                romanNum+= 1
            }
        }

        return romanNum
    }

}