public class test21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode list = new ListNode(0);
        ListNode ls = list;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                ls.next = l1;
                l1 = l1.next;
                ls = ls.next;
            } else {
                ls.next = l2;
                l2 = l2.next;
                ls = ls.next;
            }

        }
        ls.next=(l1==null)?l2:l1;
        return list.next;

    }

}
