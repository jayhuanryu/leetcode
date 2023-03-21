object LongestPanlindrome {

    fun longestPalindrome(s: String): String {

        var longestPalindrome : String = ""

        for (i in s.indices) {
            putCharInList(s[i], i)
        }

        val listOfKeys = createAList()
        for (i in listOfKeys.indices) {
            val subList = listOfKeys[i]

            if (subList.size > 1) {

                for (j in subList.indices) {
                    for (k in j until subList.size) {
                        // j means the left index, k means the right index
                        val subString = s.substring(subList[j],subList[k]+1)
                        if (subString.length > longestPalindrome.length) {

                            if (isPalindrome(subString)) {
                                longestPalindrome = subString
                            }

                        }
                    }
                }
            }
            else {
                if (!subList.isNullOrEmpty() && longestPalindrome.length < 2) {
                    longestPalindrome = s[subList[0]].toString()
                }
            }
        }



        return longestPalindrome
    }

    fun putCharInList(character : Char, i : Int) {
        when(character) {
            'a' -> aIndices.add(i)
            'b' -> bIndices.add(i)
            'c' -> cIndices.add(i)
            'd' -> dIndices.add(i)
            'e' -> eIndices.add(i)
            'f' -> fIndices.add(i)
            'g' -> gIndices.add(i)
            'h' -> hIndices.add(i)
            'i' -> iIndices.add(i)
            'j' -> jIndices.add(i)
            'k' -> kIndices.add(i)
            'l' -> lIndices.add(i)
            'm' -> mIndices.add(i)
            'n' -> nIndices.add(i)
            'o' -> oIndices.add(i)
            'p' -> pIndices.add(i)
            'q' -> qIndices.add(i)
            'r' -> rIndices.add(i)
            's' -> sIndices.add(i)
            't' -> tIndices.add(i)
            'u' -> uIndices.add(i)
            'v' -> vIndices.add(i)
            'w' -> wIndices.add(i)
            'x' -> xIndices.add(i)
            'y' -> yIndices.add(i)
            'z' -> zIndices.add(i)
            'A' -> indicesA.add(i)
            'B' -> indicesB.add(i)
            'C' -> indicesC.add(i)
            'D' -> indicesD.add(i)
            'E' -> indicesE.add(i)
            'F' -> indicesF.add(i)
            'G' -> indicesG.add(i)
            'H' -> indicesH.add(i)
            'I' -> indicesI.add(i)
            'J' -> indicesJ.add(i)
            'K' -> indicesK.add(i)
            'L' -> indicesL.add(i)
            'M' -> indicesM.add(i)
            'N' -> indicesN.add(i)
            'O' -> indicesO.add(i)
            'P' -> indicesP.add(i)
            'Q' -> indicesQ.add(i)
            'R' -> indicesR.add(i)
            'S' -> indicesS.add(i)
            'T' -> indicesT.add(i)
            'U' -> indicesU.add(i)
            'V' -> indicesV.add(i)
            'W' -> indicesW.add(i)
            'X' -> indicesX.add(i)
            'Y' -> indicesY.add(i)
            'Z' -> indicesZ.add(i)
            '0' -> indices0.add(i)
            '1' -> indices1.add(i)
            '2' -> indices2.add(i)
            '3' -> indices3.add(i)
            '4' -> indices4.add(i)
            '5' -> indices5.add(i)
            '6' -> indices6.add(i)
            '7' -> indices7.add(i)
            '8' -> indices8.add(i)
            '9' -> indices9.add(i)

        }
    }
    
    val aIndices = mutableListOf<Int>()
    val bIndices = mutableListOf<Int>()
    val cIndices = mutableListOf<Int>()
    val dIndices = mutableListOf<Int>()
    val eIndices = mutableListOf<Int>()
    val fIndices = mutableListOf<Int>()
    val gIndices = mutableListOf<Int>()
    val hIndices = mutableListOf<Int>()
    val iIndices = mutableListOf<Int>()
    val jIndices = mutableListOf<Int>()
    val kIndices = mutableListOf<Int>()
    val lIndices = mutableListOf<Int>()
    val mIndices = mutableListOf<Int>()
    val nIndices = mutableListOf<Int>()
    val oIndices = mutableListOf<Int>()
    val pIndices = mutableListOf<Int>()
    val qIndices = mutableListOf<Int>()
    val rIndices = mutableListOf<Int>()
    val sIndices = mutableListOf<Int>()
    val tIndices = mutableListOf<Int>()
    val uIndices = mutableListOf<Int>()
    val vIndices = mutableListOf<Int>()
    val wIndices = mutableListOf<Int>()
    val xIndices = mutableListOf<Int>()
    val yIndices = mutableListOf<Int>()
    val zIndices = mutableListOf<Int>()
    val indicesA = mutableListOf<Int>()
    val indicesB = mutableListOf<Int>()
    val indicesC = mutableListOf<Int>()
    val indicesD = mutableListOf<Int>()
    val indicesE = mutableListOf<Int>()
    val indicesF = mutableListOf<Int>()
    val indicesG = mutableListOf<Int>()
    val indicesH = mutableListOf<Int>()
    val indicesI = mutableListOf<Int>()
    val indicesJ = mutableListOf<Int>()
    val indicesK = mutableListOf<Int>()
    val indicesL = mutableListOf<Int>()
    val indicesM = mutableListOf<Int>()
    val indicesN = mutableListOf<Int>()
    val indicesO = mutableListOf<Int>()
    val indicesP = mutableListOf<Int>()
    val indicesQ = mutableListOf<Int>()
    val indicesR = mutableListOf<Int>()
    val indicesS = mutableListOf<Int>()
    val indicesT = mutableListOf<Int>()
    val indicesU = mutableListOf<Int>()
    val indicesV = mutableListOf<Int>()
    val indicesW = mutableListOf<Int>()
    val indicesX = mutableListOf<Int>()
    val indicesY = mutableListOf<Int>()
    val indicesZ = mutableListOf<Int>()
    val indices0 = mutableListOf<Int>()
    val indices1 = mutableListOf<Int>()
    val indices2 = mutableListOf<Int>()
    val indices3 = mutableListOf<Int>()
    val indices4 = mutableListOf<Int>()
    val indices5 = mutableListOf<Int>()
    val indices6 = mutableListOf<Int>()
    val indices7 = mutableListOf<Int>()
    val indices8 = mutableListOf<Int>()
    val indices9 = mutableListOf<Int>()

    fun createAList() : List<List<Int>> {
        var listOfALists = mutableListOf<List<Int>>()
        listOfALists.add(aIndices)
        listOfALists.add(bIndices)
        listOfALists.add(cIndices)
        listOfALists.add(dIndices)
        listOfALists.add(eIndices)
        listOfALists.add(fIndices)
        listOfALists.add(gIndices)
        listOfALists.add(hIndices)
        listOfALists.add(iIndices)
        listOfALists.add(jIndices)
        listOfALists.add(kIndices)
        listOfALists.add(lIndices)
        listOfALists.add(mIndices)
        listOfALists.add(nIndices)
        listOfALists.add(oIndices)
        listOfALists.add(pIndices)
        listOfALists.add(qIndices)
        listOfALists.add(rIndices)
        listOfALists.add(sIndices)
        listOfALists.add(tIndices)
        listOfALists.add(uIndices)
        listOfALists.add(vIndices)
        listOfALists.add(wIndices)
        listOfALists.add(xIndices)
        listOfALists.add(yIndices)
        listOfALists.add(zIndices)
        listOfALists.add(indicesA)
        listOfALists.add(indicesB)
        listOfALists.add(indicesC)
        listOfALists.add(indicesD)
        listOfALists.add(indicesE)
        listOfALists.add(indicesF)
        listOfALists.add(indicesG)
        listOfALists.add(indicesH)
        listOfALists.add(indicesI)
        listOfALists.add(indicesJ)
        listOfALists.add(indicesK)
        listOfALists.add(indicesL)
        listOfALists.add(indicesM)
        listOfALists.add(indicesN)
        listOfALists.add(indicesO)
        listOfALists.add(indicesP)
        listOfALists.add(indicesQ)
        listOfALists.add(indicesR)
        listOfALists.add(indicesS)
        listOfALists.add(indicesT)
        listOfALists.add(indicesU)
        listOfALists.add(indicesV)
        listOfALists.add(indicesW)
        listOfALists.add(indicesX)
        listOfALists.add(indicesY)
        listOfALists.add(indicesZ)
        listOfALists.add(indices0)
        listOfALists.add(indices1)
        listOfALists.add(indices2)
        listOfALists.add(indices3)
        listOfALists.add(indices4)
        listOfALists.add(indices5)
        listOfALists.add(indices6)
        listOfALists.add(indices7)
        listOfALists.add(indices8)
        listOfALists.add(indices9)

        return listOfALists
    }

    fun isPalindrome(subString : String) : Boolean {

        var firstHalf = ""
        var secondHalf = ""

        if (subString.length % 2 == 1) {
            // odd
            firstHalf = subString.substring(0, subString.length/2)
            secondHalf = subString.substring(subString.length/2+1, subString.length)

        }
        else {
            // even
            val middle = subString.length / 2
            firstHalf = subString.substring(0, subString.length/2)
            secondHalf = subString.substring(subString.length/2, subString.length)
        }

        return firstHalf.reversed() == secondHalf

    }

}