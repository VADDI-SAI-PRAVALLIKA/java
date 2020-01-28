import java.util.*;
public class Floyds {
    public static void main(String args[]) {
        
      if(args.length>0)
      {
          int n=Integer.parseInt(args[0]);
          for(int i=0;i<=n;i++)
          {
              
              for(int j=1;j<=i;j++)
              {
                  System.out.print(" * ");
              }
              System.out.print("\n");
          }
      }
      else
      System.out.println("enter a number ");
    }
}