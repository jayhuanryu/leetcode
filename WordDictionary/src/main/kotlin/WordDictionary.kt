class WordDictionary {

    val container = mutableSetOf<String>()

    fun addWord(word: String) {
        container.add(word.toLowerCase())
    }

    fun search(word: String): Boolean {
        val regEx = word.toLowerCase().toRegex()
        container?.map {it ->
            if (regEx.matches(it))
                return true
        }
        return false;
    }


}
