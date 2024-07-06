//Pass the pillow

public class Day6 {
  
        public int passThePillow(int n, int time) {
            n=n-1;
            int rem=time%n;
            int o=time/n;
            if(o%2!=0)
            {
                return n-rem+1;
            }
                return rem+1;  
        }
    
}
