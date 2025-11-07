public class RecursionEasy {

    public static void main(String[] args) {
         System.out.println(myPow(2,-2));
        
    }
// Brute Force Implementation (by striver Code)
            public static double myPowBrute(double x, int n) {
                //your code goes here
                if(n == 0 || x == 1.0) return 1;

                long temp=n;
                
                if(n<0)
                {
                    x = 1/x;
                    temp =-1L * n;
                    
                }

                double ans = 1;
                for (long i=0; i < temp; i++)
                {
                    ans*=x;
                }
                return ans;
            }

public static double myPow(double x, int n) {
    //   To avoid integer overflow problem when n = integer.MIN_VALUE;
      long temp=n;
      double ans=1;

      if(n<0)
      {
        x=1/x;
        temp = -1*n;
      }
      while (temp>0)
      {
        if(temp%2==1)
        {
           ans*=x;
           temp=temp-1;
        }
        else
        {
          x=x*x;
          temp=temp/2;
        }
          
        
      }
      return ans;

          
    }
}
