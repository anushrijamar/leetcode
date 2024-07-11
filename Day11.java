class Solution {
    public String reverseParentheses(String s) {
        ArrayList<Integer> al=new ArrayList<>();
        char[] a=new char[s.length()];
        a=s.toCharArray();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<a.length;i++)
        {
            if(a[i]=='(')
            {
                st.push('(');
                if(i!=a.length-1)
                al.add(i+1);
            }
            else if(a[i]==')' && !st.isEmpty())
            {
                st.pop();
                int index=i;
                // if(al.size()!=0)
                index=al.remove(al.size()-1);
                check(a,index,i-1);
                // System.out.println("mdifed"+Arrays.toString(a));
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<='z' && a[i]>='a')
            sb.append(a[i]);
        }
        return sb.toString();
    }
    public static void check(char[] a,int i,int j)
    {
        while(i<j)
        {
            char temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;j--;
        }
    }
}
