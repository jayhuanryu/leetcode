class ListNode (var value : Int) {
    var next: ListNode? = null
}
class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {

        val head = ListNode(0)
        var temp1 = l1
        var temp2 = l2
        var cur = head
        var cnt = 0

        while (temp2 != null || temp1 != null) {
            val x = temp1?.`val` ?: 0
            val y = temp2?.`val` ?: 0

            val temp = x+y+cnt
            cnt = temp/10
            cur.next = ListNode(temp%10)
            cur = cur.next
            if (temp1 != null) temp1 = temp1?.next
            if (temp2 != null) temp2 = temp2?.next
        }
        if (cnt > 0) {
            cur.next = ListNode(cnt)
        }
        return head.next
    }
}