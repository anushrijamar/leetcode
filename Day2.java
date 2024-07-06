//Intersection of Two arrays.

import java.util.ArrayList;
import java.util.Arrays;

public class Day2 {
   public int[] intersect(int[] nums1, int[] nums2) {
        int i=0,j=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> al=new ArrayList<>();
        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i]==nums2[j])
            {
                al.add(nums1[i]);
                i++;j++;
            }
            else if(nums1[i]<nums2[j])
            {
                i++;
            }
            else
            {
                j++;
            }
        }
        int[] a=new int[al.size()];
        int k=0;
        for(int n:al)
        {
            a[k++]=n;
        }
        return a;
    }
}
