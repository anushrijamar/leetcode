//Three consecutive ones.
class Day1 {
    public boolean threeConsecutiveOdds(int[] arr) {
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=arr[i]%2;
        }
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==1)
            {
                count+=1;
                if(count==3)
                return true;
            }
            else
            {
                count=0;
            }
        }
        return false;
    }
}