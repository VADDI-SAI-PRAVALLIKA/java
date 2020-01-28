import java.util.*;
 
public class posneg
{
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();
  if(a>0)
  {
    System.out.println(a+" is a positive number");
  }
  else if(a<0)
  {
    System.out.println(a+" is a negative number");
  }
  else if(a==0)
  {
    System.out.println(a+" is a neither positive nor negative number");
  }
 
    }
}
