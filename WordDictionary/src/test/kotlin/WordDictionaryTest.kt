import kotlin.test.Test
import kotlin.test.assertEquals

class WordDictionaryTest {

    @Test
    fun `test1`() {
        val wordDictionary = WordDictionary()
        wordDictionary.addWord("bad");
        wordDictionary.addWord("dad");
        wordDictionary.addWord("mad");
        assertEquals(wordDictionary.search("pad"), false)
    }
    @Test
    fun `test2`() {
        val wordDictionary = WordDictionary()
        wordDictionary.addWord("bad");
        wordDictionary.addWord("dad");
        wordDictionary.addWord("mad");
        assertEquals( wordDictionary.search("bad"), true) // return True

    }
    @Test
    fun `test3`() {
        val wordDictionary = WordDictionary()
        wordDictionary.addWord("bad");
        wordDictionary.addWord("dad");
        wordDictionary.addWord("mad");
        assertEquals( wordDictionary.search(".ad"), true) // return True

    }
    @Test
    fun `test4`() {
        val wordDictionary = WordDictionary()
        wordDictionary.addWord("bad");
        wordDictionary.addWord("dad");
        wordDictionary.addWord("mad");
        assertEquals( wordDictionary.search("b.."), true) // return True
    }
}