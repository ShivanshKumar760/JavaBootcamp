
import java.util.*;
public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int userInput=sc.nextInt();
        // int limit=sc.nextInt();

        if(userInput==1)
        {
            System.out.println("isPrime");
        }
        for(int i=2;i<=userInput;i++)
        {
            if(userInput%i==0)
            {
                continue;
            }
            else if(i==n)
            {
                System.out.println("isPrime");
            }
        }
    }
    
}
