//Biggest and smallest difference after three moves

import java.util.Arrays;

public class Day3 {
    public int minDifference(int[] nums) {
        Arrays.sort(nums);
        if(nums.length<=4)
        return 0;
        int one=nums[nums.length-4]-nums[0];
        int two=nums[nums.length-1]-nums[3];
        int min=Math.min(one,two);
        int three=nums[nums.length-2]-nums[2];
        min=Math.min(three,min);
        int four=nums[nums.length-3]-nums[1];
        return Math.min(four,min);
    }
}
