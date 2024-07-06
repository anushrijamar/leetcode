//Merge nodes between two 0's



//   Definition for singly-linked list.
  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

public class Day4 {
    public ListNode mergeNodes(ListNode head) {
        ListNode temp=head,prev=head;
        int sum=0;boolean flag=false;
        while(temp!=null)
        {
            if(temp.val==0)
            {
                if(flag)
                {
                    prev.next=temp;
                    temp.val=sum;
                    sum=0;     
                }
                  flag=true;
                  prev=temp;
                
            }
            else
             sum+=temp.val;
            temp=temp.next;
        }
        return head.next;
    }
}
