import java.util.*;
import Greater.great;

public class Main{
    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
       int n1=sc.nextInt();
       int n2=sc.nextInt();
       int n3=sc.nextInt();
       great.findGreater(n1, n2, n3);
       sc.close(); 
    }
}