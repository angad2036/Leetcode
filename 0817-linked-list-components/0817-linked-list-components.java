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
    public int numComponents(ListNode head, int[] nums) {
        HashSet<Integer> result = new HashSet<>();
        for(int x: nums){
            result.add(x);
        }
        ListNode curr=head;
        int count=0;
        while(curr!=null){
            if(result.contains(curr.val)){
                if(curr.next==null || !result.contains(curr.next.val)){
                    count++;
                }
            }
            curr=curr.next;
        }
        return count;
    }
}