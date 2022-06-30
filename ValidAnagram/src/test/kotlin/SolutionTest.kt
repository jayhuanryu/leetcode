import org.junit.Test
import kotlin.test.assertEquals

class SolutionTest {

    @Test
    fun `test1`() {
        val s = "anagram"
        val t = "nagaram"
        val expected = true

        assertEquals(expected, Solution.isAnagram(s,t))
    }


    @Test
    fun `test2`() {
        val s = "rat"
        val t = "car"
        val expected = false

        assertEquals(expected, Solution.isAnagram(s,t))
    }
}