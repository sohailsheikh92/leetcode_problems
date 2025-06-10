/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode temp=head;
        ArrayList<Integer> al=new ArrayList<>();
        while(temp!=null){
            al.add(temp.val);
            temp=temp.next;
        }
        int i=0,j=al.size()-1;
        while(i<j){
            if(al.get(i)!=al.get(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}