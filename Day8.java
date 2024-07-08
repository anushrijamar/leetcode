class Day8{
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            al.add(i+1);
        }
        int i=k-1;k--;
        while(al.size()!=1)
        {
            // System.out.println("Setting"+al.get((i+k)%al.size()));
            al.remove(i);
            i=(i+k)%al.size();
            System.out.println(al);
        }
        return al.get(0);
    }
}
