class ListNode {
    int val;
    ListNode next;
    
    public ListNode(int val) {
        this.val=val;
    }
}

class MyLinkedList {
    ListNode head;
    int size;

    public MyLinkedList() {
        head=null;
        size=0;
    }
    
    public int get(int index) {
        if (index< 0 || index>= size)
            return -1;
        ListNode curr=head;
        for (int i=0; i< index; i++)
            curr=curr.next;
        return curr.val;
    }
    
    public void addAtHead(int val) {
        ListNode newNode=new ListNode(val);
        newNode.next=head;
        head=newNode;
        size++;
    }

public void addAtTail(int val) {
    if (head == null) {
        addAtHead(val);
        return;
    }
    ListNode newNode=new ListNode(val);
    ListNode curr=head;
    while (curr.next != null)
        curr=curr.next;
    curr.next=newNode;
    size++;
}

    public void addAtIndex(int index, int val) {
        if (index< 0 ||index> size)
            return;
        if (index == 0) {
            addAtHead(val);
            return;
        }
        ListNode newNode=new ListNode(val);
        ListNode prev=null;
        ListNode curr=head;
        for (int i=0; i< index; i++) {
            prev=curr;
            curr=curr.next;
        }
        newNode.next=curr;
        prev.next=newNode;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if (index< 0 || index>= size)
            return;
        if (index == 0) {
            head=head.next;
            size--;
            return;
        }
        ListNode prev=null;
        ListNode curr=head;
        for (int i=0; i< index; i++) {
            prev=curr;
            curr=curr.next;
        }
        prev.next=curr.next;
        size--;
    }
}
