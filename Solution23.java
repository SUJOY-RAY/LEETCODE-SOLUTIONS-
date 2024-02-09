import java.util.PriorityQueue;
class Solution {
    
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> minHeap=new PriorityQueue<>((a,b)->a.val-b.val);

        for(ListNode list:lists){
            if(list!=null){
                minHeap.add(list);
            }
        }

        ListNode dummy=new ListNode();
        ListNode current=dummy;

        while(!minHeap.isEmpty()){
            ListNode node=minHeap.poll();
            current.next=node;
            current=current.next;
            if(node.next!=null){
                minHeap.add(node.next);
            }
        }
        return dummy.next;
    }
}
