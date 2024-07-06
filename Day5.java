//The smallest and biggest difference in index of local minima or maxima.
import java.util.ArrayList;


public class Day5
{
    public int[] nodesBetweenCriticalPoints(ListNode head) {
    int count=0,min=Integer.MAX_VALUE;
        int[] a=new int[2];
        a[0]=-1;a[1]=-1;
        if(head==null || head.next==null || head.next.next==null)
        {
            return a;
        }
        ListNode temp=head.next,prev=head;
        ArrayList<Integer> al=new ArrayList<>();
        while(temp.next!=null)
        {
            if(temp.val<prev.val && temp.val<temp.next.val || temp.val>prev.val && temp.val>temp.next.val )
            {
                al.add(count);
            }
            count++;
            prev=temp;
            temp=temp.next;
        }
        System.out.println(al);
        if(al.size()<=1)
        return a;
        for(int i=1;i<al.size();i++)
        {
            min=Math.min(min,al.get(i)-al.get(i-1));
        }
        a[1]=al.get(al.size()-1)-al.get(0);
        a[0]=min;
        return a;
    }
}