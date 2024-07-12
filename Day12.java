class Solution {
    public int maximumGain(String s, int x, int y) {
        Stack<Character> st=new Stack<>();
        int count=0;
        StringBuilder sb=new StringBuilder();
        if(x>y)
        {
            for(int i=0;i<s.length();i++)
            {
                if(!st.isEmpty() && s.charAt(i)=='b' && st.peek()=='a')
                {
                    count+=x;
                    st.pop();
                }
                else
                {
                    st.push(s.charAt(i));
                }
            }
            String k=get(st);
            for(int i=0;i<k.length();i++)
            {
                if(!st.isEmpty() && k.charAt(i)=='a' && st.peek()=='b')
                {
                    count+=y;
                    st.pop();
                }
                else
                {
                    st.push(k.charAt(i));
                }
            }
        }
        else
        {
             for(int i=0;i<s.length();i++)
            {
                if(!st.isEmpty() && s.charAt(i)=='a' && st.peek()=='b')
                {
                    count+=y;
                    st.pop();
                }
                else
                {
                    st.push(s.charAt(i));
                }
            }
            String k=get(st);
            for(int i=0;i<k.length();i++)
            {
                if(!st.isEmpty() && k.charAt(i)=='b' && st.peek()=='a')
                {
                    count+=x;
                    st.pop();
                }
                else
                {
                    st.push(k.charAt(i));
                }
            }
        }
        return count;
    }
    public static String get(Stack<Character> st)
    {
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty())
        {
            sb.append(st.pop());
        } 
        sb.reverse();
        return sb.toString();
    }
}
