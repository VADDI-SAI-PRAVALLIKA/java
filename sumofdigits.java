import java.util.*;
 
public class sumofdigits
{
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int t=0;
      int r;
      while(n>0)
      {
          r=n%10;
          t=t+r;
          n=n/10;
      }
      System.out.println(t);
    }
}
