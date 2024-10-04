import java.util.Scanner;
public class isPrime {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);

        //1) prime number
        System.out.println("enter your fav number");
        int number= sc.nextInt();
        
        int i;
        boolean isPrime=true;
        for(i=2; i<number; i++){
            if(number%i==0){
                isPrime=false;
                break;
            }
            else{
                isPrime=true;
            }              
        }

        if(isPrime)
        {
            System.out.println("is Prime number");
        }
        else{
            System.out.println("Is not prime");
        }



        //2:-2.	Program to check if a triangle is scalene, isosceles or equilateral
        



    }
} 
