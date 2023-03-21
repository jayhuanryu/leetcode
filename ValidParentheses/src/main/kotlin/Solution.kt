import java.util.*

class Solution {
    fun isValid(s: String): Boolean {
        val container = Stack<Char>()
        s.map {
            when(it) {
                '(' -> {container.push(it)}
                '{' -> {container.push(it)}
                '[' -> {container.push(it)}
                ')' -> {
                    if (container.isEmpty()) return false
                    if (container.peek() == '(') {
                        container.pop()
                    } else {
                        return false
                    }
                }
                '}' -> {
                    if (container.isEmpty()) return false
                    if (container.peek() == '{') {
                        container.pop()
                    }
                    else {
                        return false
                    }
                }
                ']' -> {
                    if (container.isEmpty()) return false
                    if (container.peek() == '[') {
                        container.pop()
                    } else {
                        return false
                    }
                }
                else -> {return false}
            }
        }
        return container.isEmpty()
    }
}