class Solution {
    public double averageWaitingTime(int[][] customers) {
        int end=customers[0][0];
        double  sum=0;
        for(int i=0;i<customers.length;i++)
        {
            end=Math.max(end,customers[i][0])+customers[i][1];
            sum+=end-customers[i][0];
        }
        return sum/customers.length;
    }
}
