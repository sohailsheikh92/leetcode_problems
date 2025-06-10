class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;

        List<ListNode> oddList = new ArrayList<>();
        List<ListNode> evenList = new ArrayList<>();

        ListNode temp = head;
        int idx = 1;

        while (temp != null) {
            if (idx % 2 != 0) {
                oddList.add(temp);
            } else {
                evenList.add(temp);
            }
            temp = temp.next;
            idx++;
        }

        // Link all odd nodes
        for (int i = 0; i < oddList.size() - 1; i++) {
            oddList.get(i).next = oddList.get(i + 1);
        }

        // Link all even nodes
        for (int i = 0; i < evenList.size() - 1; i++) {
            evenList.get(i).next = evenList.get(i + 1);
        }

        // Connect end of odd list to start of even list
        if (!oddList.isEmpty()) {
            oddList.get(oddList.size() - 1).next = evenList.isEmpty() ? null : evenList.get(0);
        }

        // End the even list
        if (!evenList.isEmpty()) {
            evenList.get(evenList.size() - 1).next = null;
        }

        return oddList.get(0);
    }
}
