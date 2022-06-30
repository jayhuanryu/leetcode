import org.junit.Test
import kotlin.test.assertEquals

class SolutionTest {

    /**
     * Input: s = "babad"
     * Output: "bab" || "aba"
     */

    @Test
    fun `test1`() {
        val givenString = "babad"
        val expected = "aba"

        assertEquals(expected, Solution.longestPalindrome(givenString))
    }


    /**
     * Input: s = "cbbd"
     * Output: "bb"
     */

    @Test
    fun `test2`() {
        val givenString = "cbbd"
        val expected = "bb"

        assertEquals(expected, Solution.longestPalindrome(givenString))
    }

    @Test
    fun `test3`() {
        val givenString = "a"
        val expected = "a"

        assertEquals(expected, Solution.longestPalindrome(givenString))
    }

    @Test
    fun `test4`() {
        val givenString = "aaaa"
        val expected = "aaaa"

        assertEquals(expected, Solution.longestPalindrome(givenString))
    }

    @Test
    fun `test5`() {
        val givenString = "SQQSYYSQQS"
        val expected = "SQQSYYSQQS"

        assertEquals(expected, Solution.longestPalindrome(givenString))
    }

    @Test
    fun `test6`() {
        val givenString = "iopsajhffgvrnyitusobwcxgwlwniqchfnssqttdrnqqcsrigjsxkzcmuoiyxzerakhmexuyeuhjfobrmkoqdljrlojjjysfdslyvckxhuleagmxnzvikfitmkfhevfesnwltekstsueefbrddxrmxokpaxsenwlgytdaexgfwtneurhxvjvpsliepgvspdchmhggybwupiqaqlhjjrildjuewkdxbcpsbjtsevkppvgilrlspejqvzpfeorjmrbdppovvpzxcytscycgwsbnmspihzldjdgilnrlmhaswqaqbecmaocesnpqaotamwofyyfsbmxidowusogmylhlhxftnrmhtnnljjhhcfvywsqimqxqobfsageysonuoagmmviozeouutsiecitrmkypwknorjjiaasxfhsftypspwhvqovmwkjuehujofiabznpipidhfxpoustquzyfurkcgmioxacleqdxgrxbldcuxzgbcazgfismcgmgtjuwchymkzoiqhzaqrtiykdkydgvuaqkllbsactntexcybbjaxlfhyvbxieelstduqzfkoceqzgncvexklahxjnvtyqcjtbfanzgpdmucjlqpiolklmjxnscjcyiybdkgitxnuvtmoypcdldrvalxcxalpwumfx"

    }



    // Palindrome Test
    @Test
    fun `palindrometest1`() {
        val given = "555"
        val expected = true

        assertEquals(expected, Solution.isPalindrome(given))
    }

    @Test
    fun `palindrometest2`() {
        val given = "bb"
        val expected = true

        assertEquals(expected, Solution.isPalindrome(given))
    }




}