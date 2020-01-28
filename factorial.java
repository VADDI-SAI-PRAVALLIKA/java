import java.util.*;
public class factorial {
    public static void main(String args[]) {
        
      if(args.length>0)
      {
          int a=Integer.parseInt(args[0]);
          int fact=1;
          int i=1;
          do
          {
              fact=fact*i;
              i++;
          }
          while (i<=a);
          System.out.println(fact);
      }
      else
      System.out.println("enter a number ");
    }
}